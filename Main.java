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
