/**
 * Routing Table Simulation
 * TCSS 430 Summer 2016
 * Group 5 Adam Marr, David Humphreys, Gabriel Houle
 */

 import java.util.*;

 public class Entry implements Comparable<Entry> {
	
	//A static value so each new Entry gets an individual sequenceNum
	private static int sequenceCount = 0;
	
	private String destinationIP; // Using string to store ip for now.
	private String nextRouterIP;
	private int prefix;
	private int hops;
	private int portNum;
	private Date lastUpdate;
	private int sequenceNum;
	private boolean reachable;

	public Entry() {
		destinationIP = "0.0.0.0";
		nextRouterIP = "123.123.123.123";
		prefix = 0;
		hops = 10;
		portNum = 10;
		lastUpdate = new Date();
		sequenceCount++;
		sequenceNum = sequenceCount;
		reachable = true;
	}
	
	public Entry(String theDest_IP, String theNextRouterIP, int thePrefix, int theHops, int thePortNum, Date theLastUpdate, boolean isReachable) {
		destinationIP = theDest_IP;
		nextRouterIP = theNextRouterIP;
		prefix = thePrefix;
		hops = theHops;
		portNum = thePortNum;
		lastUpdate = theLastUpdate;
		sequenceCount++;
		sequenceNum = sequenceCount;
		reachable = isReachable;
	}

	public String getIP() {
		return destinationIP;
	}

	public void setSequenceNum(int theNum) {
		sequenceNum = theNum;
	}

	public int getPrefix() {
		return prefix;
	}

	@Override
	public String toString() {
		return String.format("SN: %2d Dest-IP: %16s/%-2d nextRouterIP: %16s Hops: %2d Last Update %20s Reachable: %s",
							 sequenceNum, destinationIP.toString(), prefix, nextRouterIP.toString(), hops, lastUpdate.toString(), String.valueOf(reachable));
	}

	@Override
	public int compareTo(Entry arg0) {
		return arg0.prefix - this.prefix;
	}
 }