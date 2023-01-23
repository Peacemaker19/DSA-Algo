import java.util.Scanner;
public class bitwiseOp
{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prev=sc.nextInt();
        int curr;
        boolean isDec=true;

        for(int i=1; i<n; i++){
            curr=sc.nextInt();

            if(curr==prev){
                isDec=false;
                break;
            }
              
            prev=curr;
                }
                System.out.println(isDec);

    }

}
