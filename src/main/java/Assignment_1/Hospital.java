package Assignment_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Mappe_Del_1
 * @author Hasan Omarzae
 *
 *Class for the Hospital
 */
public class Hospital {
    public String hospitalName;
    ArrayList<Department> departments = new ArrayList<>();

    /**
     * Constructor of the class
     * @param hospitalName Name of the hospital
     */
    public Hospital(String hospitalName) {
        if (hospitalName.isBlank()) {
            throw new IllegalArgumentException("Department name is not put in.");
        }
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * This method adds a department to a hospital
     * @param department Department object
     */
    public void addDepartment(Department department){
        departments.add(department);
    }

    /**
     * This method copies all departments to a list
     * @return List of departments
     */
    public List<Department> getDepartments(){
        List<Department> list = new ArrayList<>();
        for (Department department : departments) {
            list.add(new Department(department.departmentName));
        }
        return list;
    }

    /**
     *
     * @return String of object details
     */
    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("\n\nHospital name: \n");
        string.append(hospitalName);

        for (Department d: departments) {
            string.append(d.toString());
        }
        return string.toString();
    }
}
