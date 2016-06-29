/**
 * Routing Table Simulation
 * TCSS 430 Summer 2016
 * Group 5 Adam Marr, David Humphreys, Gabriel Houle
 */

 import java.util.*;
 import java.net.*;

 public class Entry {
	//InetAddress destinationIP; // InetAddress seems to be much more complicated than what we need.
	String destinationIP; // Using string to store ip for now.
	int hops;
	int portNum;
	Date lastUpdate;
	int sequenceNum;
	boolean reachable;

	public Entry() {
		//destinationIP = InetAddress.getByAddress(new byte[]{127, 0, 0, 1});
		destinationIP = "127.0.0.1";
		hops = 0;
		portNum = 0;
		lastUpdate = new Date();
		sequenceNum = 0;
		reachable = true;
	}

	public String getDestination() {
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