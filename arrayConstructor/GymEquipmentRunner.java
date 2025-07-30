class GymEquipmentRunner {
    public static void main(String[] args) {

        GymEquipment e1 = new GymEquipment("Treadmill","Cardio","PowerMax");
       
        System.out.println("The name is " + e1.name);
        System.out.println("The type is " + e1.type);
        System.out.println("The brand is " + e1.brand);
		
		
		GymEquipment e2 = new GymEquipment(10.0,120.0);
        System.out.println("The weight is " +e2. weight);
        System.out.println("The price is " +e2. price);
		
		
		GymEquipment e3 = new GymEquipment(false);
        System.out.println("The electronic is " + e3.isElectronic);
       
    }
}
