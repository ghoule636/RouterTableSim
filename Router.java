import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Routing Table Simulation
 * TCSS 430 Summer 2016
 * Group 5 Adam Marr, David Humphreys, Gabriel Houle
 */

 public class Router {
	 private String incomingIP;
	 private RoutingTable myRT;
	 private List<Entry> interfaces;

	public Router() {
		incomingIP = null;
		myRT = new RoutingTable();
		myRT.setUpInitialTable(10);
		interfaces = myRT.getAllEntries();
	}
	
	/**
	 * This is called when incomminIP was just changed. This method updates
	 * the table and sends the Packet the he appropriate interface
	 */
	public void send() {
		String route = myRT.findBestRoute(incomingIP);
		sendToInterface(route);
	}
	
	/**
	 * Generates a Random IP address
	 */
	public void recieveNextPacket() {
		Random rand = new Random();
		String ip = "";
        int randomIP = rand.nextInt(2);
        if (randomIP < 1) {
            incomingIP = myRT.pseudoRandomIPs[rand.nextInt(myRT.pseudoRandomIPs.length)];
        } else {
		    for(int i = 0; i < 4; i++) {
			    ip += "."  + (rand.nextInt(254) + 1);
		    }
            incomingIP = ip.substring(1);
		}
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
	 * "Sends" the incomingIP packet to a single interface
	 */
	private void sendToInterface(String nextRouterIP) {
		System.out.println("Packet Destined For: " + incomingIP + " Sent to : " + nextRouterIP + "!");
		incomingIP = null;
	}
	
	public String toString(){
		return myRT.toString();
	}

 }