import java.util.Scanner;
public class Switch1 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = scan.nextLine();
        switch (name) {
            case "Ramya":
                 System.out.println("Name : Ramya");
                 System.out.println("Email : ramya123@gmail.com");
                 System.out.println("Address : Tirupur");
                 System.out.println("Phone Number : 123654789");
                 System.out.println("Age : 18");
                break;
            case "Anu":
                System.out.println("Name : Anu");
                System.out.println("Email : anu123@gmail.com");
                System.out.println("Address : Erode");
                System.out.println("Phone Number : 2314484541");
                System.out.println("Age : 20");
               break;
            case "Ram":
               System.out.println("Name : Ram");
               System.out.println("Email : ram456@gmail.com");
               System.out.println("Address : Coimbatore");
               System.out.println("Phone Number :1415123651");
               System.out.println("Age : 22");
              break;
            case "Vijay":
              System.out.println("Name : Vijay");
              System.out.println("Email : vijay456@gmail.com");
              System.out.println("Address : Salem");
              System.out.println("Phone Number :2103456987");
              System.out.println("Age : 25");
             break; 
            case "Swetha":
              System.out.println("Name : Swetha");
              System.out.println("Email : swetha789@gmail.com");
              System.out.println("Address : Thanjavur");
              System.out.println("Phone Number :7418529631");
              System.out.println("Age : 23");
             break; 
            case "Rajesh":
             System.out.println("Name : Rajesh");
             System.out.println("Email : rajesh253@gmail.com");
             System.out.println("Address : Nammakkal");
             System.out.println("Phone Number :1010101010");
             System.out.println("Age : 20");
            break;  
            case "Kaviya":
             System.out.println("Name : Kaviya");
             System.out.println("Email : kaviya956@gmail.com");
             System.out.println("Address : Tirupur");
             System.out.println("Phone Number :2020202022");
             System.out.println("Age : 17");
            break; 
            case "Mahesh":
             System.out.println("Name : Mahesh");
             System.out.println("Email : mahesh123@gmail.com");
             System.out.println("Address : Karur");
             System.out.println("Phone Number :1414141414");
             System.out.println("Age : 19");
            break; 
            case "Sara":
             System.out.println("Name : Sara");
             System.out.println("Email : sara874@gmail.com");
             System.out.println("Address : Chennai");
             System.out.println("Phone Number :7418529631");
             System.out.println("Age : 20");
            break; 
            case "John":
             System.out.println("Name : John");
             System.out.println("Email : john635@gmail.com");
             System.out.println("Address : Bangalore");
             System.out.println("Phone Number :4545454545");
             System.out.println("Age : 15");
            break;  
            default:
                System.out.println("Invalid Name");
                break;
        }
        scan.close();
     }
}
