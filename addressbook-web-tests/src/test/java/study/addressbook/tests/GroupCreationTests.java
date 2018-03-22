package study.addressbook.tests;

import org.testng.annotations.Test;
import study.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.gotoGroupPage();
        app.initNewGroupCreation("new");
        app.fillGroupForm(new GroupData("studyGroup2", "studytest2", "study2"));
        app.submitGroupCreation("submit");
        app.gotoGroupPage();
    }

}
