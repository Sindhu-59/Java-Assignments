class Bar{
	
	static String alcohal[]={"Beer","wine","vodka","gin","rum","cider","mead","brandy","kingfisher","signature","tuborg","bira","corona","royalchallenger"};

	
	public static void main(String [] args){
		System.out.println("The number of alcohal are " +alcohal.length);
		//System.out.println(alcohal[0]+ "" +alcohal[1]+ "" +alcohal[2]+ "" +alcohal[3]+ "" +alcohal[4]+ "" +alcohal[5]+ "" +alcohal[6]+ "" +alcohal[7]+ "" +alcohal[8]+ "" +alcohal[9]+ "" +alcohal[10]+ "" +alcohal[11]+ "" +alcohal[12]+ "" +alcohal[13]  );
		for(String bar:alcohal){
			System.out.println(bar);
		}
	}
}
	