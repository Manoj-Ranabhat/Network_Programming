
import java.io.*;
import java.net.*;

public class DMOz {

    public static void main(String[] args) {
        String target = "";
        for (int i = 0; i < args.length; i++) {
            target += args[i] + " ";
        }
        target = target.trim();

        // QueryString query = new QueryString();
        // query.add("q", target);
        try {
            URL u = new URL("http://www.google.com/search?q" + target);
            try (InputStream in = new BufferedInputStream(u.openStream())) {
                InputStreamReader theHTML = new InputStreamReader(in);
                int c;
                while ((c = theHTML.read()) != -1) {
                    System.out.print((char) c);
                }
            }
        } catch (MalformedURLException ex) {
            System.err.println(ex);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
