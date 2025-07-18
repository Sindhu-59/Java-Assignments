class Theatre {
	  static String name;
      static  String location;
      static  String owner;
       static String screenType;
       static String soundSystem;
       static String contactEmail;
       static String openingHours;
       static String website;
       static String seatingType;
       static String managerName;
       static int numberOfScreens ;
       static int totalSeats;
       static int parkingSlots;
       static int openingYear;
       static int dailyShows;
       static int snackCounters;
       static int staffCount;
       static int fireExits;
        static int ticketCounters;
       static int dailyFootfall;
       static long theatreID;
    public static void main(String[] args) {
         name = "Bharath Cinema ";
        location = "Shimoga";
         owner = "Star Entertainment";
         screenType = "IMAX";
         soundSystem = "Dolby Atmos";
         contactEmail = "info@grandcinema.com";
         openingHours = "10 AM - 12 AM";
         website = "www.grandcinema.com";
        seatingType = "Recliners";
        managerName = "Mr. Marigowda";
        numberOfScreens = 3;
        totalSeats = 1200;
        parkingSlots = 500;
        openingYear = 2016;
        dailyShows = 2;
        snackCounters = 5;
        staffCount = 40;
        fireExits = 12;
        ticketCounters = 4;
        dailyFootfall = 2500;
        theatreID = 7890123456L;

        System.out.println("Theatre Details ");
        System.out.println(name);
        System.out.println("Location: " + location);
        System.out.println("Owner: " + owner);
        System.out.println("Screen Type: " + screenType);
        System.out.println("Sound System: " + soundSystem);
        System.out.println("Contact Email: " + contactEmail);
        System.out.println("Opening Hours: " + openingHours);
        System.out.println("Website: " + website);
        System.out.println("Seating Type: " + seatingType);
        System.out.println("Manager: " + managerName);
        System.out.println("Number of Screens: " + numberOfScreens);
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("Parking Slots: " + parkingSlots);
        System.out.println("Opening Year: " + openingYear);
        System.out.println("Daily Shows: " + dailyShows);
        System.out.println("Snack Counters: " + snackCounters);
        System.out.println("Staff Count: " + staffCount);
        System.out.println("Fire Exits: " + fireExits);
        System.out.println("Ticket Counters: " + ticketCounters);
        System.out.println("Daily Footfall: " + dailyFootfall);
        System.out.println("Theatre ID: " + theatreID);
    }
}
