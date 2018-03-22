package study.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import study.addressbook.model.GroupData;

public class GroupHelper extends HelperBase{

    public GroupHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void submitGroupCreation(String submit) {
        click(By.name(submit));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"),groupData.getName());
        type(By.name("group_header"),groupData.getHeader());
        type(By.name("group_footer"),groupData.getFooter());
    }

    public void initNewGroupCreation(String s) {
        click(By.name(s));
    }

    public void deleteSelectedGroups() {
        click(By.name("delete"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }
}