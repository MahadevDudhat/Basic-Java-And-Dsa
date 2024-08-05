package ArrayQuestionSolving;

public class SortSquaredArray {
    public static void reverseArray(int[] arr){
        int n = arr.length;
        int l = 0;
        int  r = n-1;
        while(l<=r){
            int temp = arr[l];
            arr[l]=arr[r];
            arr[r] =temp;
            r--;
            l++;
        }
    }

    public static int[] sortArray(int[] arr){
        int n = arr.length;
        int k=0;
        int[] ans = new int[n];
        int left =0;
        int right =n-1;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k]=arr[left]*arr[left];
                k++;
                left++;

            }else{
                ans[k]=arr[right]*arr[right];
                k++;
                right--;
            }
        }

        reverseArray(ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {-10,-3,-2,1,4,5};
        int[] ans = sortArray(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
}
