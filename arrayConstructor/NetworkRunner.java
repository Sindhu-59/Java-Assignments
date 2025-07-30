class NetworkRunner {
    public static void main(String[] args) {

        Network n1 = new Network("HomeNet","LAN");
        
		System.out.println("name: " + n1.name);
		System.out.println("type: " + n1.type);
		
		Network n2 = new Network(1000.0);
		System.out.println("bandwidth: " +n2. bandwidth);
		
		Network n3 = new Network(5);
		System.out.println("connectedDevices: " + n3.connectedDevices);
		
		Network n4 = new Network(false);
		System.out.println("isWireless: " + n4.isWireless);
		
		Network n5 = new Network("IPv6");
		System.out.println("protocol: " +n5.protocol);
	}
}
