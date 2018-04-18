package study.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import study.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {
    
    @Test
    public void contactDeletion() {
        app.getNavigationHelper().backToHomePage();
        int before = app.getContactHelper().getContactCount();
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("Sveta", "Konina", null, null, "svk@gmul.com", "studyGroup2"),true);
        }
        app.getNavigationHelper().backToHomePage();
        app.getContactHelper().contactSelection(before);
        app.getContactHelper().acceptContactDeletion();
        app.getNavigationHelper().backToHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after,before-1);
    }

}
