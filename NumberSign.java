import java.util.Scanner;
public class NumberSign {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        float num = scan.nextFloat();
        if(num<0)
        {
            System.out.println("The Number " + num + " is Negative");
        }
        else if(num>0)
        {
            System.out.println("The Number " + num + " is Positive");
        }
        else if(num==0)
        {
            System.out.println("The Number " + num + " is zero");
        }
        scan.close();

    }
    
}
