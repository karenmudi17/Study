package study.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import study.addressbook.model.ContactData;
import study.addressbook.model.GroupData;

import java.util.List;
import java.util.Set;

public class ContactDeletionTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions(){
        app.goTo().homePage();
        if (app.contact().all().size() == 0){
            app.contact().create(new ContactData().withFirstName("Sveta").withLastName("Konina").withEmail("svk@gmul.com").withGroup("studyGroup2"),true);
        }
    }
    
    @Test
    public void contactDeletion() {
        Set<ContactData> before = app.contact().all();
        ContactData deletedContact = before.iterator().next();
        app.contact().delete(deletedContact);
        Set<ContactData> after = app.contact().all();
        Assert.assertEquals(after.size(), before.size()-1);

        before.remove(deletedContact);
        Assert.assertEquals(before,after);

    }

}
