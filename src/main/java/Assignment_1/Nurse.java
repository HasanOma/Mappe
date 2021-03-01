package Assignment_1;

import Assignment_1.Employee;

/**
 * Mappe_Del_1
 * @author Hasan Omarzae
 *
 *Class of a nurse
 */
public class Nurse extends Employee {

    /**
     * {@link Employee}
     * Constructor of the class
     * @param firstName First name
     * @param lastName Surname
     * @param personalID ID
     */
    public Nurse(String firstName, String lastName, String personalID) {
        super(firstName, lastName, personalID);
    }

    /**
     * @return String of object details
     */
    @Override
    public String toString() {
        return "Name: '" + firstName + " " + lastName + '\'' +
                "Personal ID: '" + personalID + '\'';
    }
}
