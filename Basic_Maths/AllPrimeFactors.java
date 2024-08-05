package Basic_Maths;

public class AllPrimeFactors {
    public static boolean checkPrimeOptimal(int n){
        int cnt = 0;
        if(n<=0){
            return false;
        }
        if(n==1){
            return false;
        }

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                cnt++;
            }
        }

        if(cnt==0){
            return true;
        }
        return false;
    }
    public static void allPrimeBrute(int n){
//        for(int i=1;i<)
    }
    public static void main(String[] args){

    }
}
