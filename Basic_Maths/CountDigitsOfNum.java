package Basic_Maths;

public class CountDigitsOfNum {
    public static void main(String[] args){
        int n = 4828;
        int cnt = 0;
        while(n>0){
            int k = n%10;
            cnt++;
            n = n/10;
        }

        System.out.println("total number of digits in the number are " + cnt);
    }
}
