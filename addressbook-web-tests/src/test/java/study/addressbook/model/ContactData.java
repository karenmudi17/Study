package study.addressbook.model;

import java.util.Objects;

public class ContactData {

    private int id;
    private final String firstName;
    private final String lastName;
    private final String nickname;
    private final String phone;
    private final String email;
    private final String group;

    public ContactData(int id,String firstName, String lastName, String nickname, String phone, String email, String group) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.phone = phone;
        this.email = email;
        this.group = group;
    }



    public ContactData(String firstName, String lastName, String nickname, String phone, String email, String group) {
        this.id = Integer.MAX_VALUE;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.phone = phone;
        this.email = email;
        this.group = group;

    }

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
    public void setId(int id) { this.id = id; }

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

}
