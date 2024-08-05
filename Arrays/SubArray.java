package Arrays;

public class SubArray {
    static void findSubArray(int[] arr){
     int n = arr.length;
     for (int i=0;i<n;i++){
         int curr = i;
         for(int j=i;j<n;j++){
            int next = j;
            for(int k=curr;k<=next;k++){
                System.out.print(arr[k]+" ");
            }
             System.out.println();
         }
         System.out.println();
     }
    }
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,10};
        findSubArray(arr);
    }
}
