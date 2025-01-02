import java.util.Scanner;
public class ex3{
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println ("Enter the value of a :");
        int a = num.nextInt();
        System.out.println ("Enter the value of b :");
        int b = num.nextInt();
        System.out.println ("The Output Value of a and b :" + ((a*a)+(b*b)+(2*(a*b)))/((a*a*a)+(b*b*b)));
        num.close();
    }
      
}
// public class ex3 {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//     }
// }
