package lesson9;

public class Users {
    String firstName;
    String lastName;

    public Users(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String welcome(){
        return "Welcome, " + firstName + " " + lastName;
    }
}
