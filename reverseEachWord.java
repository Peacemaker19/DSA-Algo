import java.util.Scanner;
public class reverseEachWord {
    
    public static String input(){
        
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();

        return str;
    }

    public static void output(String str){
        
        int start=0,end=0;

        String str1="";
        String str3="";

       for(int i=0;i<str.length();i++){

            str1 = str.charAt(i)+str1;

       }


       for(int i=0;i<str1.length(); i++){
        if(str1.charAt(i)==' '){
            end=i;
            String str2="";
            for(int j=start; j<end; j++){
                str2=str1.charAt(j)+str2;
            }
            str3=str3+str2;
            str3=str3+" ";
            start=end+1;
        }
        
       }

       String str2="";
       for(int j=start; j<str1.length(); j++){
        str2=str1.charAt(j)+str2;
    }
        str3=str3+str2;

        input=str3;
       
       // System.out.println(str3);

       //System.out.println(start+" "+str.length());
      
       



    }

    public static void main(String[] args) {
        String str = input();
        output(str);
    }

}
