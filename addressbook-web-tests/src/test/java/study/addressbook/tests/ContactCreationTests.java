package study.addressbook.tests;

import org.testng.annotations.Test;
import study.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {
    
    @Test
    public void newContactCreationTest() {
        app.getContactHelper().createContact(new ContactData("Sveta", "Konina", null, null, "svk@gmul.com", "studyGroup2"),true);
    }

}
