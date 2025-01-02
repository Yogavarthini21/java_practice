import java.util.Scanner;
public class ValueSwap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Value of A:");
        int a = scan.nextInt();
        System.out.println("Enter the Value of B:");
        int b = scan.nextInt();
        int c = a;
        a=b;
        b=c;
        System.out.println("The Value of A is : " + a);
        System.out.println("The Value of B is : " + b);
        scan.close();

    }
    
}
