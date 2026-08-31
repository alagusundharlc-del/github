import java.util.*;

class d1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
         int a[][]= new int[3][3];
        a[0][0]=2;
         a[0][1]=3;
          a[0][2]=4;
           a[1][0]=5;
            a[1][1]=6;
             a[1][2]=7;
          a[2][0]=2;
           a[2][1]=2;
            a[2][2]=2;
            for(int i=0; i<3;i++){
                
            
             for(int j=0; j<3;j++){
                a[i][j]=sc.nextInt();
            }
            }
            for( int i =0; i < 3; i++){
           
            
            for( int j =0; j < 3; j++){
            System.out.println(a[i][j]+" ");
            }
               System.out.println();
            }
    }
}     