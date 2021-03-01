package Assignment_1;

import Assignment_1.Doctor;
import Assignment_1.Patient;

/**
 * Mappe_Del_1
 * @author Hasan Omarzae
 *
 *Class of a Surgeon {@link Doctor}
 */
public class Surgeon extends Doctor {


    protected Surgeon(String firstName, String lastName, String personalID) {
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
