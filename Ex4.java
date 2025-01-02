import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args){
       Scanner number = new Scanner(System.in);
       System.out.println("Enter the Input : ");
       int Input = number.nextInt();
       System.out.println((Input/100)%10 + "\n" + (Input/10)%10 + "\n" + Input%10);
       System.out.println(Input%10);
      //  while(Input > 0){
      //     System.out.println(Input % 10);
      //     Input = Input / 10;
      //  }
      number.close();
    }  
         
}