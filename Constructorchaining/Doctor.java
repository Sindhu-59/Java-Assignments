class Doctor {
    String name;
    String specialization;
    int experience;
    boolean isSurgeon;

    public void getDoctorInfo() {
        System.out.println("Doctor Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Is Surgeon: " + isSurgeon);
    }
}
