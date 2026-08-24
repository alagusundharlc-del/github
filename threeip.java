import java.util.*;

class threeip{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a > b && a > c ) {
            System.out.println(" the gratest value "+a);
        } else if(b > a && b > c ) {
            System.out.println(" the gratest value "+b);
        } else {
            System.out.println(" the gratest value "+c);
        }
    }
}    