public class SolarSystem {
	static String centralStar;
        static String galaxy ;
        static String largestPlanet;
        static String smallestPlanet ;
        static String mostVolcanic ;
        static String brightestObject;
        static String beltName ;
        static String discoveredBy;
        static String cometExample;
        static String futureMission;
        static int totalPlanets;
        static int dwarfPlanets;
        static int knownMoons ;
        static int asteroidBelts ;
        static int sunTemperature;
        static int sunDiameter ;
        static int earthOrbitDays;
        static int lightTravelTime;
        static int solarFlaresPerYear;
        static int distanceToEdge;
        static long systemID;

    public static void main(String[] args) {
        centralStar = "Sun";
        galaxy = "Milky Way";
        largestPlanet = "Jupiter";
        smallestPlanet = "Mercury";
        mostVolcanic = "Io";
        brightestObject = "Venus";
        beltName = "Asteroid Belt";
        discoveredBy = "Ancient Astronomers";
        String cometExample = "Halley's Comet";
        String futureMission = "Europa Clipper";
        totalPlanets = 8;
        dwarfPlanets = 5;
        knownMoons = 214;
        asteroidBelts = 2;
        sunTemperature = 5500; // °C
        sunDiameter = 1391000; // km
        earthOrbitDays = 365;
        lightTravelTime = 8; // minutes
        solarFlaresPerYear = 50;
        distanceToEdge = 100000; // AU
        systemID = 9001234567L;

        System.out.println("=== Solar System Details ===");
        System.out.println( centralStar);
        System.out.println(galaxy);
        System.out.println(largestPlanet);
        System.out.println(smallestPlanet);
        System.out.println(mostVolcanic);
        System.out.println( brightestObject);
        System.out.println( beltName);
        System.out.println( discoveredBy);
        System.out.println( cometExample);
        System.out.println( futureMission);
        System.out.println(totalPlanets);
        System.out.println(dwarfPlanets);
        System.out.println(knownMoons);
        System.out.println(asteroidBelts);
        System.out.println(sunTemperature + "°C");
        System.out.println(sunDiameter );
        System.out.println(earthOrbitDays );
        System.out.println(lightTravelTime );
        System.out.println( solarFlaresPerYear);
        System.out.println( distanceToEdge );
        System.out.println( systemID);
    }
}
