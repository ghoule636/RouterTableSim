/**
 * Routing Table Simulation
 * TCSS 430 Summer 2016
 * Group 5 Adam Marr, David Humphreys, Gabriel Houle
 */

 import java.util.*;
 import java.net.*;

 public class Entry {
	
	//A static value so each new Entry gets an individual sequenceNum
	private static int sequenceCount = 0;
	
	//InetAddress destinationIP; // InetAddress seems to be much more complicated than what we need.
	private String destinationIP; // Using string to store ip for now.
	private int hops;
	private int portNum;
	private Date lastUpdate;
	private int sequenceNum;
	private boolean reachable;

	public Entry() {
		//destinationIP = InetAddress.getByAddress(new byte[]{127, 0, 0, 1});
		destinationIP = "127.0.0.1/32";
		hops = 0;
		portNum = 0;
		lastUpdate = new Date();
		sequenceCount++;
		sequenceNum = sequenceCount;
		reachable = true;
	}
	
	public Entry(String theDest_IP, int theHops, int thePortNum, Date theLastUpdate, boolean isReachable) {
		//destinationIP = InetAddress.getByAddress(new byte[]{127, 0, 0, 1});
		destinationIP = theDest_IP;
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

/*	public InetAddress getDestination() {
		return destinationIP;
	}*/

	@Override
	public String toString() {
		return "Sequence Number: " + sequenceNum + " Destination: " + destinationIP.toString() 
				+ " Hops: " + hops + " Last Update: " + lastUpdate.toString() + " Reachable: " + reachable;
	}
 }