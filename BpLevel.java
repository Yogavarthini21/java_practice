import java.util.Scanner;
public class BpLevel {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter the Digstolic Number : ");
        int dia = scan.nextInt();
        System.out.println("Enter the Systolic Number : ");
        int sys = scan.nextInt();
        if((dia>=40 && dia<=60) && (sys>=70 && sys<=90))
        {
           System.out.println("Low Blood Pressure"); 
        }
        else if(((dia>=40 && dia<=80) && (sys>=91 && sys<=120)) || ((dia>=61 && dia<=80)&&(sys>=70 && sys<=120)))
        {
            System.out.println("Ideal Blood Pressure");
        } 
        else if(((dia>=81 && dia<=90) && (sys>=121 && sys<=140)) || ((dia>=40 && dia<=90)&& (sys>=121 && sys<=140)) || ((dia>=81 && dia<=90)&& (sys>=70 && sys<=140)))
        {
           System.out.println("Pre-High  Blood Pressure"); 
        }
        else if(((dia>=91 && dia<=100) && (sys>=141 && sys<=190))||((dia>=40 && dia<=100)&& (sys>=141 && sys<=190)||((dia>=91 && dia<=100)&& (sys>=70 && sys<=190))))
        {
           System.out.println("High  Blood Pressure"); 
        }
        else
        {
            System.out.println("Enter Valid Pressure Level");
        }
        scan.close();

    }
}