package ArrayQuestionSolving;

public class TargetSum1 {
    public static int Target(int[] arr,int k){
        int cnt = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    cnt++;
                }
            }
        }


        return cnt;
    }

    public static void main(String []args){
        int[] arr = new int[]{4,6,3,5,8,2};
        int k = 7;
        int ans = Target(arr,k);
        System.out.println(ans);
    }
}
