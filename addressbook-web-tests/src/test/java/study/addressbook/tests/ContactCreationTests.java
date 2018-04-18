package study.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import study.addressbook.model.ContactData;

import java.util.List;

public class ContactCreationTests extends TestBase {
    
    @Test
    public void newContactCreationTest() {
        app.getNavigationHelper().backToHomePage();
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().createContact(new ContactData("Sveta", "Konina", null, null, "svk@gmul.com", "studyGroup2"),true);
        app.getNavigationHelper().backToHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() + 1);
    }

}
