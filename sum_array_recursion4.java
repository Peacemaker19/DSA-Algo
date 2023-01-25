import java.util.Scanner;

public class sum_array_recursion4 {

    public static int[] input(int[] arr){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }

        public static int arrSum(int[] arr,int size){
            if(size<=0){
                return 0;
            }
           
            return arr[size-1]+arrSum(arr, size-1);
            
        }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = input(arr);
        System.out.println(arrSum(arr1, arr1.length));
    }
}
