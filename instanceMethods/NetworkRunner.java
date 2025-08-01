class NetworkRunner {
    public static void main(String[] args) {

        Network n1 = new Network();
        n1.name = "HomeNet";
        n1.type = "LAN";
        n1.bandwidth = 100.0;
        n1.connectedDevices = 5;
        n1.isWireless = true;
        n1.protocol = "IPv4";
        System.out.println("n1.name: " + n1.name);
		System.out.println("n1.type: " + n1.type);
		System.out.println("n1.bandwidth: " + n1.bandwidth);
		System.out.println("n1.connectedDevices: " + n1.connectedDevices);
		System.out.println("n1.isWireless: " + n1.isWireless);
		System.out.println("n1.protocol: " + n1.protocol);

        Network n2 = new Network();
        n2.name = "OfficeNet";
        n2.type = "WAN";
        n2.bandwidth = 1000.0;
        n2.connectedDevices = 200;
        n2.isWireless = false;
        n2.protocol = "IPv6";
        System.out.println("n2.name: " + n2.name);
		System.out.println("n1.name: " + n2.name);
		System.out.println("n1.type: " + n2.type);
		System.out.println("n1.bandwidth: " + n2.bandwidth);
		System.out.println("n1.connectedDevices: " + n2.connectedDevices);
		System.out.println("n1.isWireless: " + n2.isWireless);
		System.out.println("n1.protocol: " + n2.protocol);

        Network n3 = new Network();
        n3.name = "CaféWiFi";
        n3.type = "WLAN";
        n3.bandwidth = 50.0;
        n3.connectedDevices = 15;
        n3.isWireless = true;
        n3.protocol = "IPv4";
        System.out.println("n3.name: " + n3.name);
		System.out.println("n1.name: " + n3.name);
		System.out.println("n1.type: " + n3.type);
		System.out.println("n1.bandwidth: " + n3.bandwidth);
		System.out.println("n1.connectedDevices: " + n3.connectedDevices);
		System.out.println("n1.isWireless: " + n3.isWireless);
		System.out.println("n1.protocol: " + n3.protocol);

        Network n4 = new Network();
        n4.name = "CollegeNet";
        n4.type = "MAN";
        n4.bandwidth = 500.0;
        n4.connectedDevices = 300;
        n4.isWireless = true;
        n4.protocol = "IPv6";
        System.out.println("n4.name: " + n4.name);System.out.println("n1.name: " + n1.name);
		System.out.println("n1.type: " + n4.type);
		System.out.println("n1.bandwidth: " + n4.bandwidth);
		System.out.println("n1.connectedDevices: " + n4.connectedDevices);
		System.out.println("n1.isWireless: " + n4.isWireless);
		System.out.println("n1.protocol: " + n4.protocol);

        Network n5 = new Network();
        n5.name = "ISPBackbone";
        n5.type = "WAN";
        n5.bandwidth = 10000.0;
        n5.connectedDevices = 10000;
        n5.isWireless = false;
        n5.protocol = "IPv6";
        System.out.println("n5.name: " + n5.name);
		System.out.println("n1.name: " + n5.name);
		System.out.println("n1.type: " + n5.type);
		System.out.println("n1.bandwidth: " + n5.bandwidth);
		System.out.println("n1.connectedDevices: " + n5.connectedDevices);
		System.out.println("n1.isWireless: " + n5.isWireless);
		System.out.println("n1.protocol: " + n5.protocol);

        Network n6 = new Network();
        n6.name = "MobileHotspot";
        n6.type = "PAN";
        n6.bandwidth = 20.0;
        n6.connectedDevices = 3;
        n6.isWireless = true;
        n6.protocol = "IPv4";
        System.out.println("n6.name: " + n6.name);
		System.out.println("n1.name: " + n6.name);
		System.out.println("n1.type: " + n6.type);
		System.out.println("n1.bandwidth: " + n6.bandwidth);
		System.out.println("n1.connectedDevices: " + n6.connectedDevices);
		System.out.println("n1.isWireless: " + n6.isWireless);
		System.out.println("n1.protocol: " + n6.protocol);

        Network n7 = new Network();
        n7.name = "LibraryNet";
        n7.type = "LAN";
        n7.bandwidth = 200.0;
        n7.connectedDevices = 50;
        n7.isWireless = false;
        n7.protocol = "IPv4";
        System.out.println("n7.name: " + n7.name);
		System.out.println("n1.name: " + n7.name);
		System.out.println("n1.type: " + n7.type);
		System.out.println("n1.bandwidth: " + n7.bandwidth);
		System.out.println("n1.connectedDevices: " + n7.connectedDevices);
		System.out.println("n1.isWireless: " + n7.isWireless);
		System.out.println("n1.protocol: " + n7.protocol);

        Network n8 = new Network();
        n8.name = "AirportWiFi";
        n8.type = "WLAN";
        n8.bandwidth = 300.0;
        n8.connectedDevices = 120;
        n8.isWireless = true;
        n8.protocol = "IPv6";
        System.out.println("n8.name: " + n8.name);
		System.out.println("n1.name: " + n8.name);
		System.out.println("n1.type: " + n8.type);
		System.out.println("n1.bandwidth: " + n8.bandwidth);
		System.out.println("n1.connectedDevices: " + n8.connectedDevices);
		System.out.println("n1.isWireless: " + n8.isWireless);
		System.out.println("n1.protocol: " + n8.protocol);

        Network n9 = new Network();
        n9.name = "HospitalNet";
        n9.type = "LAN";
        n9.bandwidth = 600.0;
        n9.connectedDevices = 250;
        n9.isWireless = true;
        n9.protocol = "IPv6";
        System.out.println("n9.name: " + n9.name);
		System.out.println("n1.name: " + n9.name);
		System.out.println("n1.type: " + n9.type);
		System.out.println("n1.bandwidth: " + n9.bandwidth);
		System.out.println("n1.connectedDevices: " + n9.connectedDevices);
		System.out.println("n1.isWireless: " + n9.isWireless);
		System.out.println("n1.protocol: " + n9.protocol);

        Network n10 = new Network();
        n10.name = "DataCenterNet";
        n10.type = "SAN";
        n10.bandwidth = 5000.0;
        n10.connectedDevices = 400;
        n10.isWireless = false;
        n10.protocol = "IPv6";
        System.out.println("n10.name: " + n10.name);
		System.out.println("n1.name: " + n10.name);
		System.out.println("n1.type: " + n10.type);
		System.out.println("n1.bandwidth: " + n10.bandwidth);
		System.out.println("n1.connectedDevices: " + n10.connectedDevices);
		System.out.println("n1.isWireless: " + n10.isWireless);
		System.out.println("n1.protocol: " + n10.protocol);

        Network n11 = new Network();
        n11.name = "GuestNetwork";
        n11.type = "WLAN";
        n11.bandwidth = 80.0;
        n11.connectedDevices = 10;
        n11.isWireless = true;
        n11.protocol = "IPv4";
        System.out.println("n11.name: " + n11.name);
		System.out.println("n1.name: " + n11.name);
		System.out.println("n1.type: " + n11.type);
		System.out.println("n1.bandwidth: " + n11.bandwidth);
		System.out.println("n1.connectedDevices: " + n11.connectedDevices);
		System.out.println("n1.isWireless: " + n11.isWireless);
		System.out.println("n1.protocol: " + n11.protocol);

        Network n12 = new Network();
        n12.name = "IoTNetwork";
        n12.type = "PAN";
        n12.bandwidth = 10.0;
        n12.connectedDevices = 25;
        n12.isWireless = true;
        n12.protocol = "IPv6";
        System.out.println("n12.name: " + n12.name);
		System.out.println("n1.name: " + n12.name);
		System.out.println("n1.type: " + n12.type);
		System.out.println("n1.bandwidth: " + n12.bandwidth);
		System.out.println("n1.connectedDevices: " + n12.connectedDevices);
		System.out.println("n1.isWireless: " + n12.isWireless);
		System.out.println("n1.protocol: " + n12.protocol);

        Network n13 = new Network();
        n13.name = "SchoolWiFi";
        n13.type = "LAN";
        n13.bandwidth = 150.0;
        n13.connectedDevices = 80;
        n13.isWireless = true;
        n13.protocol = "IPv4";
        System.out.println("n13.name: " + n13.name);
		System.out.println("n1.name: " + n13.name);
		System.out.println("n1.type: " + n13.type);
		System.out.println("n1.bandwidth: " + n13.bandwidth);
		System.out.println("n1.connectedDevices: " + n13.connectedDevices);
		System.out.println("n1.isWireless: " + n13.isWireless);
		System.out.println("n1.protocol: " + n13.protocol);

        Network n14 = new Network();
        n14.name = "GamingLAN";
        n14.type = "LAN";
        n14.bandwidth = 250.0;
        n14.connectedDevices = 20;
        n14.isWireless = false;
        n14.protocol = "IPv6";
        System.out.println("n14.name: " + n14.name);
		System.out.println("n1.name: " + n14.name);
		System.out.println("n1.type: " + n14.type);
		System.out.println("n1.bandwidth: " + n14.bandwidth);
		System.out.println("n1.connectedDevices: " + n14.connectedDevices);
		System.out.println("n1.isWireless: " + n14.isWireless);
		System.out.println("n1.protocol: " + n14.protocol);

        Network n15 = new Network();
        n15.name = "CloudInfraNet";
        n15.type = "WAN";
        n15.bandwidth = 9000.0;
        n15.connectedDevices = 15000;
        n15.isWireless = false;
        n15.protocol = "IPv6";
        System.out.println("n15.name: " + n15.name);
		System.out.println("n1.name: " + n15.name);
		System.out.println("n1.type: " + n15.type);
		System.out.println("n1.bandwidth: " + n15.bandwidth);
		System.out.println("n1.connectedDevices: " + n15.connectedDevices);
		System.out.println("n1.isWireless: " + n15.isWireless);
		System.out.println("n1.protocol: " + n15.protocol);

        Network n16 = new Network();
        n16.name = "BankingNet";
        n16.type = "LAN";
        n16.bandwidth = 700.0;
        n16.connectedDevices = 120;
        n16.isWireless = false;
        n16.protocol = "IPv6";
        System.out.println("n16.name: " + n16.name);
		System.out.println("n1.name: " + n16.name);
		System.out.println("n1.type: " + n16.type);
		System.out.println("n1.bandwidth: " + n16.bandwidth);
		System.out.println("n1.connectedDevices: " + n16.connectedDevices);
		System.out.println("n1.isWireless: " + n16.isWireless);
		System.out.println("n1.protocol: " + n16.protocol);

        Network n17 = new Network();
        n17.name = "ResearchNet";
        n17.type = "MAN";
        n17.bandwidth = 1200.0;
        n17.connectedDevices = 500;
        n17.isWireless = true;
        n17.protocol = "IPv6";
        System.out.println("n17.name: " + n17.name);
		System.out.println("n1.name: " + n17.name);
		System.out.println("n1.type: " + n17.type);
		System.out.println("n1.bandwidth: " + n17.bandwidth);
		System.out.println("n1.connectedDevices: " + n17.connectedDevices);
		System.out.println("n1.isWireless: " + n17.isWireless);
		System.out.println("n1.protocol: " + n17.protocol);

        Network n18 = new Network();
        n18.name = "WarehouseNet";
        n18.type = "LAN";
        n18.bandwidth = 100.0;
        n18.connectedDevices = 30;
        n18.isWireless = true;
        n18.protocol = "IPv4";
        System.out.println("n18.name: " + n18.name);
		System.out.println("n1.name: " + n18.name);
		System.out.println("n1.type: " + n18.type);
		System.out.println("n1.bandwidth: " + n18.bandwidth);
		System.out.println("n1.connectedDevices: " + n18.connectedDevices);
		System.out.println("n1.isWireless: " + n18.isWireless);
		System.out.println("n1.protocol: " + n18.protocol);

        Network n19 = new Network();
        n19.name = "CafeNet";
        n19.type = "WLAN";
        n19.bandwidth = 40.0;
        n19.connectedDevices = 8;
        n19.isWireless = true;
        n19.protocol = "IPv4";
        System.out.println("n19.name: " + n19.name);
		System.out.println("n1.name: " + n19.name);
		System.out.println("n1.type: " + n19.type);
		System.out.println("n1.bandwidth: " + n19.bandwidth);
		System.out.println("n1.connectedDevices: " + n19.connectedDevices);
		System.out.println("n1.isWireless: " + n19.isWireless);
		System.out.println("n1.protocol: " + n19.protocol);

        Network n20 = new Network();
        n20.name = "BusWiFi";
        n20.type = "Mobile Network";
        n20.bandwidth = 15.0;
        n20.connectedDevices = 10;
        n20.isWireless = true;
        n20.protocol = "IPv4";
        System.out.println("n20.name: " + n20.name);
		System.out.println("n1.name: " + n20.name);
		System.out.println("n1.type: " + n20.type);
		System.out.println("n1.bandwidth: " + n20.bandwidth);
		System.out.println("n1.connectedDevices: " + n20.connectedDevices);
		System.out.println("n1.isWireless: " + n20.isWireless);
		System.out.println("n1.protocol: " + n20.protocol);
    }
}
