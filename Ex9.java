import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    int number = scan.nextInt();
    if(number%7==0)
    {
      System.out.println("The number is divisible by 7");
    }
    else
    {
      System.out.println("The number is not divisible by 7");
    }
    scan.close();
  }
}
