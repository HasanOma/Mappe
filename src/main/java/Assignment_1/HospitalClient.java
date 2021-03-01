package Assignment_1;


/**
 * Mappe_Del_1
 * @author Hasan Omarzae
 * Client class for Assignment_1
 */
public class HospitalClient {

    public static void main(String[] args) {

        Hospital hospital = HospitalTestData.fillRegisterWithTestData(new Hospital("Ullevaal"));
        Department department = hospital.departments.get(0);
        Employee firstEmployee = department.employees.get(0);
        Patient notPatient = new Patient("Jon", "Almaas", "555555");

        try {
            department.remove(firstEmployee);


            department.remove(notPatient);
        } catch (RemoveException e){
            System.out.println(e.getMessage());
        }



    }

}
