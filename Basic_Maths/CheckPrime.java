package Basic_Maths;

public class CheckPrime{
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
    public static boolean checkPrimeBrute(int n){
        if(n<=0){
            return false;
        }
        if(n==1){
            return false;
        }

        int cnt = 1;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                cnt++;
            }
        }

        if(cnt==2){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
//        boolean ans = checkPrimeBrute(3);
        boolean ans = checkPrimeOptimal(3);
        if(ans==true){
            System.out.println(" prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}