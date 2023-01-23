import java.util.Scanner;
public class reverseString {

    public static String input(){
        Scanner sc= new Scanner(System.in);

        String str=sc.nextLine();
        return str;
    }

    public static boolean checkPalindrome(String str){

        String str1="";
        
        for(int i=0;i<str.length(); i++){
            
            str1=str.charAt(i) + str1;
            
        }
        if(str.compareTo(str1)==0){
            return true;
        }else{
            return false;
        }

    }


    // public static void output(String str){

    //     System.out.println(str);

    // }

    public static void main(String[] args) {
       
       String str="";

       str = input();
       System.out.println(checkPalindrome(str));
        

    }
}
