package Assignment_1;


/**
 * Mappe_Del_1
 * @author Hasan Omarzae
 *
 *Class of a patient
 */
public class Patient extends Person implements Diagnosable {

    private String diagnosis = "";


    /**
     * Constructs a new {@link Person}
     * @param firstName First name of person
     * @param lastName Last name of person
     * @param personalID ID-Number of the person
     */
    protected Patient(String firstName, String lastName, String personalID) {
        super(firstName, lastName, personalID);
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    /**
     * @return String of object details
     */
    @Override
    public String toString() {
        return "Name: '" + firstName + lastName + '\'' +
                "Personal ID: '" + personalID + '\'';
    }

    @Override
    public void setDiagnosis(String newDiagnosis) {
        this.diagnosis = newDiagnosis;
    }
}
