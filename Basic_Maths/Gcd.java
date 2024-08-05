package Basic_Maths;

public class Gcd {
    //finding greatest common factor of two numbers let's say 9 and 12 gcd is 3.

    public static void findGcdOptimal(int n1,int n2){
        //euclidien algorithm gcd(a,b) = gcd(a-b,b),a>b
        int a = n1;
        int b = n2;
        while(a>0 && b>0){
            if(a>b){
                a = a%b;
            }else{
                b = b%a;
            }
        }
        if(a==0){
            System.out.println(b);
        }else{
            System.out.println(a);
        }
    }
    public static void findGcdBrute(int n1,int n2){
        int gcd = 1;
        for(int i=1;i<=Math.min(n1,n2);i++){

            if(n1%i==0 && n2%i==0){
                gcd = i;
            }

        }
        System.out.println("greatest common divisors "+gcd);
    }
    public static void main(String[] args){
        findGcdBrute(9,12);
        findGcdOptimal(9,12);

    }
}
