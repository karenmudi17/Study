package study.addressbook;

import org.testng.annotations.Test;


public class GroupDeletionTests extends TestBase{
    
    @Test
    public void groupDeletion() {
        gotoGroupPage();
        selectGroup();
        deleteSelectedGroups();
        gotoGroupPage();
    }


}
