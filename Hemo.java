import java.util.Scanner;
public class Hemo {
    public static void main(String[] args) 
    {
       Scanner scan = new Scanner(System.in);
       System.out.println("1.Birth");
       System.out.println("2.Less than One Month");
       System.out.println("3.1-2 Months");
       System.out.println("4.2-6 MOnths");
       System.out.println("5.6 MOnths - 2 years");
       System.out.println("6.2-6 years");
       System.out.println("7.6-12 years");
       System.out.println("8.12-18 years");
       System.out.println("9.18 years");
       System.out.println("Enter the Age Category :");
       int category = scan.nextInt();
       System.out.println("Enter the Hemoglobin Level :");
       float level = scan.nextFloat();
       if(category==8 || category==9)
       {
            System.out.println("Enter gender :");
            String gender = scan.next(); 
            if(gender.equalsIgnoreCase("Female"))
            {
                if(category==8 && (level>=13.0 && level<=16.0))
                {
                    System.out.println("Hemogloboin level is Normal");
                }
                else if((category==9 && (level>=13.6 && level<=17.7)))
                {
                    System.out.println("Hemoglobin level is Normal");
                }
                else
                {
                    System.out.println("Hemoglobin level is Abnormal");
                }

            }
            else if(gender.equalsIgnoreCase("Male"))
            {
                if(category==8 && (level>=12.0 && level<=16.0))
                {
                    System.out.println("Hemogloboin level is Normal");
                }
                else if(category==9 && (level>=12.1 && level<=15.1))
                {
                    System.out.println("Hemoglobin level is Normal");
                }
                else
                {
                    System.out.println("Hemoglobin level is Abnormal");
                }
            }
        }
        else if(category>=1 && category<=7)
        {
            if(category==1 && (level>=13.5 && level<=24.0))
            {
                System.out.println("Hemoglobin level is Normal");
            }
            else if (category==2 && (level>=10.0 && level<=20.0))  
            {
               System.out.println("Hemoglobin level is Normal");
            }
            else if (category==3 && (level>=10.0 && level<=18.0))  
            {
               System.out.println("Hemoglobin level is Normal");
            }
            else if (category==4 && (level>=9.5 && level<=14.0))  
            {
               System.out.println("Hemoglobin level is Normal");
            }
            else if (category==5 && (level>=10.5 && level<=13.5))  
            {
               System.out.println("Hemoglobin level is Normal");
            }
            else if (category==6 && (level>=11.5 && level<=13.5))  
            {
               System.out.println("Hemoglobin level is Normal");
            }
            else if (category==7 && (level>=11.5 && level<=15.5))  
            {
               System.out.println("Hemoglobin level is Normal");
            }
            else
            {
                System.out.println("Hemoglobin level is Abnormal");
            }
        }
        else
        {
            System.out.println("Invalid Category");
        }
        scan.close();
    }
    
}
