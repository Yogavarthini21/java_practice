import java.util.Scanner;
public class Operator {
    public static void main(String[] args){
           Scanner num = new Scanner(System.in);
           System.out.println ("Enter the Principal Amount:");
           long principal = num.nextLong();
           System.out.println("Enter the Rate of Interest:");
           float rate = num.nextFloat();
           System.out.println("Enter the Time:");
           int time = num.nextInt();
           System.out.println("Simple Interest =  " + (principal * rate * time)/100);
           num.close();

    }
}