package study.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {
    
    @Test
    public void contactDeletion() {
        app.getContactHelper().contactSelection();
        app.getContactHelper().acceptContactDeletion();
        app.getNavigationHelper().backToHomePage();
    }

}
