import java.util.Scanner;
public class month {

    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        String a=S.nextLine();
        if(a=="Jan"){
            System.out.println("31");
        }
        // else{
        //     System.out.println("28");
        // }
        S.close();
    }
}