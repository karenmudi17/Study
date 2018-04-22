package study.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import study.addressbook.model.ContactData;
import study.addressbook.model.GroupData;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase{


    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void fillNewContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"),contactData.getFirstName());
        type(By.name("lastname"),contactData.getLastName());
        type(By.name("nickname"),contactData.getNickname());
        type(By.name("mobile"),contactData.getPhone());
        type(By.name("email"),contactData.getEmail());

        if (creation){
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        }
        else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }


    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void acceptContactDeletion() {
        click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
        wd.switchTo().alert().accept();
    }

    public void contactSelection(int index) {
        wd.findElements(By.name("selected[]")).get(index).click();
    }

    public void initContactModification(int id) {
        wd.findElement(By.xpath(String.format("//tr[.//input[@value='%s']]/td[8]/a",id))).click();
}

    public void submitContactModification() {
        click(By.xpath("//div[@id='content']/form[1]/input[22]"));
    }

    public void backToHomePage() {
        if (isElementPresent(By.id("maintable"))) {
            return;}
        click(By.linkText("home"));
    }
    public void create(ContactData contact, boolean b) {
        initContactCreation();
        fillNewContactForm(contact,b);
    }

    public void delete(List<ContactData> before) {
        backToHomePage();
        contactSelection(before.size()-1);
        acceptContactDeletion();
        backToHomePage();
    }

    public void modify(List<ContactData> before, int index, ContactData contact) {
        backToHomePage();
        contactSelection(index);
        initContactModification(before.get(index).getId());
        fillNewContactForm(contact,false);
        submitContactModification();
        backToHomePage();
    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));
    }

    public int getContactCount() {
        return wd.findElements(By.name("selected[]")).size();
    }


    public List<ContactData> list() {
        List<ContactData> contacts = new ArrayList<ContactData>();
        List<WebElement> elements = wd.findElements(By.xpath("//tr[@name='entry']"));
        for (WebElement element : elements){
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            String firstName = element.findElement(By.xpath(String.format("//tr[.//input[@value='%s']]/td[3]", id))).getText();
            String lastName = element.findElement(By.xpath(String.format("//tr[.//input[@value='%s']]/td[2]", id))).getText();
            contacts.add(new ContactData().withId(id).withFirstName(firstName).withLastName(lastName));
        }
        return contacts;
    }

}
