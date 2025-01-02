import java.util.Scanner;
public class TriangleType {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Side A:");
        int a = scan.nextInt();
        System.out.println("Enter Side B:");
        int b = scan.nextInt();
        System.out.println("Enter Side C:");
        int c = scan.nextInt();
        if(a==b && a==c)
        {
            System.out.println("The Triangle is Equilateral");
        }
        else if(a==b || b==c || a==c)
        {
            System.out.println("The Triangle is Isosceles");
        }
        else if(a!=b && a!=c)
        {
            System.out.println("The Triangle is Scalene");
        }
        scan.close();
    }
    
}
