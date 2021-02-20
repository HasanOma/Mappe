package Assignment_1;

public class Employee extends Person {


    public Employee(String firstName, String lastName, String personalID) {
        super(firstName, lastName, personalID);
    }

    @Override
    public String toString() {//TODO fill out correctly with nurses etc
        return "Name: '" + firstName + lastName + '\'' +
                "Personal ID: '" + personalID + '\'';
    }
}
