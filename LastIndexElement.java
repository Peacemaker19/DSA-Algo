import java.util.Scanner;
public class LastIndexElement {
    public static int[] input(int[] arr){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    public static int LastIndex(int[] arr, int x){
        return LastIndexans(arr, arr.length-1, x);
    }

    private static int LastIndexans(int[] arr, int size, int x){
        if(size<=0){
            return 0;
        }
        if(arr[size]==x){
            return size;
        }

        return LastIndexans(arr,size-1,x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = input(arr);
        System.out.println("Enter The Number = ");
        int x = sc.nextInt();
        System.out.print(LastIndex(arr1,x));
    }
}
