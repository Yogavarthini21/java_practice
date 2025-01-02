import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        float num1 = scan.nextFloat();
        System.out.println("Enter the Second Number : ");
        float num2 = scan.nextFloat();
        System.out.println("Enter the Operation : ");
        String operation = scan.next();
        if (operation.equalsIgnoreCase("Add")) 
        {
            System.out.println("The Addition of First and Second Number is : " + (num1+num2));
        }
        else if (operation.equalsIgnoreCase("Subract"))
        {
            System.out.println("The Subraction of First and Second Number is : " + (num1-num2));
        }
        else if (operation.equalsIgnoreCase("Multiply"))
        {
            System.out.println("The Multiplication of First and Second Number is : " + (num1*num2));
        }
        else if (operation.equalsIgnoreCase("Divide"))
        {
            if(num2==0)
            {
                System.out.println("Cannot Divisible by Zero");
            }
            else
            {
                System.out.println("The Division of First and Second Number is : " + (num1/num2));
            }
           
        }
        else
        {
            System.out.println("Invalid Operator");
        }
        scan.close();
    }
    
}
