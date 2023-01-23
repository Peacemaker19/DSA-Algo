import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int n1 = (n*2+2)/2;
        int n2=n1-1;


        
        for(int i=1; i<=n1; i++){
            System.out.print("*");
            

            for(int j=1; j<=i; j++){
                System.out.print(j);
            }

            for(int j=i-1; j>=1; j--){
                System.out.print(j);
                
            } 
            
            for(int j=i; j>=1; j--){
                
                if(j==1){
                    System.out.print("*");
                }
            }    
          System.out.println();
        }

        for(int i = n2-1; i>=0; i--){
            System.out.print("*");

            for(int j=1; j<i; j++){
                System.out.print(j);
            }

            for(int j=i-2; j>0; j--){
                System.out.print(j);
            } 

            for(int j=i; j>=1; j--){
                
                if(j==1){
                    System.out.print("*");
                }
            }    

            System.out.println();
        }
        System.out.print("*");
       
        

    }
}
