package Assignment_1;


/**
 * Mappe_Del_1
 * @author Hasan Omarzae
 *
 *Class of an employee
 */
public class Employee extends Person {


    /**
     * Constructs a new {@link Person}
     * @param firstName First name of employee
     * @param lastName Surname of employee
     * @param personalID ID of the employee
     */
     public Employee(String firstName, String lastName, String personalID) {
        super(firstName, lastName, personalID);
    }

    /**
     *
     * @return String of object details
     */
    @Override
    public String toString() {
        return "Name: '" + firstName + lastName + '\'' +
                "Personal ID: '" + personalID + '\'';
    }
}
