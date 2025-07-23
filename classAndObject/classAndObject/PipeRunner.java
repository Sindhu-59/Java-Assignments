class PipeRunner {
    public static void main(String args[]) {
        System.out.println("Main Started - Pipe Inventory Display");

        Pipe pipe1 = new Pipe();
        pipe1.pipeId = 1;
        pipe1.material = "PVC";
        pipe1.diameterCm = 5.0;
        pipe1.lengthCm = 600.0;
        pipe1.usage = "Water Supply";
        pipe1.pressureRatingPsi = 160.0;
        pipe1.pricePerMeter = 2.50;

        System.out.println("Pipe ID: " + pipe1.pipeId);
        System.out.println("Material: " + pipe1.material);
        System.out.println("Diameter: " + pipe1.diameterCm + " cm");
        System.out.println("Length: " + pipe1.lengthCm + " cm");
        System.out.println("Usage: " + pipe1.usage);
        System.out.println("Pressure Rating: " + pipe1.pressureRatingPsi + " PSI");
        System.out.println("Price per Meter: $" + pipe1.pricePerMeter);
        System.out.println();

        Pipe pipe2 = new Pipe();
        pipe2.pipeId = 2;
        pipe2.material = "Copper";
        pipe2.diameterCm = 2.0;
        pipe2.lengthCm = 300.0;
        pipe2.usage = "Hot Water";
        pipe2.pressureRatingPsi = 200.0;
        pipe2.pricePerMeter = 8.75;

        System.out.println("Pipe ID: " + pipe2.pipeId);
        System.out.println("Material: " + pipe2.material);
        System.out.println("Diameter: " + pipe2.diameterCm + " cm");
        System.out.println("Length: " + pipe2.lengthCm + " cm");
        System.out.println("Usage: " + pipe2.usage);
        System.out.println("Pressure Rating: " + pipe2.pressureRatingPsi + " PSI");
        System.out.println("Price per Meter: $" + pipe2.pricePerMeter);
        System.out.println();

        Pipe pipe3 = new Pipe();
        pipe3.pipeId = 3;
        pipe3.material = "Galvanized Steel";
        pipe3.diameterCm = 10.0;
        pipe3.lengthCm = 1200.0;
        pipe3.usage = "Gas Line";
        pipe3.pressureRatingPsi = 300.0;
        pipe3.pricePerMeter = 15.00;

        System.out.println("Pipe ID: " + pipe3.pipeId);
        System.out.println("Material: " + pipe3.material);
        System.out.println("Diameter: " + pipe3.diameterCm + " cm");
        System.out.println("Length: " + pipe3.lengthCm + " cm");
        System.out.println("Usage: " + pipe3.usage);
        System.out.println("Pressure Rating: " + pipe3.pressureRatingPsi + " PSI");
        System.out.println("Price per Meter: $" + pipe3.pricePerMeter);
        System.out.println();

        Pipe pipe4 = new Pipe();
        pipe4.pipeId = 4;
        pipe4.material = "Cast Iron";
        pipe4.diameterCm = 15.0;
        pipe4.lengthCm = 400.0;
        pipe4.usage = "Drainage";
        pipe4.pressureRatingPsi = 50.0;
        pipe4.pricePerMeter = 12.00;

        System.out.println("Pipe ID: " + pipe4.pipeId);
        System.out.println("Material: " + pipe4.material);
        System.out.println("Diameter: " + pipe4.diameterCm + " cm");
        System.out.println("Length: " + pipe4.lengthCm + " cm");
        System.out.println("Usage: " + pipe4.usage);
        System.out.println("Pressure Rating: " + pipe4.pressureRatingPsi + " PSI");
        System.out.println("Price per Meter: $" + pipe4.pricePerMeter);
        System.out.println();

        Pipe pipe5 = new Pipe();
        pipe5.pipeId = 5;
        pipe5.material = "PEX";
        pipe5.diameterCm = 1.5;
        pipe5.lengthCm = 2000.0;
        pipe5.usage = "Potable Water";
        pipe5.pressureRatingPsi = 100.0;
        pipe5.pricePerMeter = 1.80;

        System.out.println("Pipe ID: " + pipe5.pipeId);
        System.out.println("Material: " + pipe5.material);
        System.out.println("Diameter: " + pipe5.diameterCm + " cm");
        System.out.println("Length: " + pipe5.lengthCm + " cm");
        System.out.println("Usage: " + pipe5.usage);
        System.out.println("Pressure Rating: " + pipe5.pressureRatingPsi + " PSI");
        System.out.println("Price per Meter: $" + pipe5.pricePerMeter);
        System.out.println();

        Pipe pipe6 = new Pipe();
        pipe6.pipeId = 6;
        pipe6.material = "Stainless Steel";
        pipe6.diameterCm = 7.5;
        pipe6.lengthCm = 800.0;
        pipe6.usage = "Chemical Transport";
        pipe6.pressureRatingPsi = 400.0;
        pipe6.pricePerMeter = 25.00;

        System.out.println("Pipe ID: " + pipe6.pipeId);
        System.out.println("Material: " + pipe6.material);
        System.out.println("Diameter: " + pipe6.diameterCm + " cm");
        System.out.println("Length: " + pipe6.lengthCm + " cm");
        System.out.println("Usage: " + pipe6.usage);
        System.out.println("Pressure Rating: " + pipe6.pressureRatingPsi + " PSI");
        System.out.println("Price per Meter: $" + pipe6.pricePerMeter);
        System.out.println();

        Pipe pipe7 = new Pipe();
        pipe7.pipeId = 7;
        pipe7.material = "HDPE";
        pipe7.diameterCm = 20.0;
        pipe7.lengthCm = 5000.0;
        pipe7.usage = "Sewer Line";
        pipe7.pressureRatingPsi = 80.0;
        pipe7.pricePerMeter = 7.50;

        System.out.println("Pipe ID: " + pipe7.pipeId);
        System.out.println("Material: " + pipe7.material);
        System.out.println("Diameter: " + pipe7.diameterCm + " cm");
        System.out.println("Length: " + pipe7.lengthCm + " cm");
        System.out.println("Usage: " + pipe7.usage);
        System.out.println("Pressure Rating: " + pipe7.pressureRatingPsi + " PSI");
        System.out.println("Price per Meter: $" + pipe7.pricePerMeter);
        System.out.println();

        Pipe pipe8 = new Pipe();
        pipe8.pipeId = 8;
        pipe8.material = "Brass";
        pipe8.diameterCm = 1.0;
        pipe8.lengthCm = 100.0;
        pipe8.usage = "Fittings/Small Connections";
        pipe8.pressureRatingPsi = 180.0;
        pipe8.pricePerMeter = 10.00;

        System.out.println("Pipe ID: " + pipe8.pipeId);
        System.out.println("Material: " + pipe8.material);
        System.out.println("Diameter: " + pipe8.diameterCm + " cm");
        System.out.println("Length: " + pipe8.lengthCm + " cm");
        System.out.println("Usage: " + pipe8.usage);
        System.out.println("Pressure Rating: " + pipe8.pressureRatingPsi + " PSI");
        System.out.println("Price per Meter: $" + pipe8.pricePerMeter);
        System.out.println();

        Pipe pipe9 = new Pipe();
        pipe9.pipeId = 9;
        pipe9.material = "Carbon Steel";
        pipe9.diameterCm = 30.0;
        pipe9.lengthCm = 10000.0;
        pipe9.usage = "Oil & Gas Pipeline";
        pipe9.pressureRatingPsi = 1000.0;
        pipe9.pricePerMeter = 50.00;

        System.out.println("Pipe ID: " + pipe9.pipeId);
        System.out.println("Material: " + pipe9.material);
        System.out.println("Diameter: " + pipe9.diameterCm + " cm");
        System.out.println("Length: " + pipe9.lengthCm + " cm");
        System.out.println("Usage: " + pipe9.usage);
        System.out.println("Pressure Rating: " + pipe9.pressureRatingPsi + " PSI");
        System.out.println("Price per Meter: $" + pipe9.pricePerMeter);
        System.out.println();

        Pipe pipe10 = new Pipe();
        pipe10.pipeId = 10;
        pipe10.material = "ABS";
        pipe10.diameterCm = 7.5;
        pipe10.lengthCm = 500.0;
        pipe10.usage = "DWV (Drain, Waste, Vent)";
        pipe10.pressureRatingPsi = 60.0;
        pipe10.pricePerMeter = 3.00;

        System.out.println("Pipe ID: " + pipe10.pipeId);
        System.out.println("Material: " + pipe10.material);
        System.out.println("Diameter: " + pipe10.diameterCm + " cm");
        System.out.println("Length: " + pipe10.lengthCm + " cm");
        System.out.println("Usage: " + pipe10.usage);
        System.out.println("Pressure Rating: " + pipe10.pressureRatingPsi + " PSI");
        System.out.println("Price per Meter: $" + pipe10.pricePerMeter);
        System.out.println();

        Pipe pipe11 = new Pipe();
        pipe11.pipeId = 11;
        pipe11.material = "Ductile Iron";
        pipe11.diameterCm = 40.0;
        pipe11.lengthCm = 7000.0;
        pipe11.usage = "Main Water Line";
        pipe11.pressureRatingPsi = 250.0;
        pipe11.pricePerMeter = 40.00;

        System.out.println("Pipe ID: " + pipe11.pipeId);
        System.out.println("Material: " + pipe11.material);
        System.out.println("Diameter: " + pipe11.diameterCm + " cm");
        System.out.println("Length: " + pipe11.lengthCm + " cm");
        System.out.println("Usage: " + pipe11.usage);
        System.out.println("Pressure Rating: " + pipe11.pressureRatingPsi + " PSI");
        System.out.println("Price per Meter: $" + pipe11.pricePerMeter);
        System.out.println();

        Pipe pipe12 = new Pipe();
        pipe12.pipeId = 12;
        pipe12.material = "Polypropylene (PP)";
        pipe12.diameterCm = 3.0;
        pipe12.lengthCm = 900.0;
        pipe12.usage = "Chemical Waste";
        pipe12.pressureRatingPsi = 120.0;
        pipe12.pricePerMeter = 4.50;

        System.out.println("Pipe ID: " + pipe12.pipeId);
        System.out.println("Material: " + pipe12.material);
        System.out.println("Diameter: " + pipe12.diameterCm + " cm");
        System.out.println("Length: " + pipe12.lengthCm + " cm");
        System.out.println("Usage: " + pipe12.usage);
        System.out.println("Pressure Rating: " + pipe12.pressureRatingPsi + " PSI");
        System.out.println("Price per Meter: $" + pipe12.pricePerMeter);
        System.out.println();

        Pipe pipe13 = new Pipe();
        pipe13.pipeId = 13;
        pipe13.material = "Glass Fiber Reinforced Plastic (GRP)";
        pipe13.diameterCm = 50.0;
        pipe13.lengthCm = 2000.0;
        pipe13.usage = "Industrial Water";
        pipe13.pressureRatingPsi = 150.0;
        pipe13.pricePerMeter = 60.00;

        System.out.println("Pipe ID: " + pipe13.pipeId);
        System.out.println("Material: " + pipe13.material);
        System.out.println("Diameter: " + pipe13.diameterCm + " cm");
        System.out.println("Length: " + pipe13.lengthCm + " cm");
        System.out.println("Usage: " + pipe13.usage);
        System.out.println("Pressure Rating: " + pipe13.pressureRatingPsi + " PSI");
        System.out.println("Price per Meter: $" + pipe13.pricePerMeter);
        System.out.println();

        Pipe pipe14 = new Pipe();
        pipe14.pipeId = 14;
        pipe14.material = "Lead"; // Historically used, now rare for water
        pipe14.diameterCm = 2.5;
        pipe14.lengthCm = 200.0;
        pipe14.usage = "Old Plumbing";
        pipe14.pressureRatingPsi = 100.0;
        pipe14.pricePerMeter = 18.00;

        System.out.println("Pipe ID: " + pipe14.pipeId);
        System.out.println("Material: " + pipe14.material);
        System.out.println("Diameter: " + pipe14.diameterCm + " cm");
        System.out.println("Length: " + pipe14.lengthCm + " cm");
        System.out.println("Usage: " + pipe14.usage);
        System.out.println("Pressure Rating: " + pipe14.pressureRatingPsi + " PSI");
        System.out.println("Price per Meter: $" + pipe14.pricePerMeter);
        System.out.println();

        Pipe pipe15 = new Pipe();
        pipe15.pipeId = 15;
        pipe15.material = "Concrete";
        pipe15.diameterCm = 100.0;
        pipe15.lengthCm = 3000.0;
        pipe15.usage = "Large Storm Drains";
        pipe15.pressureRatingPsi = 20.0;
        pipe15.pricePerMeter = 80.00;

        System.out.println("Pipe ID: " + pipe15.pipeId);
        System.out.println("Material: " + pipe15.material);
        System.out.println("Diameter: " + pipe15.diameterCm + " cm");
        System.out.println("Length: " + pipe15.lengthCm + " cm");
        System.out.println("Usage: " + pipe15.usage);
        System.out.println("Pressure Rating: " + pipe15.pressureRatingPsi + " PSI");
        System.out.println("Price per Meter: $" + pipe15.pricePerMeter);
        System.out.println();

        System.out.println("Main Ended - Pipe Inventory Display Complete");
    }
}