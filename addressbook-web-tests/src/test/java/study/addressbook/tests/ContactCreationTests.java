package study.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import study.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {
    
    @Test
    public void newContactCreationTest() {
        app.getNavigationHelper().backToHomePage();
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().createContact(new ContactData("Sveta", "Konina", null, null, "svk@gmul.com", "studyGroup2"),true);
        app.getNavigationHelper().backToHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after,before+1);
    }

}
