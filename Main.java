public class Main {

	public static void main(String[] args) {
		Router routerA = new Router();
		char again = 'y';
		System.out.println("CREATE ROUTER");
		System.out.println(routerA);
		
		routerA.recieveNextPacket();
		
//		while(again == 'y' || again == 'Y') {
//			routerA.recieveNextPacket();
//			routerA.updateAndSend();
//		}
	}

}
