import java.util.Scanner;

public class URLProtocole {
    public static void main(String[] args) {
        System.out.println("Enter URL");
        Scanner sc = new Scanner(System.in);

        String url;

        url = sc.nextLine();

        String protocol = url.substring(0, url.indexOf(":"));

        if(protocol.equals("http")|| protocol.equals("https")){
            System.out.println("Hypertext Transfer Protocol");
        }else if(protocol.equals("ftp")){
            System.out.println("File Transfer Protocol");
        }else{
            System.out.println("Your Enter URL Is Not Valide");
        }

        String ext = url.substring(url.lastIndexOf(".")+1);

        if(ext.equals("com"))
            System.out.println("Commercial");
        else if(ext.equals("org"))
            System.out.println("Organisation");
        else if(ext.equals("net"))
            System.out.println("Network");
    }
}
