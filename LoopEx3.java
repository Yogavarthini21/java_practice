import java.util.Scanner;
public class LoopEx3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = scan.nextInt();
        int i = 1;
        while(i<=10)
        {
            System.out.println( n + " x " + i + " = " + (n*i));
            i++;
        }
    }
    
}
