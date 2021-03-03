package Assignment_1;


import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Mappe_Del_1
 * @author Hasan Omarzae
 *
 * Test class for department class' remove method
 */
@DisplayName("Department Name")
class DepartmentTest {


    @Test
    @DisplayName("Removing an employee that does not exist")
    void removingAnEmployeeThatDoesNotExist() throws RemoveException{
        Hospital hospital = HospitalTestData.fillRegisterWithTestData(new Hospital("Test"));
        Department department = hospital.departments.get(0);

        Employee notEmployee = new Employee("Arnold","Schwarzenegger","99");
        int beforeRemove = department.employees.size();
        department.employees.remove(notEmployee);
        int afterRemove = department.employees.size();

        assertEquals(afterRemove, beforeRemove);
    }

    @Test
    @DisplayName("Removing an employee from the department")
    void removingAnEmployeeFromTheDepartment() throws RemoveException{
        Hospital hospital = HospitalTestData.fillRegisterWithTestData(new Hospital("Test"));
        Department department = hospital.departments.get(0);

        int beforeRemove = department.employees.size();
        department.employees.remove(department.employees.get(0));
        int afterRemove = department.employees.size();

        assertEquals(afterRemove+1, beforeRemove);
    }

    @Test
    @DisplayName("Removing a patient that does not exist")
    void removingAPatientThatDoesNotExcist() throws RemoveException{
        Hospital hospital = HospitalTestData.fillRegisterWithTestData(new Hospital("Test"));
        Department department = hospital.departments.get(0);

        Patient notPatient = new Patient("Jesus","Christ","666");
        int beforeRemove = department.patients.size();
        department.patients.remove(notPatient);
        int afterRemove = department.patients.size();

        assertEquals(afterRemove, beforeRemove);
    }

    @Test
    @DisplayName("Removing a patient from the department")
    void removingAPatientFromTheDepartment() throws RemoveException{
        Hospital hospital = HospitalTestData.fillRegisterWithTestData(new Hospital("Test"));
        Department department = hospital.departments.get(0);

        int beforeRemove = department.patients.size();
        department.patients.remove(department.patients.get(0));
        int afterRemove = department.patients.size();

        assertEquals(afterRemove+1, beforeRemove);
    }

    @Test
    @DisplayName("Removing a patient that does not exist RemoveException class thrown")
    void removingAPatientThatDoesNotExistRemoveExceptionClassThrown() {
        Hospital hospital = HospitalTestData.fillRegisterWithTestData(new Hospital("Test"));
        Department department = hospital.departments.get(0);

        assertThrows(RemoveException.class,
                () -> department.remove(new Patient("ken", "robin", "5")));
    }

    @Test
    @DisplayName("Removing an employee that does not exist RemoveException class thrown")
    void removingAnEmployeeThatDoesNotExistRemoveExceptionClassThrown() {
        Hospital hospital = HospitalTestData.fillRegisterWithTestData(new Hospital("Test"));
        Department department = hospital.departments.get(0);

        assertThrows(RemoveException.class,
                () -> department.remove(new Employee("ken", "robin", "5")));
    }


}