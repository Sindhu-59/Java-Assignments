class Politician {
    int id;
	int age;
    String name;
    String party;
    String education;
    String position; 
    String hometown;
	boolean isInPower;
	
	Politician(){
			
			System.out.println("The constructor is invoked");
			
		}
		Politician(int id,int age){
			this.id=id;
			this.age=age;
		}
		Politician(String name,String party,String education){
			this.name=name;
			this.party=party;
			this.education=education;
			
		}
		Politician(String position,String hometown){
			this.position=position;
			this.hometown=hometown;
		}
		Politician(boolean isInPower){
			this.isInPower=isInPower;
		}	
		}
	