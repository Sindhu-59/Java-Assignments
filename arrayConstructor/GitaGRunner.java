class GiTagRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - GiTag Data");

        GiTag gi1 = new GiTag("Mysore Silk","Handicrafts","Mysuru ,Karnataka");
        
        System.out.println("Name: " + gi1.name);
        System.out.println("Category: " + gi1.category);
        System.out.println("Geographical Area: " + gi1.geographicalArea);
		
		GiTag gi2 = new GiTag(2017);
        System.out.println("Registration Year: " + gi2.registrationYear);
		
		GiTag gi3 = new GiTag("Coffee grown in the hilly tracts of Kodagu, known for its mild flavor and aroma.","Coffee Board");
        System.out.println("Description: " + gi3.description);
        System.out.println("Registered Holder: " +gi3.registeredHolder);
        
    }

}
