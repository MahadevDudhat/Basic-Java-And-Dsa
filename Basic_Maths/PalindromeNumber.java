package Basic_Maths;

public class PalindromeNumber {
    public static void main(String[] args){
        int n = 131;
        int temp = n;
        int rev = 0;
        while(n>0){
            int k = n%10;
            rev = rev*10+k;
            n = n/10;

        }
        if(temp==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
