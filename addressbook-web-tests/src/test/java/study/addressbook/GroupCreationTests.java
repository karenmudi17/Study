package study.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        gotoGroupPage();
        initNewGroupCreation("new");
        fillGroupForm(new GroupData("studyGroup2", "studytest2", "study2"));
        submitGroupCreation("submit");
        gotoGroupPage();
    }

}
