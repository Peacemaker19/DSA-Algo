import java.util.Scanner;

public class pattern13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = (n*2+2)/2;
        int n2=n1-1;

        for(int i=0; i<n1; i++){

            for(int j=0;j<=i; j++){
                if(j==0){
                    System.out.print("*");
                }
            }
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }

            for(int j=i-1; j>=1; j--){
                System.out.print(j);
                
            } 
            
            for(int j=i-1; j>=0; j--){
                
                if(j==0){
                    System.out.print("*");
                }
            }    

               System.out.println();
        }

        for(int i=n2-1; i>=0; i--){

            for(int j=0;j<=i; j++){
                if(j==0){
                    System.out.print("*");
                }
            }
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }

            for(int j=i-1; j>=1; j--){
                System.out.print(j);
                
            } 
            
            for(int j=i-1; j>=0; j--){
                
                if(j==0){
                    System.out.print("*");
                }
            }    

               System.out.println();
        }

        

    }
    
}
