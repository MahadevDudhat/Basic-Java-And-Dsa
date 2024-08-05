package Basic_Maths;

public class ReverseANumber {
    public static void main(String[] aregfs){
        int n = 237489;
        int rev = 0;
        while(n>0){
            int k = n%10;
            rev = rev*10 + k;
            n = n/10;
        }
        System.out.print("Reverse of number is "+rev);
    }
}
