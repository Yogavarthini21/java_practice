import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args){
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter your birth Year :");
        // int a = scan.nextInt();
        // int b = 2024;
        // int c = b-a;
        // if(c<18)
        // {
        //   System.out.println("The person is a minor");
        // }
        // else
        // {
        //     System.out.println("The person is a major");
        // }
        // scan.close();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num =scan.nextInt();
        if((num>=3) || (num<=8))
        {
            System.out.println("Blood count is abnormal");
        }
        else
        {
            System.out.println(" Blood count is normal" );

        }
       scan.close();
    }
    
}
