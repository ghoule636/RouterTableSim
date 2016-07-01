/**
 * Routing Table Simulation
 * TCSS 430 Summer 2016
 * Group 5 Adam Marr, David Humphreys, Gabriel Houle
 */

 import java.util.*;

 public class RoutingTable {
	private List<Entry> entries;

	public RoutingTable() {
		entries = new ArrayList<Entry>();
//		for (int i = 0; i < 10; i++) {
//			Entry temp = new Entry();
//			temp.setSequenceNum(i);
//			entries.add(temp);
//		}
	}

	/**
	 * Just takes the incomming entry and updates the table
	 * @param theEntry this is the entry that is returned form routers giving us their info
	 * @return portNum returns the port number of the interface to send packet to
	 */
	public int update(Entry theEntry) {
		return 0;
	}

	public List<Entry> getAllEntries() {
		return entries;
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
	public String findBestRoute(String IP) {
		Collections.sort(entries);
		for(int i = 0; i < entries.size(); i++) {
			checkForMatch(IP, entries.get(i));
		}
		
		return "";
	}

	private boolean checkForMatch(String iP, Entry entry) {
		// TODO Auto-generated method stub
		
	}
	
//	public String toBinary(String IP) {
//		System.out.println(IP);
//		String[] tempIP = IP.split("\\.");
//		System.out.println(tempIP.length);
//		String binaryRep = "";
//		for(int i = 0; i < tempIP.length; i++) {
//			binaryRep += Integer.par
//		}
//		System.out.println(binaryRep);
//		return binaryRep;
//	}
  


	public void setUpInitialTable(int size) {
		entries.add(new Entry());
		for(int i = 0; i < size - 1; i++) {
			entries.add(randomEntry());
		}
	}
	
	/**
	 * Just takes the incomming entry and updates the table
	 * @param theEntry this is the entry that is returned form routers giving us their info
	 * @return portNum returns the port number of the interface to send packet to
	 */
	private Entry randomEntry() {
		Random rand = new Random();
		String destIP = generateRandomIP();
		String nextRouterIP = generateRandomIP();
		int prefix = rand.nextInt(11) + 16;
		int hops = rand.nextInt(10);
		int portNum = rand.nextInt(10);
		Date time = new Date();
		boolean reachable = true;
		return new Entry(destIP, nextRouterIP, prefix, hops, portNum, time, reachable);
	}
	
	
	/**
	 * Generates a Random IP address
	 */
	public String generateRandomIP() {
		Random rand = new Random();
		String ip = "";
		for(int i = 0; i < 4; i++) {
			ip += "."  + (rand.nextInt(254) + 1);
		}
		return ip.substring(1);
	}
}
 
 
 