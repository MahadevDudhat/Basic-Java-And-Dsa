package Arrays;

import java.util.Scanner;

public class FindMaximum {

    static void takeInput(int arr[],int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    }

    //main function

    static void findMax(int [] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element of the array is: "+max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr [];
        int size;

        System.out.print("Enter the size of an Array: ");
        size = sc.nextInt();

        arr = new int[size];

        System.out.print("Enter the"+size+"elements in Array: ");
        takeInput(arr,size);

        findMax(arr);
    }
}
