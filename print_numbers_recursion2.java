import java.util.Scanner;
class print_numbers_recursion2 {

public static void number(int x){
    if(x==0){
        return;
    }
    
    number(x-1); 
    System.out.print(ans+" ");



}

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        number(x);

    }
}
