import java.util.Scanner;
public class BiggerNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Value of A :");
        int a = scan.nextInt();
        System.out.println("Enter the Value of B :");
        int b = scan.nextInt();
        System.out.println("Enter the Value of C :");
        int c = scan.nextInt();
        if((a>b) && (a>c))
        {
            System.out.println("The greater number is : " + a);
        }
        else if(b>c)
        {
            System.out.println("The greater Number is : " + b);
        }
        else 
        {
            System.out.println("The greater Number is : " + c);
        }
        scan.close();
    }
    
}
