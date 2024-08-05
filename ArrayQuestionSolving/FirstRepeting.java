package ArrayQuestionSolving;

public class FirstRepeting {

    public static int firstRepeting(int[] arr){
        int first = -1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return first;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,3,4,6,3,4};
        int ans = firstRepeting(arr);
        System.out.println(ans);
    }
}
