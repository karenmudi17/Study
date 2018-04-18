package study.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import study.addressbook.model.ContactData;

import java.util.List;

public class ContactModificationTests extends TestBase{

    @Test
    public void testContactModification() {
        app.getNavigationHelper().backToHomePage();
        List<ContactData> before = app.getContactHelper().getContactList();
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("Sveta", "Konina", null, null, "svk@gmul.com", "studyGroup2"),true);
        }
        app.getNavigationHelper().backToHomePage();
        app.getContactHelper().contactSelection(before.size()-1);
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillNewContactForm(new ContactData("Olya", "Ivanova", "oivan", "111111111", "svk@gmul.com", null), false);
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().backToHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size());
    }
}
