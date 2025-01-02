import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Operator :");
        char Operator = scan.next().charAt(0);
        System.out.println("Enter the First Number : ");
        int num1 = scan.nextInt();
        System.out.println("Enter the Second Number : ");
        int num2 = scan.nextInt();
        switch (Operator) {
            case '+':
                System.out.println("The Addition of First and Second number is :" + " " + (num1+num2));
                break;
            case '-':
                System.out.println("The Subraction of First and Second number is :" + " " + (num1-num2));
                break;
            case '*':
                System.out.println("The Multiplication of First and Second number is :" + " " + (num1*num2));
                break;
            case '/':
                System.out.println("The Division of First and Second number is :" + " " + (num1/num2));
                break;
            case '%':
                System.out.println("The Modulus of First and Second number is :" + " " + (num1%num2));
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
        scan.close();
    }
    
}
