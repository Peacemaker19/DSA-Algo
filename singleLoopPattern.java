import java.util.Scanner;
public class singleLoopPattern {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int i=1;
        int j=1;
        int n=sc.nextInt();

        while(i<=n){
            if(j==n){
                System.out.println("*");
                i++;
                j=1;
            }else{
                System.out.print("*");
                j++;
            }
        }
 

    }
}
