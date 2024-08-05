package Basic;


import java.util.Scanner;

public class BruteForcePrime {



        static boolean checkPrime(int n){
            boolean f = false;
            int cnt =0;



            for(int i = 2;i<=n;i++){
                if(n%i==0){
                    cnt++;
                }
            }
            if(cnt == 1){
                f = true;
            }

            return f;

        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            boolean f = checkPrime(n);






            if(f==true){
                System.out.println("number is prime");
            } else if (n==1) {

                System.out.println("number is not prime not composite");

            } else{
                System.out.println("number is not prime");
            }

        }



}
