import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Temperature in Celsius : ");
        float celsius = scan.nextFloat();
        System.out.println(celsius + " C is equal to " + ((celsius*(9/5f))+32)+" F");
        scan.close();
    }
}
