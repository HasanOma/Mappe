package Assignment_1;

import Assignment_1.Doctor;
import Assignment_1.Patient;

public class Surgeon extends Doctor {


    protected Surgeon(String firstName, String lastName, String personalID) {
        super(firstName, lastName, personalID);
    }

    @Override
    public void setDiagnosis(Patient patient, String diagnosis) {
        patient.setDiagnosis(diagnosis);
    }
}
