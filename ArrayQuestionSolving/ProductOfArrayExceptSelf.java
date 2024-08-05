package ArrayQuestionSolving;

public class ProductOfArrayExceptSelf {

    public static void findProduct(int [] arr){
        int[] ans = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            int pr = 1;
            for(int j = 0;j< arr.length;j++){
                if(i!=j){
                    pr *=arr[j];

                    ans[i] = pr;
                }
            }
        }

       for(int i=0;i<ans.length;i++){
           System.out.println(ans[i]);
       }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        findProduct(arr);
    }
}
