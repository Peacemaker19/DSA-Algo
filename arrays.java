import java.util.Scanner;

public class arrays {
    
    public static int[] input(int arr[]){

        Scanner sc=new Scanner(System.in);

        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        return arr;

    }

    public static int calc(int arr[],int find){
        
        for(int i=0;i<arr.length; i++){
           
            if(find==arr[i]){
                return i;
            }

        }
        return -1;
    }

   
   

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        

        for(int i=1; i<=t; i++){
           
            int n=sc.nextInt();
            int[] arr=new int[n];
            arr=input(arr);
            int find=sc.nextInt();
            System.out.println(calc(arr,find));


        }
       

    }
}
