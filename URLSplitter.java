import java.net.*;

public class URLSplitter {
    public static void main(String args[]) {

        for (int i = 0; i < args.length; i++) {

            try {
                URL u = new URL(args[i]);
                System.out.println("The Url is " + u);
                System.out.println("The Scheme is " + u.getProtocol());
                System.out.println("The User info  is " + u.getUserInfo());

                String host = u.getHost();
                if (host != null) {
                    int atSign = host.indexOf('@');
                    if (atSign != -1)
                        host = host.substring(atSign + 1);
                    System.out.println("The host is " + host);
                } else {

                    System.out.println("The host is null.");
                }
                System.out.println("The port is " + u.getPort());
                System.out.println("The path is " + u.getPath());
                System.out.println("The host is " + u.getRef());
                System.out.println("The query string is " + u.getQuery());

            } catch (MalformedURLException ex) {
                System.err.print(args[i] + " is not a URL I undestand.");

            }
            System.out.println();
        }
    }
}
