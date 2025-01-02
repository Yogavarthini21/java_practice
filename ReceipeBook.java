import java.util.Scanner;
public class ReceipeBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] items = {"Curd Rice","Lemon Rice","Tomato Rice","Coconut Rice"};
        System.out.println("1 -" + " " +items[0] + " , " + "2 -" + " "+items[1] + " , "  + "3 -" + " "+items[2] + " , "  + "4 -" + " "+items[3]);
        System.out.println("Enter a number:");
        int num = scan.nextInt();
        switch (num) {
            case 1:
                 System.out.println("Curd Rice");
                 System.out.println("Curd Rice is prepared by using Curd");   
                break;
            case 2:
                System.out.println("Lemon Rice");
                System.out.println("Lemon Rice is prepared by using Lemon"); 
               break;
            case 3:
               System.out.println("Tomato Rice");
               System.out.println("Tomato Rice is prepared by using Tomato");   
              break;
            case 4:
              System.out.println("Coconut Rice");
              System.out.println("Coconut Rice is prepared by using Coconut");   
             break;
        
            default:
                System.out.println("There is no Receipe in Receipe Book");
                break;
        }
        scan.close();   
    }
    
}
