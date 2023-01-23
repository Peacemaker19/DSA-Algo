import java.util.Scanner;
public class removeChar {

    public static String output(String str, char ch){
        
        String str1="";
        for(int i=0;i<str.length(); i++){
            if(ch==str.charAt(i)){
                continue;
            }else{
                str1=str1+str.charAt(i);
            }
        }
        str=str1;
        return str;
	}
        

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        String str1 = sc.nextLine();
        String ch1 =sc.next();
        char ch =ch1.charAt(0);
        System.out.println(output(str1,ch));
        sc.close();
    }

}
