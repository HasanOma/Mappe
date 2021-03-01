package Assignment_1;

/**
 * Mappe_Del_1
 * @author Hasan Omarzae
 *
 *Abstract class of a Doctor
 */
public abstract class Doctor extends Employee {

    /**
     * Constructor of doctor class
     * @param firstName First name
     * @param lastName Surname
     * @param personalID ID
     */
    protected Doctor(String firstName, String lastName, String personalID) {
        super(firstName, lastName, personalID);
    }

    /**
     *
     * @param patient Patient object
     * @param diagnosis Diagnosis of the Patient
     */
    public abstract void setDiagnosis(Patient patient, String diagnosis);
}
