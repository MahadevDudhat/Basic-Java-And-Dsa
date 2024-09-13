package campus_placement_practice;

public class DifferenceOfSum {
    public static void diffOfSum(int n,int m){
        int sum1 = 0;
        int sum2 = 0;//divisible by 4
        for(int i=1;i<=m;i++){
            if(i%n==0){
                sum2+=i;
            }else{
                sum1+=i;
            }

        }
        System.out.println(sum1-sum2);
    }
    public static void main(String[] args) {
        diffOfSum(4,20);
    }
}
