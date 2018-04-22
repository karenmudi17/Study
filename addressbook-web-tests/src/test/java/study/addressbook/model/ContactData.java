package study.addressbook.model;

import java.util.Objects;

public class ContactData {

    private int id = Integer.MAX_VALUE;
    private String firstName;
    private String lastName;
    private String nickname;
    private String phone;
    private String email;
    private String group;


    @Override
    public String toString() {
        return "ContactData{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactData that = (ContactData) o;
        return Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName);
    }

    public int getId() { return id; }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getNickname() {
        return nickname;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }
    public String getGroup() {
        return group;
    }

    public ContactData withId(int id) { this.id = id; return this;}
    public ContactData withFirstName(String firstName) { this.firstName = firstName; return this;}
    public ContactData withLastName(String lastName) { this.lastName = lastName; return this;}
    public ContactData withNickname(String nickname) { this.nickname = nickname; return this;}
    public ContactData withPhone(String phone) { this.phone = phone; return this;}
    public ContactData withEmail(String email) { this.email = email; return this;}
    public ContactData withGroup(String group) { this.group = group; return this;}

}
