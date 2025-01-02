public class ArrayVowels {
    public static void main(String[] args) {
        char[] vowels = {'a','b','e','d','i'};
        String[] values = new String[5];
        if(vowels[0]=='a'|| vowels[0]=='e'|| vowels[0]=='i' ||  vowels[0]=='o' || vowels[0]=='u' )
        {
            values[0]="True";
        }
        else
        {
            values[0]="False";
        }
        if(vowels[1]=='a'|| vowels[1]=='e'|| vowels[1]=='i' ||  vowels[1]=='o' || vowels[1]=='u' )
        {
            values[1]="True";
        }
        else
        {
            values[1]="False";
        }

        if(vowels[2]=='a'|| vowels[2]=='e'|| vowels[2]=='i' ||  vowels[2]=='o' || vowels[2]=='u' )
        {
           values[2]="True";
        }
        else
        {
            values[2]="False";
        }

        if(vowels[3]=='a'|| vowels[3]=='e'|| vowels[3]=='i' ||  vowels[3]=='o' || vowels[3]=='u' )
        {
           values[3]="True";
        }
        else
        {
            values[3]="False";
        }

        if(vowels[4]=='a'|| vowels[4]=='e'|| vowels[4]=='i' ||  vowels[4]=='o' || vowels[4]=='u' )
        {
            values[4]="True";
        }
        else
        {
            values[4]="False";
        }
        System.out.println(values[1]);
       
    }
    
}
