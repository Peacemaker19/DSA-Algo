import java.util.Scanner;
public class FirstIndexElement {
    public static int[] input(int[] arr){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    public static int firstIndex(int[] arr, int x){
        return firstIndexans(arr, 0, x);
    }

    private static int firstIndexans(int[] arr, int si, int x){
        if(si>=arr.length-1){
            return 0;
        }
        if(arr[si]==x){
            return si;
        }

        return firstIndexans(arr,si+1,x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = input(arr);
        System.out.println("Enter The Number = ");
        int x = sc.nextInt();
        System.out.print(firstIndex(arr1,x));
    }
}
