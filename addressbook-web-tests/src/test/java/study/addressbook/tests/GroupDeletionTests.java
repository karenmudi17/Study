package study.addressbook.tests;

import org.testng.annotations.Test;


public class GroupDeletionTests extends TestBase {
    
    @Test
    public void groupDeletion() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getNavigationHelper().gotoGroupPage();
    }


}
