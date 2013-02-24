package trimity.server.restart.coding;

import java.net.*;
import java.io.*;

public abstract class TSMain {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(1025);
		} catch (IOException e) {
			
		}
	}
}
