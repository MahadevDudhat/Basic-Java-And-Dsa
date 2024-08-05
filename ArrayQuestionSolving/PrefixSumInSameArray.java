package ArrayQuestionSolving;

public class PrefixSumInSameArray {
    public static void findPrefixSum(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }

    }
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5};
        findPrefixSum(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
