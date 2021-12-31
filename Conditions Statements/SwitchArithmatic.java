import java.util.Scanner;

public class SwitchArithmatic {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Menu\n====\nADD\nSUB\nMUL\nDIV\n====\n");

            float x,y;

            System.out.println("Enter Two Numbers");
            x = sc.nextFloat();
            y = sc.nextFloat();

            sc.nextLine(); //Buffer Haping

            System.out.println("Please Enter Menu Option In Word");
      
            String option = sc.nextLine();

            option = option.toUpperCase();

      switch(option){
                case "ADD" :
                    System.out.println("ADD => "+(x+y));
                    break;
                case "SUB" :
                    System.out.println("SUB => "+(x-y));
                    break;
                case "MUL" :
                    System.out.println("MUL => "+(x*y));
                    break;
                case "DIV" :
                    System.out.println("DIV => "+(x/y));
                    break;
                default:
                    System.out.println("Please Enter Right Menu Name");
      }
        }

    }
}
