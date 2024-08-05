package Arrays;

public class SmallestInArray {

    static void smallestInArray(int[] arr){
        int minVal = Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<minVal){
                minVal = arr[i];
            }
        }
        System.out.println(minVal);
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,5,32,5454,121,0};
        smallestInArray(arr);

    }
}
