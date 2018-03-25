package study.addressbook.tests;

import org.testng.annotations.Test;
import study.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

    @Test
    public void testContactModification() {
        app.getContactHelper().contactSelection();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillNewContactForm(new ContactData("Olya", "Ivanova", "oivan", "111111111", "svk@gmul.com"));
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().backToHomePage();
    }
}
