public class ArrayElement {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        int[] num1 = new int[2];
        num1[0]=num[0];
        num1[1]=num[4];
        System.out.println("Print the elements in New Array : " +num1[0] + "," + num1[1]);
    }
    
}
