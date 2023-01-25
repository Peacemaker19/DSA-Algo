import java.util.Scanner;
public class Check_array_recursion5 {
    public static int[] input(int[] arr){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    public static boolean checknum(int[] arr1, int x, int size){
            if(size<=0){
                return false;
            }
            if(x==arr1[size-1]){
                return true;
            }
            return checknum(arr1, x, size-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = input(arr);
        System.out.print("Enter the number to find = ");
        int x = sc.nextInt(); 
        System.out.print(checknum(arr1, x, n)); 
        

    }
}
