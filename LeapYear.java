//import java.time.Year;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Year :");
        int year = scan.nextInt();
        if(year%4==0 && (year%400==0 || year%100!=0))
        {
        System.out.println(year + " is a Leap Year");    
        }
        else
        {
            System.out.println(year + " is not a Leap Year");
        }
        scan.close();
    }
    
}
