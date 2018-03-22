package study.addressbook;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase{
    
    @Test
    public void contactDeletion() {
        contactSelection();
        acceptContactDeletion();
        backToHomePage();
    }

}
