package MultiDimensionArray;
import java.util.Scanner;
public class Addition{
    public static void printArray(int[][] arr,int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void Add(int[][] A,int r1,int c1,int[][] B,int r2,int c2){
        if(r1!=r2 || r2!=c2){
            System.out.println("Wrong input!!!!!");
            return;
        }
        int[][] sum = new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                sum[i][j] = A[i][j]+B[i][j];
            }
        }

        printArray(sum,r1,c1);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);



        System.out.println("Enter the number of rows in the first array: ");
        int r1 = sc.nextInt();
        System.out.println("Enter the number of cols in first array: ");
        int c1 = sc.nextInt();
        int[][] A = new int[r1][c1];

        System.out.println("Enter the number of rows in the second array: ");
        int r2 = sc.nextInt();
        System.out.println("Enter the number of cols in second array: ");
        int c2 = sc.nextInt();
        int[][] B = new int[r2][c2];

        System.out.println("Enter the elements of first matrix: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of second matrix: ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                B[i][j] = sc.nextInt();
            }
        }

        Add(A,r1,c1,B,r2,c2);

    }
}