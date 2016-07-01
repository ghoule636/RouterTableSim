import java.util.concurrent.TimeUnit;

/**
 * Routing Table Simulation
 * TCSS 430 Summer 2016
 * Group 5 Adam Marr, David Humphreys, Gabriel Houle
 */

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Router routerA = new Router();
		char again = 'y';
		System.out.println("CREATE ROUTER");
		System.out.println(routerA);
		
//		String IP = "192.168.2.6";
//		Entry testEntry = new Entry("192.168.3.1", IP, 24, 5, 1, null, true);
//		
//		RoutingTable testRT = new RoutingTable();
//		testRT.update(testEntry);
//		testRT.checkForMatch(IP, testEntry);
		int getUpdate = 0;
		while(again == 'y' || again == 'Y') {
			routerA.recieveNextPacket();
			routerA.send();
			if(getUpdate % 3 == 1) {
				routerA.updateRoutingTable();
			}
			System.out.println(routerA);
			getUpdate++;
//			TimeUnit.SECONDS.sleep(1);
		}
	}

}
