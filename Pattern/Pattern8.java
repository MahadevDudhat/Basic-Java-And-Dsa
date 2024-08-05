package Pattern;

public class Pattern8 {

    public static void main(String[] args) {

        char ch = 'b';
        int n = 2;

        for(int i =1;i<=4;i++){
            for(int j =1;j<=i;j++){

                if(i%2==0){
                    System.out.print(n++ +" ");
                }else {
                    System.out.print(ch++ +" ");
                }

            }
            System.out.println();
        }



    }

}
