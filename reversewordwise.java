import java.util.Scanner;
public class reversewordwise {
    public static String input(){
        
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();

        return str;
    }

    public static void output(String str){
        String str1="";
        int end=str.length();
        int start=str.length()-1;

        while(start>=0){

            if(str.charAt(start)==' '){
                str1=str1+str.substring(start+1,end)+" ";
                end = start;
            }
            start--;
           
        }
        str1 = str1+str.substring(start+1,end);

        

        System.out.println(str1);
    
    }

    public static void main(String[] args) {
        String str = input();
        output(str);
    }

}
