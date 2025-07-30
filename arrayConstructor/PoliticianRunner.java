class PoliticianRunner {
    public static void main(String args[]) {
        System.out.println("Main Started - Politician Data for Karnataka");

        
        Politician p1 = new Politician(1,83);
        
        System.out.println("ID: " + p1.id);
		System.out.println("Age: " +p1. age);
		
		Politician p2 = new Politician("Yeddyurappa","BJP","PUC");
        System.out.println("Name: " + p2.name);
        System.out.println("Party: " +p2.party);   
        System.out.println("Education: " + p2.education);
		
		Politician p3 = new Politician("CM","Mandya");
        System.out.println("Position: " + p3.position);
        System.out.println("Hometown: " + p3.hometown);

		Politician p4 = new Politician(false);
        System.out.println("In Power: " +p4.isInPower);
           System.out.println("Main Ended - Politician Data Display Complete");
    }
}