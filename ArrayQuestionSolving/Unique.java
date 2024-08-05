package ArrayQuestionSolving;

public class Unique {

    public static int FindUnique(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                   arr[j]=arr[i]=-1;
                }
            }
        }

        int ans=-1;
        for(int i=0;i<n;i++){
            if(arr[i]!=-1){
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args){

        int[] arr = {1,2,3,3,2,1,4};

        int ans = FindUnique(arr);
        System.out.println(ans);


    }
}
