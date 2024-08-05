package ArrayQuestionSolving;

public class RotateArrayByKSteps {
    public static int[] rotateByK(int[] arr,int k){
        int n = arr.length;
        k = k%n;
        int[] ans = new int[n];
        int j=0;
        for(int i =n-k;i<n;i++){
            ans[j]=arr[i];
            j++;
        }
        for(int i= 0;i<n-k;i++){
            ans[j]=arr[i];
            j++;
        }
        return  ans;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int k = 2;

        int[] ans = rotateByK(arr,k);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }

    }
}
