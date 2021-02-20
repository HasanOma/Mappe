package Assignment_1;

public class Patient extends Person implements Diagnosable {

    private String diagnosis = "";

    protected Patient(String firstName, String lastName, String personalID) {
        super(firstName, lastName, personalID);
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    @Override
    public String toString() {
        return "Name: '" + firstName + lastName + '\'' +
                "Personal ID: '" + personalID + '\'';
    }

    @Override
    public void setDiagnosis() {

    }
}
