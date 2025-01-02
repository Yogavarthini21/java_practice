import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = scan.nextInt();
        if(a<=10)
        {
          if(a==10)
          {
            System.out.println((a/10)%10);
          }
          else
          {
            System.out.println(a%10);
          }
          
        }
        else if(a<=100)
        {
            if(a==100)
            {
               System.out.println((a/100)%10 + "" + (a/10)%10);
            }
            else
            {
                System.out.println((a/10)%10 + "" + a%10);
            }
        }
        else if(a<=1000)
        {
            if(a==1000)
            {
               System.out.println((a/1000)%10 + "" + (a/100)%10 + "" + (a/10)%10);
            }
            else
            {
                System.out.println((a/100)%10 + "" + (a/10)%10 + "" + a%10);
            }
        }
        else
        {
            System.out.println("Invalid Number");
        }

        scan.close();
    }
}
