class Stadium {
	static int seatingCapacity ;
      static  int entryGates;
       static int vipBoxes ;
       static int yearOpened;
       static int emergencyExits;
       static long totalRevenue;
       static long ticketScanCount;
       static long maintenanceCost;
       static long matchID ;
       static long stadiumID ;
       static String name;
       static String city;
       static String primarySport;
       static String surfaceType;
       static String architect ;
       static String homeTeam;
       static String sponsor;
       static String zone;
       static String contactEmail ;
       static String ownership;

    public static void main(String[] args) {
		 seatingCapacity = 75000;
      entryGates = 12;
       vipBoxes = 20;
       yearOpened = 1998;
       emergencyExits = 8;
       totalRevenue = 120000000L;
       ticketScanCount = 4500000L;
       maintenanceCost = 20000000L;
       matchID = 1011121314L;
      stadiumID = 1234567890L;
        name = "Kantirava Stadium";
       city = "Bangalore";
        primarySport = "Cricket";
        surfaceType = "Grass";
        architect = "XYZ Constructions";
        homeTeam = "RCB";
        sponsor = "MegaCorp Ltd.";
        zone = "South Wing";
        contactEmail = "info@nationalarena.com";
       ownership = "Sports Authority of India";
        
        System.out.println( matchID);
        System.out.println(ownership);
        System.out.println( primarySport);
        System.out.println( stadiumID);
        System.out.println(entryGates);
        System.out.println( totalRevenue);
        System.out.println( ticketScanCount);
        System.out.println(vipBoxes);
        System.out.println( emergencyExits);
        System.out.println( zone);
        System.out.println(name);
        System.out.println(contactEmail);
        System.out.println(architect);
        System.out.println(maintenanceCost);
        System.out.println(sponsor);
        System.out.println(city);
        System.out.println(yearOpened);
        System.out.println( seatingCapacity);
        System.out.println(homeTeam);
        System.out.println( surfaceType);
    }
}
