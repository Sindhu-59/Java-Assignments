class Library{
	
	static String bookNames[]={"thelonggame","thehomecoming","codenamegod","chasingfire","Aftereverhappy","thesephetandwingsofnight","thefury"};

	
	public static void main(String [] args){
		System.out.println("The number of books are " +bookNames.length);
		//System.out.println(bookNames[0]+ "" +bookNames[1]+ "" +bookNames[2]+ "" +bookNames[3]+ "" +bookNames[4]+ "" +bookNames[5]+ "" +bookNames[6] );
		for(String library1:bookNames){
			System.out.println(library1);
		}
	}
}
	