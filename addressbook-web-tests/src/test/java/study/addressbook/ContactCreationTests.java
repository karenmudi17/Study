package study.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{
    
    @Test
    public void newContactCreationTest() {
        initContactCreation();
        fillNewContactForm(new ContactData("Sveta", "Konina", "svkon", "111111111", "svk@gmul.com"));

    }

}
