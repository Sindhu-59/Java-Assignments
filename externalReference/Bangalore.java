class Bangalore{
	
	public static void main(String [] args){
		
		String Gaythrinagar = "gaythrinagar";
		String sadhashivnagar ="Sadhashivnagar";
		String majestic ="Majestic";
		String Magadi ="magadi";
		String banshankari="Bhanashankari";
		String btmlayout="Btmlayout";
		String banasvadi="Bnasvadi";
		String harishchandraghat="Harishchandraghat";
		String Rajajinagar="rajajinagar";
		String areaNames[]={Gaythrinagar,sadhashivnagar,majestic,Magadi,banshankari,btmlayout,banasvadi,harishchandraghat,Rajajinagar};
		System.out.println("The number of areas are " +areaNames.length);
		//System.out.println(areaNames[0]+ "" +areaNames[1]+ "" +areaNames[2]+ "" +areaNames[3]+ "" +areaNames[4]+ "" +areaNames[5]+ "" +areaNames[6]+ "" +areaNames[7]+ "" +areaNames[8] );
		for(String areaName:areaNames){
			System.out.println(areaName);
		}
	}
}
	