package study.addressbook.tests;

import org.testng.annotations.Test;
import study.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {
    
    @Test
    public void contactDeletion() {
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("Sveta", "Konina", null, null, "svk@gmul.com", "studyGroup2"),true);
        }
        app.getNavigationHelper().backToHomePage();
        app.getContactHelper().contactSelection();
        app.getContactHelper().acceptContactDeletion();
        app.getNavigationHelper().backToHomePage();
    }

}
