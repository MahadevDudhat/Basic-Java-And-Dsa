package Basic_Maths;

public class DisplayDigits {

    public static void main(String [] args){
        int n = 23987;

        while(n>0){
            int last = n%10;
            System.out.println(last);
            n = n/10;
        }
    }
}
