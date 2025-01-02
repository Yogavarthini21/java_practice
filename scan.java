import java.util.Scanner;
public class scan{
    public static void main (String[] args){
        Scanner text = new Scanner(System.in);
        System.out.println ("Enter Name :");
        String Name = text.nextLine();
        System.out.println ("Enter Email :");
        String Email = text.nextLine();
        System.out.println ("Enter Address : ");
        String Address = text.nextLine();
        System.out.println ("Enter Age : ");
        int Age = text.nextInt(); 
        System.out.println ("------------------------------------------------------------");
        System.out.println (" |  Name    |       Email            |  Age   |   Address  |");
        System.out.println ("------------------------------------------------------------");
        System.out.println ( " | " + Name + "    | " +  Email + "     |   " +  Age + "   | "+  Address + "    | ");
        System.out.println ("------------------------------------------------------------");
        text.close();
    }
}