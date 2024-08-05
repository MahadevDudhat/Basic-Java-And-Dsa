package ArrayQuestionSolving;

public class EqualPrefixSumSubArray {
    public static int totalSum(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static boolean checkSubArray(int[] arr){
        int n = arr.length;
        int totalSum = totalSum(arr);
        for(int i=1;i<n;i++){
            arr[i] = arr[i-1]+arr[i];
            int suff = totalSum-arr[i];
            if(arr[i]==suff){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {5,3,7,6,3,1};

        boolean ans = checkSubArray(arr);
        System.out.println(ans);

    }
}
