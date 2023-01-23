import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){

            int sum=0;

            for(int j=1; j<=i; j++){
                if(j>1 && j<=i){
                    System.out.print("+");
                }
                System.out.print(j);
                sum=sum+j;
            }  
            System.out.print("=");
            
            System.out.print(sum);
            
            System.out.println();        
                                        
            }
            
            
        

    }
}
