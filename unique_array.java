import java.util.Scanner;

public class unique_array {
    public static int[] input(int n){
        Scanner sc= new Scanner(System.in);
        int[] input=new int[n];
        for(int i=0;i<input.length;i++){
            
            input[i]=sc.nextInt();

        }
        return input;
    }

    public static void unique(int[] arr){
        for(int i=0;i<arr.length; i++){
            int num=arr[i];
            for(int j=i;j<arr.length; j++){
                
                if(arr[i]>=arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                
            }
        }

        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int iterate=sc.nextInt();
        int num=0;
        for(int i=0; i<iterate;i++){
            int n = sc.nextInt();
            int arr[] = input(n);
            unique(arr);

        }
        
        for(int i=0;i<iterate; i++){
            System.out.println(num);
        }

        
        
    }
}
