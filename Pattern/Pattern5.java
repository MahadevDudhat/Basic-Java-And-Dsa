package Pattern;

public class Pattern5 {

    public static void main(String[] args) {


        char ch = 'A';
        int n = 1;
        for(int i =1;i<=3;i++){

            for(int j=1;j<=3;j++){

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
