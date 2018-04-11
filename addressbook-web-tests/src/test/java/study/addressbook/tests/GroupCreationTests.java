package study.addressbook.tests;

import org.testng.annotations.Test;
import study.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().createGroup(new GroupData("studyGroup2", null, "study2"));
    }

}
