import java.util.Scanner;
public class LoopEx1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scan.nextInt();
        int i = 1;
        while(n>=i)
        {
          System.out.println(n);
          n--;
        }

    }
}
