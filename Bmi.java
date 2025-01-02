import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your weight :");
        int weight = scan.nextInt();
        System.out.println("Enter your Height : ");
        float height = scan.nextFloat();
        Float heightInMeters = height/100;
        System.out.println("Your BMI is :" + (weight/(heightInMeters*heightInMeters)));
        scan.close();
    }
    
}
