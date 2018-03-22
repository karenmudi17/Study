package study.addressbook.model;

public class ContactData {
    private final String firstName;
    private final String lastName;
    private final String nickname;
    private final String phone;
    private final String email;

    public ContactData(String firstName, String lastName, String nickname, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.phone = phone;
        this.email = email;
    }

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
}
