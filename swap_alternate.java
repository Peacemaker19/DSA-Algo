import java.util.Scanner;

public class swap_alternate {
    
    public static int[] input(int n){
        Scanner sc= new Scanner(System.in);
        int[] input=new int[n];
        for(int i=0;i<input.length;i++){
            
            input[i]=sc.nextInt();

        }
        return input;
    }

    // Approach one by making changes in loop condition
    public static void swap1(int[] arr){

        System.out.print("Approach One -> ");
            for(int i=0;i<arr.length-1;i++){
              
               for(int j=i+1; j<arr.length; j++){
               System.out.print("("+arr[i]+","+arr[j]+")"+"\t");
               }
                
            }    

        }

        //Approach second using if condition 
        public static void swap2(int[] arr){

            System.out.println();
            System.out.print("Approach Two -> ");
                for(int i=0;i<arr.length-1;i++){
                  
                   for(int j=i; j<arr.length; j++){
                    if(arr[i]!=arr[j])
                    System.out.print("("+arr[i]+","+arr[j]+")"+"\t");
                   }
                    
                }    
    
            }
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int arr[] = input(n);
        swap1(arr);
        swap2(arr);
        

        

        
    }

}
