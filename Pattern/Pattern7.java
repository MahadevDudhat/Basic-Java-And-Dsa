package Pattern;

public class Pattern7 {

    public static void main(String[] args) {
        int n =1;
        int ch =66;


        for(int i=1;i<=3;i++){

            for(int j=1;j<=3;j++){


              if(n%2==0){
                  System.out.print((char)ch +" ");
                  ch+=2;
              }else {
                  System.out.print(n + " ");

              }
                n++;



            }

            System.out.println();
        }

    }

}
