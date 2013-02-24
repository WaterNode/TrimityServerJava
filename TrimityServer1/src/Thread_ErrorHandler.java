
public class Thread_ErrorHandler {
	public static void packetdrop(String[] args) throws Throwable{
		System.err.println("[ERROR][Thread_ErrorHandler]Failed to Accept Client.");
		Entity_PacketDrop_Counter.main(args);  
		
	}
	

	
	
}
