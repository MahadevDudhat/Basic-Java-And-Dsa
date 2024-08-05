package ArrayQuestionSolving;

public class EvenOddScenarioUpgrad {

    public static boolean checkEvenOdd(int[] arr){
        int even = 0;
        int odd = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }

        if(even%2==0 && odd%2!=0){
            return true;
        }


        return false;

    }

    public static void main(String[] args) {
        int [] arr = {1,3,7,6,1,10};

        boolean ans = checkEvenOdd(arr);

        if(ans==true){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
