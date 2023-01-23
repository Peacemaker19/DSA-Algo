import java.util.Scanner;
public class rowwiseSum {

    public static int[][] input(int[][] arr,int row, int column){

        Scanner sc =new Scanner(System.in);
        for(int i=0;i<row; i++){
            for(int j=0;j<column; j++){
                System.out.println("Enter the value of row "+i+" column "+j);
                arr[i][j] = sc.nextInt();
            }
        }
        

        return arr;
    }

    public static void output(int[][] arr, int row, int column){

        int arr1[] = new int[row];

        for(int i=0;i<row;i++){
            int sum=0;
            for(int j=0;j<column; j++){
                sum=sum+arr[i][j];
            }
            arr1[i] = sum;
        }

        for(int i=0;i<row; i++){
            System.out.print(arr1[i]+" ");
        }
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the row:");
        int row = sc.nextInt(); 

        System.out.println("Enter the column:");
        int column = sc.nextInt();

        int[][] arr= new int[row][column];
        int a = arr.length;
        int b = arr[a-1].length;
        System.out.println(a+" "+b);
        
        // arr = input(arr,row,column);
        // output(arr,row,column);
        

    }
}
