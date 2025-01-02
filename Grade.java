import java.util.Scanner;
public class Grade {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Mark :");
        int mark = scan.nextInt();
        if((mark<=100 && mark>=90))
        {
            System.out.println("A GRADE");
        }
        else if((mark<90 && mark>=80))
        {
            System.out.println("B GRADE");
        }
        else if((mark<80 && mark>=70))
        {
            System.out.println("C GRADE");
        }
        else if((mark<70 && mark>=60))
        {
            System.out.println("D GRADE");
        }
        else if((mark<60 && mark>=50))
        {
            System.out.println("E GRADE");
        }
        else if(mark<50)
        {
            System.out.println("FAIL");
        }
        else
        {
            System.out.println("Invalid Mark");
        }
        scan.close();
    }
    
}
