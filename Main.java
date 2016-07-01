/**
 * Routing Table Simulation
 * TCSS 430 Summer 2016
 * Group 5 Adam Marr, David Humphreys, Gabriel Houle
 */

public class Main {

	public static void main(String[] args) {
		Router routerA = new Router();
		char again = 'y';
		
		while(again == 'y' || again == 'Y') {
			routerA.recieveNextPacket();
			routerA.updateAndSend();
		}
	}

}
