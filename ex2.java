import java.util.Scanner;
public class ex2{
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println ("Enter the value of a :");
        int a = num.nextInt();
        System.out.println ("Enter the value of b :");
        int b = num.nextInt();
        System.out.println ("The Addition of two numbers is : " + (a+b));
        System.out.println ("The Subraction of two numbers is : " + (a-b));
        System.out.println ("The Multiplication of two numbers is : " + (a*b));
        System.out.println ("The Division of two numbers is : " + (a/b));
        System.out.println ("The Modulud of two numbers is : " + (a%b));
        num.close();
    }

}