
public class ArrayExercise {
    public static void main(String[] args) {
        int[] num = new int[5];
        num[0]=1;
        num[1]=2;
        num[2]=3;
        num[3]=4;
        num[4]=5;
        System.out.println("First Element in the Array : " + num[0]);
        System.out.println("Last Element in the Array : " + num[(num.length-1)]);
        System.out.println("Add all the Values in the Array : " + (num[0]+num[1]+num[2]+num[3]+num[4]));
       
    }
    
}
