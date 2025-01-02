import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int a = scan.nextInt();
        if(a%2==1)
        {
            System.out.println("The given number is odd number");
        }
        else
        {
            System.out.println("The given number is even number");
        }
        scan.close();
    }   
}
