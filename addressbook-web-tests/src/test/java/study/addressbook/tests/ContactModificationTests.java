package study.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import study.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

    @Test
    public void testContactModification() {
        app.getNavigationHelper().backToHomePage();
        int before = app.getContactHelper().getContactCount();
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("Sveta", "Konina", null, null, "svk@gmul.com", "studyGroup2"),true);
        }
        app.getNavigationHelper().backToHomePage();
        app.getContactHelper().contactSelection();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillNewContactForm(new ContactData("Olya", "Ivanova", "oivan", "111111111", "svk@gmul.com", null), false);
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().backToHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after,before);
    }
}
