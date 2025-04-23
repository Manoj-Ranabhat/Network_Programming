import java.io.*;
import java.net.*;

public class SocketInfo {

    public static void main(String args[]) {
        for (String host : args) {
            try {
                Socket thesocket = new Socket(host, 80);
                System.out.println("Connected to " + thesocket.getInetAddress() + " on port  " + thesocket.getPort()
                        + " from port "
                        + thesocket.getLocalPort() + " of " + thesocket.getLocalAddress());

            } catch (UnknownHostException ex) {
                System.err.println("I can't find " + host);
            } catch (SocketException ex) {
                System.err.println("Could not connect to" + host);

            } catch (IOException ex) {
                System.err.println(ex);
            }
        }
    }
;
}
