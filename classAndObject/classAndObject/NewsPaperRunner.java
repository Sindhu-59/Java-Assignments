class NewsPaperRunner{

	public static void main(String args[]){
		System.out.println("main started");
		
		NewsPaper news1=new NewsPaper();
		System.out.println("The newspaper id is "+news1.paperId);
		System.out.println("The company name is "+news1.companyName);
	
		
		news1.paperId=1;
		System.out.println("The newspaper id is "+news1.paperId);
		
		news1.companyName="Deccan Herland";
		System.out.println("The company name is "+news1.companyName);
		
		
		
	}
}