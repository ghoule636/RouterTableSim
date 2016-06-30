import java.util.Random;

/**
 * Routing Table Simulation
 * TCSS 430 Summer 2016
 * Group 5 Adam Marr, David Humphreys, Gabriel Houle
 */

 public class Router {
	 private String incommingIP;
	 private RoutingTable myRT;
	 private Router[] interfaces;

	public Router() {
		incommingIP = null;
		myRT = new RoutingTable();
		System.out.println(myRT);
	}
	
	/**
	 * This is called when incomminIP was just changed. This method updates
	 * the table and sends the Packet the he appropriate interface
	 */
	public void updateAndSend() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Generates a Random IP address
	 */
	public void recieveNextPacket() {
		Random rand = new Random();
		String ip = "";
		for(int i = 0; i < 4; i++) {
			ip += "."  + (rand.nextInt(254) + 1);
		}
		incommingIP = ip.substring(1);
		System.out.println(incommingIP);
	}
	
	/**
	 * "Sends" the incommingIP packet to a single interface
	 */
	private void sendToInterface(int portNum) {
		//Send packet to next Router
		incommingIP = null;
	}
	
	/**
	 * Sends the incommingIP to all interfaces
	 */
	private void broadcast() {
		//send packet to all interfaces(routers)
	}

 }