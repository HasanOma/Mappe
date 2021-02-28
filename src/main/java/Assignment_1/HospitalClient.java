package Assignment_1;

public class HospitalClient {

    public static void main(String[] args) {

        Hospital hospital = HospitalTestData.fillRegisterWithTestData(new Hospital("Ullevaal"));
        hospital.removePersonFromDepartment("Akutten", hospital.departments.get(0).employees.get(0));
        Patient patient = new Patient("Jon", "Almaas", "555555");
        hospital.removePersonFromDepartment("akutten", patient);


    }

}
