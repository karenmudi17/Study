package study.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import study.addressbook.model.GroupData;

import java.util.List;

public class GroupModificationTests extends TestBase{

    @Test
    public void testGroupModification(){
        app.getNavigationHelper().gotoGroupPage();
        if (! app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().createGroup(new GroupData("studyGroup2", null, "study2"));
        }
        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().selectGroup(before.size() - 2);
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("studyModif", "aaa", "bbb"));
        app.getGroupHelper().submitGroupModification();
        app.getNavigationHelper().gotoGroupPage();
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(),before.size());
    }
}
