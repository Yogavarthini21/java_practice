import java.util.Scanner;
public class Vowels {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Alphabet:");   
        char Alphabet = scan.next().charAt(0);
        // String Alphabet = scan.nextLine();
        if(Alphabet=='a'|| Alphabet=='A')
        {
            System.out.println(Alphabet + " " + "is a vowel");
        }
        else if(Alphabet=='e'|| Alphabet=='E')
        {
            System.out.println(Alphabet + " " + "is a vowel");
        }
        else if((Alphabet=='i'|| Alphabet=='I'))
        {
            System.out.println(Alphabet + " " + "is a vowel");
        }
        else if((Alphabet=='o'|| Alphabet=='O'))
        {
            System.out.println(Alphabet + " " + "is a vowel");
        }
        else if((Alphabet=='u'|| Alphabet=='U'))
        {
            System.out.println(Alphabet + " " + "is a vowel");
        }
        else
        {
            System.out.println(Alphabet + " " + "is not a vowel");
        }
        scan.close();

    }

    
}
