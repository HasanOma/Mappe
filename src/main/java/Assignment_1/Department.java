package Assignment_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Mappe_Del_1
 * @author Hasan Omarzae
 *
 *Class from a Department in a Hospital
 */
public class Department {
    public String departmentName;
    public ArrayList<Patient> patients = new ArrayList<>();
    public ArrayList<Employee> employees = new ArrayList<>();


    /**
     * Constructor of the Department class
     * @param departmentName Name of the department
     */
    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * This method copies all the employees in the department to a list
     * @return List of employees
     */
    public List<Employee> getEmployees(){
        List<Employee> list = new ArrayList<>();
        for (Employee employee : employees) {
            list.add(new Employee(employee.firstName, employee.lastName, employee.personalID));
        }
        return list;
    }

    /**
     * This method copies all the patients in the department to a list
     * @return List of patients
     */
    public List<Patient> getPatients(){
        List<Patient> list = new ArrayList<>();
        for (Patient patient : patients) {
            list.add(new Patient(patient.firstName, patient.lastName, patient.personalID));
        }
        return list;
    }

    /**
     * This method sees whether an employee with the same ID already exists
     * @param employee An employee object
     */
    public void addEmployee(Employee employee){
        Employee newEmployee = new Employee(employee.firstName, employee.lastName, employee.personalID);
        if (employees.contains(employee)){
            throw new IllegalArgumentException("Employee with same personalID already exists");
        }
        else {
            employees.add(newEmployee);
        }
    }

    /**
     * This method sees whether an patients with the same ID already exists
     * @param patient A patient object
     */
    public void addPatient(Patient patient){
        Patient newPatient = new Patient(patient.firstName, patient.lastName, patient.personalID);
        if (patients.contains(patient)){
            throw new IllegalArgumentException("Patient with same personalID already exists");
        }
        else {
            patients.add(newPatient);
        }
    }


    /**
     * Method to see if person is in employee or patient register and then remove them
     * @param person A person object
     * @throws RemoveException Exception thrown if not in register
     */
    public void remove(Person person) throws RemoveException {
        if (!(employees.contains(person) || patients.contains(person))) {
            throw new RemoveException("Person does not exist in the register.");
        } else if (employees.contains(person)) {
            for (int i = 0; i < employees.size(); i++) {
                if (person.personalID.equals(employees.get(i).personalID)) {
                    employees.remove(i);
                }
            }

        } else if (patients.contains(person)) {
            for (int i = 0; i < patients.size(); i++) {
                if (person.personalID.equals(employees.get(i).personalID)) {
                    patients.remove(i);
                }
            }
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentName, patients, employees);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return departmentName.equals(that.departmentName);
    }

    /**
     *
     * @return String of object details
     */
    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("Department name: ");
        string.append(departmentName);
        string.append("\n\nEmployees: \n");

        for(Employee e : employees){
            string.append(e.toString());
            string.append("\n");
        }
        string.append("\nPatients: \n");
        for (Patient p: patients) {
            string.append(p.toString());
            string.append("\n");
        }

        return string.toString();
    }
}
