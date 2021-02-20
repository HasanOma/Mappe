package Assignment_1;

public class Nurse extends Employee {

    public Nurse(String firstName, String lastName, String personalID) {
        super(firstName, lastName, personalID);
    }

    @Override
    public String toString() {
        return "Mappe_Del_1.Nurse: " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", personalID='" + personalID + '\'' +
                '}';
    }
}
