import java.util.Scanner;
public class spiralMatrix {
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

        int total = arr.length*arr[0].length;
        int startrow=0;
        int endrow=arr.length-1;
        int startcolumn=0;
        int endcolumn=arr[0].length-1;
        int digit[] = new int[arr.length*arr[0].length];
        int count=0;

        while(count<total){

        for(int i =startcolumn; i<=endcolumn; i++){
            digit[count] = arr[startrow][i];
            count++;
        }
        startrow++;

        for(int i=startrow; i<=endrow; i++){
            digit[count] = arr[i][endcolumn];
            count++;
        }
        endcolumn--;

        for(int i = endcolumn; i>=startcolumn; i--){
            digit[count] = arr[endrow][i];
            count++;
        }
        endrow--;

        for(int i = endrow; i>=startrow; i--){
            digit[count] = arr[i][startcolumn];
            count++;
        }
        startcolumn++;

        
    }

    for(int i=0;i<digit.length; i++){
        System.out.print(digit[i]+" ");
    }

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
