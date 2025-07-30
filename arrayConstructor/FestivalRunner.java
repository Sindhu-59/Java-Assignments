class FestivalRunner {
    public static void main(String[] args) {

        Festival f1 = new Festival("Diwali", "India");
        System.out.println("The festival name is "+f1.name);
		System.out.println("The country is "+f1.country);
				
        Festival f2 = new Festival("Hindu","Winter", "Jesus Christ");
        System.out.println("The relegion is "+f2.religion);
		System.out.println("The season is "+f2.season);
		System.out.println("The main Deity Or Figure is "+f2.mainDeityOrFigure);

        Festival f3 = new Festival(true);
        System.out.println("The isNationalHoliday is "+f3.isNationalHoliday);
		   }
}
