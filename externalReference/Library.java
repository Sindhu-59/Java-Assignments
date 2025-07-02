class Library{
	
	
	public static void main(String [] args){
		String thelonggame="thelonggame";
		String thehomecoming="thehomecoming";
		String codenamegod="codenamegod";
		String chasingfire="chasingfire";
		String Aftereverhappy="Aftereverhappy";
		String thesephetandwingsofnight="thesephetandwingsofnight";
		String thefury="thefury";
		String bhagavathGita="bhagavathGita";
		String bookNames[]={thelonggame,thehomecoming,codenamegod,chasingfire,Aftereverhappy,thesephetandwingsofnight,thefury,bhagavathGita};
		System.out.println("The number of books are " +bookNames.length);
		//System.out.println(bookNames[0]+ "" +bookNames[1]+ "" +bookNames[2]+ "" +bookNames[3]+ "" +bookNames[4]+ "" +bookNames[5]+ "" +bookNames[6] + "" +bookNames[7] );
		for(String library1:bookNames){
			System.out.println(library1);
		}
	}
}
	