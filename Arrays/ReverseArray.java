package Arrays;
import java.util.*;
public class ReverseArray {
static Scanner sc = new Scanner(System.in);
    static void input(int[] arr){
        for(int i=0;i<arr.length;i++){
          arr[i] = sc.nextInt();
        }
    }

    static void output(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
       while(start<end){
           swap(arr,start,end);
           start++;
           end--;
       }
      output(arr);


    }

    public static void main(String [] args){
        int n;
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        int [] arr = new int[n];
        input(arr);

        reverseArray(arr);




    }
}
