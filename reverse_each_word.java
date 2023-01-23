import java.util.Scanner;
public class reverse_each_word {
    public static String input(){
        
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();

        return str;
    }

    public static void output(String str){
      String str1="",str2="";
      int start=0;
      str.contains(str1);
      


      for(int i=0;i<str.length(); i++){
        

        if(str.charAt(i) == ' '){
            
           str2 = str2+str1;
            str2+=" ";
            str1="";
        }else{
            str1=str.charAt(i)+str1;
        }
        

      }
      str2 = str2+str1;
      System.out.println(str2);

    
    }

    public static void main(String[] args) {
        String str = input();
        output(str);
    }

}
