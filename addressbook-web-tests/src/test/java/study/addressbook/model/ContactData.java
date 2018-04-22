package study.addressbook.model;

import java.util.Objects;

public class ContactData {

    private int id = Integer.MAX_VALUE;
    private String firstName;
    private String lastName;
    private String nickname;
    private String mobile;
    private String work;
    private String home;
    private String email;
    private String group;
    private String allPhones;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactData that = (ContactData) o;
        return id == that.id &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, firstName, lastName);
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public int getId() { return id; }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getHomePhone() {
        return home;
    }
    public String getNickname() {
        return nickname;
    }
    public String getMobilePhone() {
        return mobile;
    }
    public String getWorkPhone() {
        return work;
    }
    public String getEmail() {
        return email;
    }
    public String getGroup() {
        return group;
    }
    public String getAllPhones() { return allPhones; }


    public ContactData withId(int id) { this.id = id; return this;}
    public ContactData withFirstName(String firstName) { this.firstName = firstName; return this;}
    public ContactData withLastName(String lastName) { this.lastName = lastName; return this;}
    public ContactData withNickname(String nickname) { this.nickname = nickname; return this;}
    public ContactData withMobilePhone(String mobile) { this.mobile = mobile; return this;}
    public ContactData withWorkPhone(String work) { this.work = work; return this;}
    public ContactData withHomePhone(String home) { this.home = home; return this;}
    public ContactData withEmail(String email) { this.email = email; return this;}
    public ContactData withGroup(String group) { this.group = group; return this;}
    public ContactData withAllPhones(String allPhones) { this.allPhones = allPhones; return this;}

}
