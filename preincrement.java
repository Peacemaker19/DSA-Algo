public class preincrement {
    public static void main(String[] args) {

        int arr[]=new int[]{1,7,4,2,0,9};
        int x=2;
        int s=0, e=(arr.length-1), mid=0;

       for(int i=0; i<arr.length; i++){
        for(int j=i; j<arr.length; j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
       }
    
    //    for(int i=0;i<arr.length; i++){
    //     System.out.print(arr[i]+" ");
    //    }

       mid=(s+e)/2;
       for(int i=s;i<e; i++){
        
        if(arr[mid]==x){
            System.out.print("Found");
            return;
        }else if(arr[mid]>x){
               e=mid-1;
               mid=(s+e)/2;
               
            }else if(arr[mid]<x){
                s=mid+1;
                mid =(s+e)/2;
            }
           
        }
        System.out.println("Not Found");
        
        
       }



    }

