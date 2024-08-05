package Arrays;
import java.util.*;

public class BasicFunction {

    static void takeInput(int arr[],int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    }

    static void display(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[];
        int size;
        System.out.print("Enter the size of an Array: ");
        size = sc.nextInt();
        arr = new int[size];
        System.out.print("Enter the"+size+"elements in Array: ");

        takeInput(arr,size);

        System.out.println("Element in an array are: ");
        display(arr);

    }
}
