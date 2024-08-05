package ArrayQuestionSolving;

public class SortArraysOfZeroAndOnes {
    public static void sortZerosAndOnes(int[] arr){
        int n = arr.length;
        int left =0;
        int right = n-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                int temp = arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }

        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,1,0,1,0,1,0,0,1};
        sortZerosAndOnes(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
