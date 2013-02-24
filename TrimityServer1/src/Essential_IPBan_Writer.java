import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Essential_IPBan_Writer {

	public static void main(String[] args) throws Exception {    
	BufferedWriter bw = null;

	try {
	    bw = new BufferedWriter(new FileWriter("ip-bans.txt", true));
	    bw.write(Thread_Server_Main.IPv4);
	    bw.newLine();
	    bw.flush();
	} catch (IOException ioe) {
	    ioe.printStackTrace();
	} finally { // always close the file
	    if (bw != null) {
	        try {
	            bw.close();
	        } catch (IOException ioe2) {
	            // just ignore it
	        }
	    }
	  }
	
	}
}
