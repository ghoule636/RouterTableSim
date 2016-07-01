import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Routing Table Simulation
 * TCSS 430 Summer 2016
 * Group 5 Adam Marr, David Humphreys, Gabriel Houle
 */

 public class Router {
	 private String incommingIP;
	 private RoutingTable myRT;
	 private List<Entry> interfaces;

	public Router() {
		incommingIP = null;
		myRT = new RoutingTable();
		myRT.setUpInitialTable(10);
		interfaces = myRT.getAllEntries();
	}
	
	/**
	 * This is called when incomminIP was just changed. This method updates
	 * the table and sends the Packet the he appropriate interface
	 */
	public void send() {
		String route = myRT.findBestRoute(incommingIP);
		sendToInterface(route);
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
	}
	
	/**
	 * Updates our routing table from local routers tables
	 */
	public void updateRoutingTable() {
		RoutingTable updateFromOtherRouter = new RoutingTable();
		Entry newEntry = updateFromOtherRouter.randomEntry();
		myRT.update(newEntry);
	}
	
	/**
	 * "Sends" the incommingIP packet to a single interface
	 */
	private void sendToInterface(String nextRouterIP) {
		System.out.println("Packet Sent to : " + nextRouterIP + "!");
		incommingIP = null;
	}
	
	public String toString(){
		return myRT.toString();
	}

 }