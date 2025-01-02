import java.util.Scanner;
public class Currency {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Currency Name :");
        String currency = scan.next();
        System.out.println("Enter the Currency Value : ");
        int currencyValue = scan.nextInt();
        if(currency.equalsIgnoreCase("Dollar"))
        {
           System.out.println("The Indian Value For  " + currencyValue + " Dollars : "  + (currencyValue*85.368));
        }
        else if(currency.equalsIgnoreCase("Euro"))
        {
           System.out.println("The Indian Value For  " + currencyValue + " Euro : "  + (currencyValue*88.990));
        }
        else if(currency.equalsIgnoreCase("Pound"))
        {
           System.out.println("The Indian Value For  " + currencyValue + " Pounds : "  + (currencyValue*107.423));
        }
        else if(currency.equalsIgnoreCase("Baht"))
        {
           System.out.println("The Indian Value For  " + currencyValue + " Baht : "  + (currencyValue*2.508));
        }
        else if(currency.equalsIgnoreCase("Yuan"))
        {
           System.out.println("The Indian Value For  " + currencyValue + " Yuan : "  + (currencyValue*11.698));
        }
        else
        {
            System.out.println("Invalid Currency");
        }
        scan.close();
    }
    
}
