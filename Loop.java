import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = scan.nextInt();
        int i=0;
        while(i<=n)
        {
            System.out.println("Person" + " " + i + " : " +i);
            i++;
        }
    }
    
}
