class SwitchBoard {
	static int totalButtons = 10;
      static  int warrantyYears = 2;
       static int voltageRating = 220;
       static int fuseCapacity = 16;
       static int panelDepth = 6;
       static long serialNumber = 9876543210L;
       static long maxLoad = 5000L;
       static long installationDateEpoch = 1622505600L;
       static long safetyCertificateNumber = 4567891230L;
       static long modelNumber = 1234567890L;
       static String brand = "Anchor";
       static String color = "White";
        static String material = "Polycarbonate";
       static String type = "Modular";
       static String manufacturer = "Panasonic";
       static String manufacturingDate = "2024-04-15";
       static String placeOfManufacture = "Chennai";
       static String standardCompliance = "IS 3854";
       static String distributor = "HomeElectro Distributors";
       static String switchType = "Rocker";
    public static void main(String[] args) {
		 totalButtons = 10;
       warrantyYears = 2;
        voltageRating = 220;
       fuseCapacity = 16;
        panelDepth = 6;
        serialNumber = 9876543210L;
        maxLoad = 5000L;
        installationDateEpoch = 1622505600L;
        safetyCertificateNumber = 4567891230L;
       modelNumber = 1234567890L;
       brand = "Anchor";
      color = "White";
         material = "Polycarbonate";
         type = "Modular";
         manufacturer = "Panasonic";
         manufacturingDate = "2024-04-15";
         placeOfManufacture = "Chennai";
         standardCompliance = "IS 3854";
       distributor = "HomeElectro Distributors";
        switchType = "Rocker";
        
        System.out.println("Switch Type: " + switchType);
        System.out.println("Fuse Capacity: " + fuseCapacity);
        System.out.println("Material: " + material);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Color: " + color);
        System.out.println("Max Load: " + maxLoad);
        System.out.println("Voltage Rating: " + voltageRating);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Warranty Years: " + warrantyYears);
        System.out.println("Brand: " + brand);
        System.out.println("Installation Date (Epoch): " + installationDateEpoch);
        System.out.println("Standard Compliance: " + standardCompliance);
        System.out.println("Panel Depth: " + panelDepth);
        System.out.println("Safety Certificate Number: " + safetyCertificateNumber);
        System.out.println("Place of Manufacture: " + placeOfManufacture);
        System.out.println("Total Buttons: " + totalButtons);
        System.out.println("Distributor: " + distributor);
        System.out.println("Manufacturing Date: " + manufacturingDate);
        System.out.println("Type: " + type);
    }
}
