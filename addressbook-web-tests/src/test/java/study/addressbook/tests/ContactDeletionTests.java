package study.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import study.addressbook.model.ContactData;

import java.util.List;

public class ContactDeletionTests extends TestBase {
    
    @Test
    public void contactDeletion() {
        app.getNavigationHelper().backToHomePage();
        List<ContactData> before = app.getContactHelper().getContactList();
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("Sveta", "Konina", null, null, "svk@gmul.com", "studyGroup2"),true);
        }
        app.getNavigationHelper().backToHomePage();
        app.getContactHelper().contactSelection(before.size()-1);
        app.getContactHelper().acceptContactDeletion();
        app.getNavigationHelper().backToHomePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size()-1);

        before.remove(before.size()-1);
        Assert.assertEquals(before,after);

    }

}
