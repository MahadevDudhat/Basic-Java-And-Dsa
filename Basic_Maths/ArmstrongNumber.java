package Basic_Maths;

public class ArmstrongNumber {
    public static void main(String[] arfgs){
        int n = 153;
        int temp = n;
        int sum = 0;
        while(n>0){
            int k = n%10;
            sum +=(k*k*k);
            n = n/10;

        }

        if(sum==temp){
            System.out.println("This is the armstrong number");
        }else{
            System.out.println("this is not armstrong number");
        }
    }


}
