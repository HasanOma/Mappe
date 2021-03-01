package Assignment_1;

/**
 * Mappe_Del_1
 * @author Hasan Omarzae
 *
 *Class of a GP
 */
public class GeneralPractitioner extends Doctor {


    protected GeneralPractitioner(String firstName, String lastName, String personalID) {
        super(firstName, lastName, personalID);
    }

    /**
     * {@inheritDoc}
     * @param patient Patient object
     * @param diagnosis Diagnosis of the Patient
     */
    @Override
    public void setDiagnosis(Patient patient, String diagnosis) {
        patient.setDiagnosis(diagnosis);
    }
}
