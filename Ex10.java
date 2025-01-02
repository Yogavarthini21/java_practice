import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Age:");
        int a = scan.nextInt();
        if(a<18){
            System.out.println("The person is Minor");
        }
        else if(a>=18 && a<=60)
        {
           System.out.println("The person is Major");
        }
        else if(a>60 && a<=100)
        {
            System.out.println("The person is Senior Citizen");
        }
        else
        {
            System.out.println("Invalid Age");
        }
        scan.close();
    }
    
}
