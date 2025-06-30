class Bangalore{
	
	static String areaNames[]={"Gaythrinagar","sadhashivnagar","majestic","Magadi","banshankari","btmlayout","banasvadi","harishchandraghat","Rajajinagar"};

	
	public static void main(String [] args){
		System.out.println("The number of areas are " +areaNames.length);
		//System.out.println(areaNames[0]+ "" +areaNames[1]+ "" +areaNames[2]+ "" +areaNames[3]+ "" +areaNames[4]+ "" +areaNames[5]+ "" +areaNames[6]+ "" +areaNames[7]+ "" +areaNames[8] );
		for(String areaName:areaNames){
			System.out.println(areaName);
		}
	}
}
	