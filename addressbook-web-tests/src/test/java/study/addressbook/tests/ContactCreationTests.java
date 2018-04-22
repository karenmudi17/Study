package study.addressbook.tests;

import org.testng.annotations.Test;
import study.addressbook.model.ContactData;
import study.addressbook.model.Contacts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactCreationTests extends TestBase {
    
    @Test
    public void newContactCreationTest() {
        app.goTo().homePage();
        Contacts before = app.contact().all();
        ContactData contact = new ContactData().withFirstName("Kate").withLastName("Konina").withEmail("svk@gmul.com").withGroup("studyGroup2");

        app.contact().create(contact,true);
        app.goTo().homePage();
        Contacts after = app.contact().all();
        assertThat(after.size(), equalTo(before.size() + 1));
        assertThat(after, equalTo(before.withAdded(contact.withId(after.stream().mapToInt((c) -> c.getId()).max().getAsInt()))));
    }

}
