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
		for (int i = 0; i < 10; i++) {
			Entry temp = new Entry();
			temp.setSequenceNum(i);
			entries.add(temp);
		}
	}

	public int update(Entry theEntry) {
		
		return 0;
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
  }