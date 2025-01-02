import java.util.Scanner;
public class SpeedLimit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Speed  : ");
        int speed = scan.nextInt();
        System.out.println("Enter your Speedlimit : ");
        int speedLimit = scan.nextInt();
        int speedOverLimit = speed - speedLimit;
        if(speedOverLimit<1)
        {
           System.out.println("Your Speed is Normal");
        }
        else if(speedOverLimit>=1 && speedOverLimit<=10)
        {
            System.out.println("You have been speeding!Your Fine is $50 ");
        }
        else if(speedOverLimit>=11 && speedOverLimit<=20)
        {
            System.out.println("You have been speeding!Your Fine is $100 ");
        }
        else if(speedOverLimit>=21 && speedOverLimit<=30)
        {
            System.out.println("You have been speeding!Your Fine is $150 ");
        }
        else if(speedOverLimit>30)
        {
            System.out.println("You have been speeding!Your Fine is $200 ");
        }
        scan.close();
    }
    
}
