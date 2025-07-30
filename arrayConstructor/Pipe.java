class Pipe {
    String material;
	String usage;
	String color;
    double length;
    double diameter;
    boolean isFlexible;
    
	
	Pipe(){
			
			System.out.println("The constructor is invoked");
			
		}
		Pipe(String material,String usage,String color){
			this.material=material;
			this.usage=usage;
			this.color=color;
		}
		Pipe(double length,double diameter){
			this.length=length;
			this.diameter=diameter;
		}
		Pipe(boolean isFlexible){
			
			this.isFlexible=isFlexible;
		
		}
	
}
