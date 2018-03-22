package study.addressbook.tests;

import org.testng.annotations.Test;


public class GroupDeletionTests extends TestBase {
    
    @Test
    public void groupDeletion() {
        app.gotoGroupPage();
        app.selectGroup();
        app.deleteSelectedGroups();
        app.gotoGroupPage();
    }


}
