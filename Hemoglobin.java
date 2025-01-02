import java.util.Scanner;
public class Hemoglobin {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Gender:");
        String gender = scan.nextLine();
        System.out.println("Enter your Age :");
        int age = scan.nextInt();
        System.out.println("Enter your Hemoglobin Level :");
        float Hemoglobinlevel = scan.nextFloat();
        if(gender.equalsIgnoreCase("Children"))
        {
         if((age>=2) && (age<=6))
         {
           if((Hemoglobinlevel>=11.5) && (Hemoglobinlevel<=13.5))
           {
            System.out.println("Hemoglobin Level is normal");
           }
           else if ((Hemoglobinlevel<11.5)||(Hemoglobinlevel>13.5)) 
           {
            System.out.println("Hemoglobin Level is abnormal");
           }
         }
         if((age>=6) && (age<=12))
         {
           if((Hemoglobinlevel>=11.5) && (Hemoglobinlevel<=15.5))
           {
            System.out.println("Hemoglobin Level is normal");
           }
           else if ((Hemoglobinlevel<11.5)||(Hemoglobinlevel>15.5)) 
           {
            System.out.println("Hemoglobin Level is abnormal");
           }
         }
        }
      
        if(gender.equalsIgnoreCase("Female"))
        {
           if((age>=12)&&(age<=18))
           {
             if((Hemoglobinlevel>=13.0) && (Hemoglobinlevel<=16.0))
             {
                System.out.println("Hemoglobin Level is normal");
             }
             else if((Hemoglobinlevel<13.0)||(Hemoglobinlevel>16.0))
             {
                 System.out.println("Hemoglobin Level is Abnormal");
             }
           }
           else if((age>=18)&&(age<=100))
           {
             if((Hemoglobinlevel>=13.6) && (Hemoglobinlevel<=17.7))
             {
                System.out.println("Hemoglobin Level is normal");
             }
             else if((Hemoglobinlevel<13.6)||(Hemoglobinlevel>17.7))
             {
                 System.out.println("Hemoglobin Level is Abnormal");
             }
           }
           else if((age<12) || (age>100))
           {
            System.out.println("Invalid Age");
           }

        }
        if(gender.equalsIgnoreCase("Male"))
        {
           if((age>=12)&&(age<=18))
           {
             if((Hemoglobinlevel>=12.0) && (Hemoglobinlevel<=16.0))
             {
                System.out.println("Hemoglobin Level is normal");
             }
             else if((Hemoglobinlevel<12.0)||(Hemoglobinlevel>16.0))
             {
                 System.out.println("Hemoglobin Level is Abnormal");
             }
           }
           else if((age>18)&&(age<=100))
           {
             if((Hemoglobinlevel>=12.1) && (Hemoglobinlevel<=15.1))
             {
                System.out.println("Hemoglobin Level is normal");
             }
             else if((Hemoglobinlevel<12.1)||(Hemoglobinlevel>15.1) )
             {
                 System.out.println("Hemoglobin Level is Abnormal");
             }
           }
           else if((age<12) || (age>100))
           {
            System.out.println("Invalid Age");
           }
        }
        if(!(gender.equalsIgnoreCase(("Female")) || gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Children")))
        {
            System.out.println("Invalid Gender");
        }
        scan.close();
    }
    
}
