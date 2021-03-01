package Assignment_1;


import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;



@DisplayName("Department Name")
class DepartmentTest {


    @Test
    @DisplayName("Removing an employee that does not exist")
    void removingAnEmployeeThatDoesNotExist() throws RemoveException{
        Hospital hospital = HospitalTestData.fillRegisterWithTestData(new Hospital("Test"));
        Department department = hospital.departments.get(0);

        int beforeRemove = department.employees.size();
        department.employees.remove(department.employees.get(0));
        int afterRemove = department.employees.size();

        assertEquals(afterRemove, beforeRemove-1);
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

        int beforeRemove = department.patients.size();
        department.patients.remove(department.patients.get(0));
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
    @DisplayName("s")
    void s() throws RemoveException{
        Hospital hospital = HospitalTestData.fillRegisterWithTestData(new Hospital("Test"));
        Department department = hospital.departments.get(0);

        assertThrows(RemoveException.class, () -> department.removePerson(new Patient("ken", "robin", "5")));
    }

}