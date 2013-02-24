import java.io.*;


public class GameHandler_OnlineUsers {
	public static Integer CapasityLow = 75;
	public static Integer CapasityModerate = 150;
	public static Integer CapasityHigh = 225;
	public static Integer CapasityFull= 250;
	
	//user counteer
	public static Integer onlinecount= 0;
	
	
	public static void main(String[] args) throws Exception {
		
		do{
			
			
		}while(true);
		
		
	}
	
	public static void userconnect(String[] args) throws Exception {
		onlinecount = (onlinecount.intValue() + 1);
	}
	
	
	
	public static void userdisconnect(String[] args) throws Exception {
		onlinecount = (onlinecount.intValue() - 1);
	}
}
