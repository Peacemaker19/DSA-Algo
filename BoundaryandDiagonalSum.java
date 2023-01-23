import java.util.Scanner;
public class BoundaryandDiagonalSum {
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
        int sum=0,start=0,end=column-1;

        for(int i=0;i<row; i++){
            for(int j=0; j<column; j++){

                if(i==j || i==0 ||j==0 || i==(row-1) || j==(column-1)){
                    //System.out.println(i+" "+j);
                    //  sum=sum+arr[i][j];
                    // arr[i][j]=0;
                }
                 if(start<row && end>=0){
                    System.out.println(start+" "+end);
                    //  sum=sum+arr[start][end];
                    //  arr[start][end]=0;
                      start++;
                      end--;
                }
                
            }
        }

        System.out.println(sum);

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
