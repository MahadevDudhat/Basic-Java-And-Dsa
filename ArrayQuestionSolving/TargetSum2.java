package ArrayQuestionSolving;

public class TargetSum2 {
    public static int CountTriplet(int[] arr,int target){
        int cnt =0;

        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k = j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        cnt++;
                    }
                }
            }
        }

        return cnt;
    }
    public static void main(String []args){
        int[] arr = {1,4,5,6,3};
        int target = 12;
        int ans = CountTriplet(arr,target);
        System.out.println(ans);
    }
}
