package study.addressbook.tests;

import org.testng.annotations.Test;
import study.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {
    
    @Test
    public void newContactCreationTest() {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillNewContactForm(new ContactData("Sveta", "Konina", "svkon", "111111111", "svk@gmul.com"));

    }

}
