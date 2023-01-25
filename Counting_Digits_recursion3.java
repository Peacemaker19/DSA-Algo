import java.util.Scanner;

public class Counting_Digits_recursion3 {
    
    public static int countdigit(int n){
        if(n==0){
            return 0;
        }
        int small = countdigit(n/10);
        return small+1;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countdigit(n)); 
    }
}
