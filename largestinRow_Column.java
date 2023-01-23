import java.util.Scanner;
public class largestinRow_Column {
    
    public static int[][] input(int[][] arr,int row, int column){

        Scanner sc =new Scanner(System.in);
        for(int i=0;i<row; i++){
            for(int j=0;j<column; j++){
                System.out.println("Enter the value of row "+i+" column "+j);
                arr[i][j] = sc.nextInt();
        
            }
        }
        

        return arr;
    }

    public static void output(int[][] arr){

        int row = arr.length;
        int column = arr[0].length;
        int largest=0; 
        int index=0; 
        String str="";
        // System.out.println(arr1.length+" "+arr1[0].length);      


        for(int i=0;i<row;i++){
            int sum=0;
            for(int j=0;j<column; j++){
                sum=sum+arr[i][j];
            }
            if(largest<sum){

                largest=sum;
                index = i;
                str="row";

            }
            
        }

        for(int i=0;i<column;i++){
            int sum=0;
            for(int j=0;j<row; j++){
                sum=sum+arr[j][i];
            }
            if(largest<sum){

                largest=sum;
                index=i;
                str = "column";

            }
            
        }

        System.out.println(str+" "+index+" "+largest);



    }

        

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the row:");
        int row = sc.nextInt(); 

        System.out.println("Enter the column:");
        int column = sc.nextInt();

        int[][] arr= new int[row][column];
        int a = arr.length;
        int b = arr[a-1].length;
        
         arr = input(arr,row,column);
         output(arr);
        

    }
}
