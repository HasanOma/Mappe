package Assignment_1;

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
        emergency.employees.add(new Employee("Odd Even", "Primtallet", ""));
        emergency.employees.add(new Employee("Huppasahn", "DelFinito", ""));
        emergency.employees.add(new Employee("Rigmor", "Mortis", ""));
        emergency.employees.add(new GeneralPractitioner("Inco", "Gnito", ""));
        emergency.employees.add(new Surgeon("Inco", "Gnito", ""));
        emergency.employees.add(new Nurse("Nina", "Teknologi", ""));
        emergency.employees.add(new Nurse("Ove", "Ralt", ""));
        emergency.patients.add(new Patient("Inga", "Lykke", ""));
        emergency.patients.add(new Patient("Ulrik", "Smål", ""));
        hospital.addDepartment(emergency);
        Department childrenPolyclinic = new Department("Barn poliklinikk");
        childrenPolyclinic.employees.add(new Employee("Salti", "Kaffen", ""));
        childrenPolyclinic.employees.add(new Employee("Nidel V.", "Elvefølger", ""));
        childrenPolyclinic.employees.add(new Employee("Anton", "Nym", ""));
        childrenPolyclinic.employees.add(new GeneralPractitioner("Gene", "Sis", ""));
        childrenPolyclinic.employees.add(new Surgeon("Nanna", "Na", ""));
        childrenPolyclinic.employees.add(new Nurse("Nora", "Toriet", ""));
        childrenPolyclinic.patients.add(new Patient("Hans", "Omvar", ""));
        childrenPolyclinic.patients.add(new Patient("Laila", "La", ""));
        childrenPolyclinic.patients.add(new Patient("Jøran", "Drebli", ""));
        hospital.addDepartment(childrenPolyclinic);
        return hospital;
    }
}