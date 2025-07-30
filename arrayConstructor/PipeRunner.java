class PipeRunner {
    public static void main(String args[]) {
        System.out.println("Main Started - Pipe Inventory Display");

        Pipe pipe1 = new Pipe("PVC","Water Supply","Black");
       System.out.println("Material: " +pipe1.material);
	   System.out.println("Usage: " + pipe1.usage);
	   System.out.println("color: " +pipe1.color);
		
		Pipe pipe2 = new Pipe(2.0,300.0);
         System.out.println("Length: " + pipe2.length + " cm");
		 System.out.println("Diameter: " +pipe2.diameter + " cm");
        
        

        Pipe pipe3 = new Pipe(true);
      System.out.println("Diameter: " +pipe2.isFlexible);
        }
}