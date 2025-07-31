class HospitalRunner {
	
    public static void main(String[] args) {

        Doctor doctor = new Doctor();
        doctor.name = "Dr. Srikanth";
        doctor.specialization = "Cardiology";
        doctor.experience = 15;
        doctor.isSurgeon = true;

        Department department = new Department();
        department.depName = "Heart Department";
        department.floorNo = 2;
        department.staffCount = 25;
        department.doctor = doctor;

        Hospital hospital = new Hospital();
        hospital.hospitalName = "Sparsha";
        hospital.location = "Shimoga";
        hospital.totalBeds = 130;
        hospital.department = department;

        hospital.getHospitalInfo();
    }
}
