import java.util.Scanner;
public class calculate_power_recursion1 {

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int ans = x*power(x,n-1);
        return ans;
    }

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();
    sc.close();
    int ans = power(x, n);
    System.out.println(ans);
    
   }
    
}

 
