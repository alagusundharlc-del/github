import java.util.*;

class d2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
         int m= sc.nextInt();
           int a[][]= new int[n][m];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n;i ++){
           
          
            for(int j=0; j< m;j++){
                a[i][j]=sc.nextInt();
            }    
        } 
           
           System.out.println("Elements of array are");
        for( int i =0; i < n; i++){
            for(int j=0; j< m;j++){ 
            System.out.println(a[i][j]+" ");
            
    }
     System.out.println();
            
} 
 }
    
}       
      