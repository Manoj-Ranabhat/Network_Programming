import java.io.*;
import java.net.*;
import java.util.Date;
public class HeaderViewer {
    public static void main(String[]args){
        for(int i=0;i<args.length;i++){
            try{
                URL u=new URL(args[0]);
                    URLConnection uc=u.openConnection();
                    System.out.println("Content-type: "+uc.getContentType());

                    if(uc.getContentEncoding()!=null){
                        System.out.println(":Content-encoding: "+uc.getContentEncoding());
                    }
                    if(uc.getDate()!=0){
                        System.out.println("Date: "+new Date(uc.getDate()));
                    }
                    if(uc.getLastModified()!=0){
                        System.out.println("Last Modified: "+new Date(uc.getLastModified()));
                    }if(uc.getContentLength()!=-1){
                        System.out.println("Content-lemgth: "+uc.getContentLength());
                    }
                }catch(MalformedURLException ex){
                    System.err.println(args[i]+"is not a URL I understand");
                }catch(IOException ex){
                    System.err.println(ex);
                }
                System.out.println();
            }
        }

    }
    

