import java.util.Scanner;

public class arrIOLogic {

   public static int input(String str){
      int count=1;
      for(int i=0;i<str.length();i++){

            if(str.charAt(i)==' '){
               count++;
            }
      }
      return count;

   }
   public static void main(String[] args) {
    
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(input(str)); 

   }
}
   


   


   
       
    

