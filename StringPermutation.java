import java.util.Scanner;

public class StringPermutation {

    public static boolean output(String str1, String str2){
        
        
        if(str1.length()!=str2.length()){
            return false;
        }
        
        int[] freq=new int[256];
        
        for(int i=0; i<str1.length(); i++){
            char ch = str1.charAt(i);
            freq[ch]++;
        }
        
        for(int i=0; i<str2.length(); i++){
            char ch = str2.charAt(i);
            freq[ch]--;
        }
        
        for(int i=0; i<freq.length; i++){
           if(freq[i]!=0){
               return false;
           }
               
           
        }
        return true;
        
    
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(output(str1,str2));
        sc.close();
    }
}
