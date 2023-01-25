import java.util.Scanner;
public class CheckSortedArrayRecursion {

    public static int[] input(int[] arr){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    public static boolean checksort(int[] arr){

        return checksortans(arr,0);

    }

    private static boolean checksortans(int[] arr, int si){
        if(si>=arr.length-1){
            return true;
        }
        if(arr[si]>arr[si+1]){
            return false;
        }

        return checksortans(arr,si+1);
        
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = input(arr);
        System.out.println(checksort(arr1));
        

    }
}
