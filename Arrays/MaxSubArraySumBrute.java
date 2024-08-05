package Arrays;

public class MaxSubArraySumBrute {
    static void maxSumSubArrayB(int [] arr){
        int n=arr.length;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int curr=i;
            for (int j=i;j<n;j++){
                int next = j;
               int  currSum = 0;
               for (int k=curr;k<=next;k++){
                   currSum+=arr[k];
               }
               if (currSum>maxSum){
                   maxSum = currSum;
               }
            }

        }
        System.out.println("max sum: "+maxSum);
    }
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,10};
        maxSumSubArrayB(arr);
    }
}
