import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter an Hour : ");
       int a = scan.nextInt();
       if((a>=0)&&(a<=24))
       {
         System.out.println("Hour :" + a);
         System.out.println("Minutes :" + (a*60));
         System.out.println("Seconds :" + a*(60*60));
         System.out.println("Milliseconds :" + a*(60*60*1000));
       }
       else
       {
         System.out.println("It is not an hour of the day");
       }
       scan.close();

    }
    
}
