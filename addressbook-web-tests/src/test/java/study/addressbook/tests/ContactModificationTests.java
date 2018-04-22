package study.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import study.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactModificationTests extends TestBase{

    @Test
    public void testContactModification() {
        app.goTo().backToHomePage();
        List<ContactData> before = app.getContactHelper().getContactList();
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("Sveta", "Konina", null, null, "svk@gmul.com", "studyGroup2"),true);
        }
        app.goTo().backToHomePage();
        app.getContactHelper().contactSelection(before.size()-1);
        app.getContactHelper().initContactModification(before.get(before.size() - 1).getId());
        ContactData contact = new ContactData(before.get(before.size() - 1).getId(), "Olya", "Ivanova", "oivan", "111111111", "svk@gmul.com", null);
        app.getContactHelper().fillNewContactForm(contact,false);
        app.getContactHelper().submitContactModification();
        app.goTo().backToHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size());

        before.remove(before.size() - 1);
        before.add(contact);
        Comparator<? super ContactData> byId = (c1,c2) -> Integer.compare(c1.getId(),c2.getId());
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before,after);
    }
}
