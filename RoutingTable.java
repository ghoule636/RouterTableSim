/**
 * Routing Table Simulation
 * TCSS 430 Summer 2016
 * Group 5 Adam Marr, David Humphreys, Gabriel Houle
 */

 import java.util.*;

 public class RoutingTable {
	List<Entry> entries;

	public RoutingTable() {
		entries = new ArrayList<Entry>();
//		for (int i = 0; i < 10; i++) {
//			Entry temp = new Entry();
//			temp.setSequenceNum(i);
//			entries.add(temp);
//		}
	}

	/**
	 * 
	 * @param theEntry this is the entry that is returned form routers giving us their info
	 * @return portNum returns the port number of the interface to send packet to
	 */
	public int update(Entry theEntry) {

	}

	public Entry getEntry(String theIP) {
		return entries.get(0);
	}

	public String toString() {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < entries.size(); i++) {
			result.append(entries.get(i) + "\n");
		}
		return result.toString();
	}
	
	/**
	 * Returns the index of the best route from the routing table
	 * @return index  of the best route returns -1 if no route
	 */
	private int findBestRoute(Entry theEntry) {
		System.err.println("findBestRoute() in Routing Table Incomplete");
		int index = 0;
		return index;
	}
	
	/**
	 * Sends the IP to all ports, to see if any neighboring routers have it
	 * @return index  of the best route returns -1 if no route
	 */
	private void broadcast(Entry theEntry) {
		System.err.println("broadcast() in Routing Table Incomplete");
	}
  }