package Assignment_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Department {
    public String departmentName;
    public ArrayList<Patient> patients = new ArrayList<>();
    public ArrayList<Employee> employees = new ArrayList<>();


    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Employee> getEmployees(){
        List<Employee> list = new ArrayList<>();
        for (Employee employee : employees) {
            list.add(new Employee(employee.firstName, employee.lastName, employee.personalID));
        }
        return list;
    }

    public List<Patient> getPatient(){
        List<Patient> list = new ArrayList<>();
        for (Patient patient : patients) {
            list.add(new Patient(patient.firstName, patient.lastName, patient.personalID));
        }
        return list;
    }

    public void addEmployee(Employee employee){
        Employee newEmployee = new Employee(employee.firstName, employee.lastName, employee.personalID);
        if (employees.contains(employee)){
            throw new IllegalArgumentException("Employee with same personalID already exists");
        }
        else {
            employees.add(newEmployee);
        }
    }

    public void addPatient(Patient patient){
        Patient newPatient = new Patient(patient.firstName, patient.lastName, patient.personalID);
        if (patients.contains(patient)){
            throw new IllegalArgumentException("Patient with same personalID already exists");
        }
        else {
            patients.add(newPatient);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentName);
    }

//    public void remove(person)

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return departmentName.equals(that.departmentName);
    }

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
