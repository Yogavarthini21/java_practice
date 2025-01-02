import java.util.Scanner;

public class LoopEx4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = {10,20,30,40,50,60,70,80,90,100};
        int i = 0;
        while(i<=(num.length-1))
        {
            num[i]+=5;
            System.out.println(num[i]);
            i++;
        }
        
    }  
}
