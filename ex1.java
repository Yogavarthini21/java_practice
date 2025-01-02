public class ex1 {
    public static void main(String[] args){
        short sNo = 1;
        String name = "Ram";
        byte age = 15;
        long phoneNumber = 999999999;
        float avgScore = 99.8f;
        double billAmount = 1247.81d;
        boolean isIndian = true;
        char grade = 'A';
        System.out.println ("--------------------------------------------------------------------------------------------------");
        System.out.println ("|  S.No  |  Name  |  Age  |  PhoneNumber  |  AverageScore  |  BillAmount  |  IsIndian  |  Grade  |");
        System.out.println ("--------------------------------------------------------------------------------------------------");
        System.out.println ("|    " + sNo + "   | "  + name + "    | " + age + "    | " + phoneNumber + "     | " + avgScore + "           | " + billAmount + "      | " + isIndian + "       | " + grade + "       | ");
        System.out.println ("--------------------------------------------------------------------------------------------------");
        sNo = 2;
        name = "Sam";
        age = 20;
        phoneNumber = 888888888;
        avgScore = 97.6f;
        billAmount = 67548.71d;
        isIndian = false;
        grade = 'B';
        System.out.println ("|    " + sNo + "   | "  + name + "    | " + age + "    | " + phoneNumber + "     | " + avgScore + "           | " + billAmount + "     | " + isIndian + "      | " + grade + "       | ");
        System.out.println ("--------------------------------------------------------------------------------------------------");
    }
}