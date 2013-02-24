

import java.net.*;
import java.io.*;


public class Thread_Server_NameServer {
	public static void main(String[] args) throws Throwable {
		ServerSocket serverSocket = null;
        try {
        	
            serverSocket = new ServerSocket(2322);
            System.out.println("[INFO][Thread_Server_NameServer]Port 2322 opened");
            Essential_ExtIPGrabber.main(args);
        } catch (IOException e) {
        	
          System.err.println("[ERROR]Failed to Start on Port 2322");
            System.err.println("Is it already Running?");
            System.exit(1);
        };
 
        Socket clientSocket = null;
        do{
        try {
            clientSocket = serverSocket.accept();
            Thread_Server_Main.IPv4 = serverSocket.getInetAddress().getHostAddress();
            PrintWriter outToServer = new PrintWriter(clientSocket.getOutputStream(),true);
            String EndServerName = "Beep Boop, If you can See that clearly, Sockets are working C:";

            
            //Fixed Servername
            outToServer.println(EndServerName);
            //LogSent
            System.out.println("[INFO][Thread_Server_NameServer]Client "+ Thread_Server_Main.IPv4 +" Requested String 'EndServerName'");
        } catch (IOException e) {
           Thread_ErrorHandler.packetdrop(args);
        }
        }while(true);
 
    }
}
