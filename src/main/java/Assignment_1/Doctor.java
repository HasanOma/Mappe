package Assignment_1;

public abstract class Doctor extends Employee {

    protected Doctor(String firstName, String lastName, String personalID) {
        super(firstName, lastName, personalID);
    }

    public abstract void setDiagnosis(Patient patient, String diagnosis);
}
