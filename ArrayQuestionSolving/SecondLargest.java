package ArrayQuestionSolving;

public class SecondLargest {

    public static int secondLargest(int[] arr){
        int n = arr.length;
        int fl = Integer.MIN_VALUE;
        int sl = -1;

        for(int i=0;i<n;i++){
            if(arr[i]>fl){
                sl = fl;
                fl = arr[i];
            } else if (arr[i]<fl && arr[i]>sl) {
                sl = arr[i];
            }
        }
        return sl;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int sl = secondLargest(arr);
        System.out.println(sl);
    }
}
