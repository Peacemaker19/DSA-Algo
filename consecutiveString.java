import java.util.Scanner;
public class consecutiveString {
    public static String output(String str1){
        
        String str2="";

        for(int i=0;i<str1.length(); i++){

            if(i==str1.length()-1){
                str2=str2+str1.charAt(i);
                break;
            }else if(str1.charAt(i)==str1.charAt(i+1)){
                continue;
            }else{
                str2=str2+str1.charAt(i);
            }
        }

        return str2;
       
        
    
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        String str1 = sc.nextLine();
        System.out.println(output(str1));
        sc.close();
    }
}


