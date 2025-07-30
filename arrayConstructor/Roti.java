class Roti {
    String type;
    String flourUsed;
    double diameterInInches;
    boolean isStuffed;
    String region;
    boolean isHot;
	
	Roti(){
			
			System.out.println("The constructor is invoked");
			
		}
		Roti(String type,String flourUsed){
			this.type=type;
			this.flourUsedf=flourUsed;
			
		}
		Roti(double diameterInInches){
			this.diameterInInches=diameterInInches;
			
		}
		Roti(boolean isStuffed,boolean isHot){
			
			this.isStuffed=isStuffed;
			this.isHot=isHot;
			
		}
		Roti(String region){
			this.region=region;
		}
	
}
