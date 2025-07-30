class rodRunner {
    public static void main(String args[]) {
        System.out.println("Main Started - Rod Collection Display");

        Rod rod1 = new Rod(1);
		System.out.println("ID: " +rod1.id);
		
		Rod rod2 = new Rod("Aluminium","Grey");
		System.out.println("Color: " + rod2.color);
        System.out.println("Material: " + rod2.material);
		
		Rod rod3 = new Rod(200.0,1.5,50.0,500.0);
        System.out.println("Length: " + rod3.lengthCm + " cm");
        System.out.println("Diameter: " +rod3.diameterCm + " cm");
		System.out.println("Weight: " + rod3.weightKg + " kg");
        System.out.println("Price: $" + rod3.price);
       }
}