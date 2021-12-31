import java.util.Scanner;

public class SwitchWebsite {
    public static void main(String[] args) {
        String url;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Website URL");
        url = sc.nextLine();

        String ext = url.substring(url.lastIndexOf(".")+1);

        switch(ext)
        {
            case "com": 
                    System.out.println("Commercial");
                    break;
            case "org": 
                    System.out.println("Organisation");
                    break;
                        
            case "gov": 
                    System.out.println("Government");
                    break;
            case "net": 
                    System.out.println("Network");
                    break;
            default:
                    System.out.println("Sorry I am Not Detect Your Entered URL");
        }
    }
}
