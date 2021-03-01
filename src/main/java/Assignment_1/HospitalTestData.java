package Assignment_1;

import Assignment_1.Person.*;

public final class HospitalTestData {
    private HospitalTestData() {
        // not called
    }
    /**
     * @param hospital
     * @return
     */
    public static Hospital fillRegisterWithTestData(final Hospital hospital) {
        // Add some departments
        Department emergency = new Department("Akutten");
        emergency.employees.add(new Employee("Odd Even", "Primtallet", "1"));
        emergency.employees.add(new Employee("Huppasahn", "DelFinito", "2"));
        emergency.employees.add(new Employee("Rigmor", "Mortis", "3"));
        emergency.employees.add(new GeneralPractitioner("Inco", "Gnito", "4"));
        emergency.employees.add(new Surgeon("Inco", "Gnito", "5"));
        emergency.employees.add(new Nurse("Nina", "Teknologi", "6"));
        emergency.employees.add(new Nurse("Ove", "Ralt", "7"));
        emergency.patients.add(new Patient("Inga", "Lykke", "8"));
        emergency.patients.add(new Patient("Ulrik", "Smål", "9"));
        hospital.addDepartment(emergency);
        Department childrenPolyclinic = new Department("Barn poliklinikk");
        childrenPolyclinic.employees.add(new Employee("Salti", "Kaffen", "11"));
        childrenPolyclinic.employees.add(new Employee("Nidel V.", "Elvefølger", "12"));
        childrenPolyclinic.employees.add(new Employee("Anton", "Nym", "13"));
        childrenPolyclinic.employees.add(new GeneralPractitioner("Gene", "Sis", "14"));
        childrenPolyclinic.employees.add(new Surgeon("Nanna", "Na", "15"));
        childrenPolyclinic.employees.add(new Nurse("Nora", "Toriet", "16"));
        childrenPolyclinic.patients.add(new Patient("Hans", "Omvar", "17"));
        childrenPolyclinic.patients.add(new Patient("Laila", "La", "18"));
        childrenPolyclinic.patients.add(new Patient("Jøran", "Drebli", "19"));
        hospital.addDepartment(childrenPolyclinic);
        return hospital;
    }
}