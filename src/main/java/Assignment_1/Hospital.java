package Assignment_1;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    public String hospitalName;
    ArrayList<Department> departments = new ArrayList<>();

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void addDepartment(Department department){
        departments.add(department);
    }

    public void removePersonFromDepartment(String spesificDepartment, Patient patient){
        for (int i = 0; i < departments.size(); i++){
            if (departments.get(i).departmentName.trim().equalsIgnoreCase(spesificDepartment.trim())){
                departments.get(i).removePerson(patient);
            }
        }
    }

    public void removePersonFromDepartment(String spesificDepartment, Employee employee){
        for (int i = 0; i < departments.size(); i++){
            if (departments.get(i).departmentName.trim().equalsIgnoreCase(spesificDepartment.trim())){
                departments.get(i).removePerson(employee);
            }
        }
    }

    public List<Department> getDepartments(){
        List<Department> list = new ArrayList<>();
        for (Department department : departments) {
            list.add(new Department(department.departmentName));
        }
        return list;
    }

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
