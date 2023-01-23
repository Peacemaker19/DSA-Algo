import java.util.Scanner;
public class highestOccuringChar {
    public static char output(String str){
        
       String str1 = "";
       char ch='\0';
       int a=0;
       int[] freq = new int[256];
       for(int i=0;i<str.length();i++){

        char ch1 = str.charAt(i);
        freq[ch1]++;

       }

       for(int i=0; i<freq.length; i++){

            if(a<freq[i]){
                a=freq[i];
                ch=(char)i;

            }

        }
        return ch;
       }        

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        String str1 = sc.nextLine();
        System.out.println(output(str1));
        sc.close();
    }


}
