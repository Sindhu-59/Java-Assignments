public class JuiceShop{
	static String juices[]={"Apple cider","Apple Juice","Cherry Juice","Orange Juice","Tomato Juice","Cranberry Juice","Papaya Juice","ABC juice","Amla Juice","Grape Juice","Lemon Juice","Pomogranate Juice","Pineapple Juice","Tamrind Juice","Sweet lemon Juice","Watermelon Juice"};
	public static void main(String juice[]){
		String applecider="Applecider";
		String appleJuice="AppleJuice";
		String cherryJuice="CherryJuice";
		String orangeJuice="OrangeJuice";
		String tomatoJuice="TomatoJuice";
		String cranberryJuice="CranberryJuice";
		String papayaJuice="PapayaJuice";
		String aBCJuice="ABCJuice";
		String amlaJuice="AmlaJuice";
		String grapeJuice="GrapeJuice";
		String lemonJuice="LemonJuice";
		String pomogranateJuice="PomogranateJuice";
		String pineappleJuice="PineappleJuice";
		String tamrindJuice="TamrindJuice";
		String sweetlemonJuice="SweetlemonJuice";
		String watermelonJuice="WatermelonJuice";
		 String juices[]={applecider,appleJuice,cherryJuice,orangeJuice,tomatoJuice,cranberryJuice,papayaJuice,aBCJuice,amlaJuice,grapeJuice,lemonJuice,pomogranateJuice,pineappleJuice,tamrindJuice,sweetlemonJuice,watermelonJuice};
		System.out.println("The number of juice"+juices.length);
		//System.out.println(juices[0]+" "+juices[1]+" "+juices[2]+" "+juices[3]+" "+juices[4]+" "+juices[5]+" "+juices[6]+" "+juices[7]+" "+juices[8]+" "+juices[9]+" "+juices[10]+" "+juices[11]+" "+juices[12]+" "+juices[13]+" "+juices[14]);
		for(String Juice:juices){
			System.out.println(Juice);
		}
	}
}