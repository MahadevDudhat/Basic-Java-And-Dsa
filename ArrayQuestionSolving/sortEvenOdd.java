package ArrayQuestionSolving;

public class sortEvenOdd {

    public static void sortArray(int[] arr){
        int n=arr.length;
        int left =0;
        int right = n-1;
        while(left<right){
            if(arr[left]%2==1&&arr[right]%2==0){
                int temp = arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};//ans->2,4,6,1,3,5,7
        sortArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
