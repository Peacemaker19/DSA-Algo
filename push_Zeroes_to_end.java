import java.util.Scanner;

public class push_Zeroes_to_end {
    
    public static void push(int[] arr){
        
        int s=;
        int e=arr.length-1;
        

        for(int i=0;i<arr.length;i++){


            if(s>e ){
                break;
            }

            if(arr[s]==0 && arr[e]!=0){
                
                    int temp = arr[s];
                    arr[s] = arr[e];
                    arr[e] = temp;
                    s++;
                	e--;
                }else if(arr[s]!=0){s++;}
            else if(arr[e]==0){
                e--;
            }
            }

        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }


    }

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
            push(arr);

    }

}
