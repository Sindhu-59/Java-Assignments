class Hospital {
    String hospitalName;
    String location;
    int totalBeds;
    Department department; 

    public void getHospitalInfo() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Location: " + location);
        System.out.println("Total Beds: " + totalBeds);
        department.getDepartmentInfo();
    }
}
