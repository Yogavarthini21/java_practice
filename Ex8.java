import java.util.Scanner;
public class Ex8 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an year : ");
        int a = scan.nextInt();
        if(a%4==0)
        {
            System.out.println("It is a leap year");      
        }
        else
        {
          System.out.println("It is not a leap year");
        }
       scan.close();
    }
    
}
