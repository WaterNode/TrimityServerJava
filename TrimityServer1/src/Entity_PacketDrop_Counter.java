
public class Entity_PacketDrop_Counter {
	static Integer PacketDropCount = 0;
	static Integer Cap = 0;
	
	public static void main(String[] args) throws Throwable {
		PacketDropCount = (PacketDropCount.intValue() + 1);
		System.err.println("[WARN][PacketDropCounter]Packet Drop Count: " + PacketDropCount);
		
		if (PacketDropCount > Cap) {;
			System.err.println("[WARN][PacketDropCounte;r]Launching anti-DDoS Mechanism");
			System.err.println("[WARN][PacketDropCounter]Type: Possible SYN-Attack");
			Entity_DDoS_CM.main(args);
		}
		else {
		
	
		}
		
		
		
		
		
		
	
	}
}
