import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Headers {
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++){
            try{
                URL u=new URL(args[i]);
                URLConnection uc=u.openConnection();
                for(int j=1; ;j++){
                    String header =uc.getHeaderField(j);
                    if(header == null) break;
                    System.out.println(uc.getHeaderFieldKey(j)+ ":"+header);
                }

                String date =uc.getHeaderField("date");
                String expires=uc.getHeaderField("expires");
                int contentLength=uc.getHeaderFieldInt("Content-length",-1);

                System.out.println("Date:"+date+"\nExpires:"+expires+"\nContent-Length:"+contentLength);

            }catch(MalformedURLException ex){
                System.err.println(args[i] + "is not a URL I understand");
            }catch(IOException ex){
                System.err.println(ex);
            }
            System.out.println();
        }
    }
    
}
