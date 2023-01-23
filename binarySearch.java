import java.util.Scanner;
public class binarySearch {

    public static boolean findElement(int[] arr, int x){
        int start=0;
        int end = arr.length-1;
        int mid = (start+end)/2;

        while(start<=end){
            if(arr[mid]==x){
                return true;
            }else if(arr[mid]>x){
                end = mid-1;
            }else if(arr[mid]<x){
                start = mid+1;
            }
            mid = (start+end)/2;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr1 = new int[]{1,2,3,4,5,6,7,8,9,10};

        System.out.println(findElement(arr1,x)); 
        

    }
    
}
