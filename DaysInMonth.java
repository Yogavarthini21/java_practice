import java.util.Scanner;
public class DaysInMonth{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a month:");
        String month = scan.nextLine();
        System.out.println(month);
        if(month.equalsIgnoreCase("January"))
        {
            System.out.println("January has 31 Days");
        }
        else if(month.equalsIgnoreCase("March"))
        {
            System.out.println("March has 31 Days");
        }
        else if(month.equalsIgnoreCase("May"))
        {
            System.out.println("May has 31 Days");
        }
        else if(month.equalsIgnoreCase("July"))
        {
            System.out.println("July has 31 Days");
        }
        else if(month.equalsIgnoreCase("August"))
        {
            System.out.println("August has 31 Days");
        }
        else if(month.equalsIgnoreCase("October"))
        {
            System.out.println("October has 31 Days");
        }
        else if(month.equalsIgnoreCase("December"))
        {
            System.out.println("December has 31 Days");
        }
        else if(month.equalsIgnoreCase("April"))
        {
            System.out.println("April has 30 Days");
        }
        else if(month.equalsIgnoreCase("June"))
        {
            System.out.println("June has 30 Days");
        }
        else if(month.equalsIgnoreCase("September"))
        {
            System.out.println("September has 30 Days");
        }
        else if(month.equalsIgnoreCase("November"))
        {
            System.out.println("November has 30 Days");
        }
        else
        {
            System.out.println("Feburary has 28 Days");  
        }
        scan.close();
    }

}