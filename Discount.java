import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the price : ");
        float price = scan.nextFloat();
        System.out.println("Enter your Age : ");
        int age = scan.nextInt();
        if(age>=0 && age<=12)
        {
             System.out.println("Your Payment Amount : " + (price-(price*(20/100f))));
        }
        else if (age>=13 && age<=64)
        {
            System.out.println("Your Payment Amount : " + price);

        }
        else if(age>=65 && age<=120)
        {
            System.out.println("Your Payment Amount : " + (price-(price*(30/100f))));
        }
        else 
        {
            System.out.println("Enter Valid Age");
        }
        scan.close();

    }
    
}
 // System.out.println("Enter the Discount percentage : ");
        // float discount = scan.nextFloat();
        // System.out.println("Your Payment Amount : " + (price-(price*(discount/100))));