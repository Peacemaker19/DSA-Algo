import java.util.Scanner;
public class substring {

    public static String input(){
        
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();

        return str;
    }

    public static void output(String str){

      // System.out.println(str.substring(0,3)); 


        for(int i=1; i<=str.length(); i++){

            for(int j=0; j<=str.length()-i; j++){

                int end = j+i;
               
                System.out.println(str.substring(j,end));
            }

        }

    }

    
    public static void main(String[] args) {
        String str = input();
        output(str);
    }
}
