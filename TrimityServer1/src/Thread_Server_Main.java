

import java.net.*;
import java.util.StringTokenizer;
import java.io.*;


public class Thread_Server_Main {
	 static String IPv4 = null;
	public static void main(String[] args) throws Throwable {
		Socket clientSocket = null;
        ServerSocket serverSocket = null;
        try {
        	
            serverSocket = new ServerSocket(2321);
            //CheckServerAuthKey
        	Essential_CheckServerAuthKey.main(args);
            System.out.println("[INFO]TrimityServer 1.0.0.0");
        	System.out.println("[INFO]Created By Elycin and WaterNode");
        	System.out.println("[TEXT]----------------------");
        	System.out.println("[INFO]Thread_Server_MainPort 2321 opened");
            System.out.println("[INFO]Calling ThreadNameServer");
            System.out.println("[TEXT]----------------------");
            Thread_Server_NameServer.main(args);
        } catch (IOException e) {
        	
            System.err.println("[ERROR]Failed to Start on Port 2321");
            System.err.println("[ERROR]Is it already Running?");
            System.exit(1);
        }
 
        
        do{
        try {
        	//connect
            clientSocket = serverSocket.accept();
            //Send Message
            System.out.println("[INFO]Client Connected");
            //Get IP
            IPv4 = serverSocket.getInetAddress().getHostAddress();
            //Checkbans
            
            RandomAccessFile f = new RandomAccessFile("ip-bans.txt", "r");
    		String s= f.readUTF();
    		StringTokenizer st = new StringTokenizer(s);
    		while (st.hasMoreTokens())
    		if(st.nextToken().equals(IPv4)) {
    			f.close();
    			serverSocket.close();
    	    }
    	 	
        } catch (IOException e) {
            Thread_ErrorHandler.packetdrop(args);
        }
        }while(true);
        
        
	}
}
        
