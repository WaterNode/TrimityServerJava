import java.net.*;
import java.io.*;
public class Essential_ExtIPGrabber {
	public static void main(String[] args) throws IOException {

		URL whatismyip = new URL("http://checkip.amazonaws.com");
		BufferedReader in = new BufferedReader(new InputStreamReader(
		                whatismyip.openStream()));

		String IP = in.readLine();
	System.out.println("[INFO][GetExtIP]Server online: " + IP + ":2321");
	System.out.println("[INFO][GetExtIP]NameServer online: " + IP + ":2322");
	System.err.println("[INFO]Thread_Server_MainAction Complete. Idling");
	}
}
