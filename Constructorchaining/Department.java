class Department {
    String depName;
    int floorNo;
    int staffCount;
    Doctor doctor; 

    public void getDepartmentInfo() {
        System.out.println("Department Name: " + depName);
        System.out.println("Floor Number: " + floorNo);
        System.out.println("Staff Count: " + staffCount);
        doctor.getDoctorInfo();
    }
}
