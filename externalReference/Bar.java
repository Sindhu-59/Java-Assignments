class Bar{
	
	public static void main(String [] args){
		String Beer = "beer";
		String wine ="wine";
		String vodka ="vodka";
		String gin ="Gin";
		String rum="Rum";
		String cider="Cider";
		String banasvadi="Banasvadi";
		String mead="Mead";
		String brandy="Brandy";
		String kingfisher="Kingfisher";
		String signature="Signature";
		String tuborg = "Tuborg";
		String bira="Bira";
		String corona="Corona";
		String royalchallenger="Royalchallenger";
		
		String alcohal[]={Beer,wine,vodka,gin,rum,cider,mead,brandy,kingfisher,signature,tuborg,bira,corona,royalchallenger};
		System.out.println("The number of alcohal are " +alcohal.length);
		//System.out.println(alcohal[0]+ "" +alcohal[1]+ "" +alcohal[2]+ "" +alcohal[3]+ "" +alcohal[4]+ "" +alcohal[5]+ "" +alcohal[6]+ "" +alcohal[7]+ "" +alcohal[8]+ "" +alcohal[9]+ "" +alcohal[10]+ "" +alcohal[11]+ "" +alcohal[12]+ "" +alcohal[13]  );
		for(String bar:alcohal){
			System.out.println(bar);
		}
	}
}
	