public class ArrayEx1 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6};
        int num1 = num.length/2;
        if(num.length%2==1)
        {
            System.out.println(num[num1]);
        }
        else if (num.length%2==0)
        {
            System.out.println(num[num1-1]);
            System.out.println(num[num1]);
           
        }
    }
    
}
