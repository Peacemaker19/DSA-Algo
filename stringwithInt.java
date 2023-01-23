import java.util.Scanner;
public class stringwithInt {
    public static String output(String str){

        String str2="";
        int count=1;
        for(int i=0;i<str.length();i++){
            if(i==str.length()-1){
                str2=str2+str.charAt(i);
                if(count>1){
                    str2 = str2+String.valueOf(count);
                }
            }else if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }else{
                str2 = str2+str.charAt(i);
                if(count>1){
                    str2 = str2+String.valueOf(count);
                }
                count=1;
            }
        }
        str=str2;
        
        return str;
        }        
 
     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         
         String str1 = sc.nextLine();
         System.out.println(output(str1));
         sc.close();
     }
 
}
