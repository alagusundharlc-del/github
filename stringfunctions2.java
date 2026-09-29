import java.util.*;

class stringfunctions2{
    public static void main(String[]args){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the string");
        int Upper=0;
        int Lower=0;
        int digit=0;
        int spaces=0;
        String s = sc.nextLine();
         for(int i=0; i< s.length(); i++){
            char ch= s.charAt(i);
            if (ch.isUpper()){
                Upper++;
            }if (ch.isLower()){
                Lower++;
            }
            if (ch.isdigit()){
                digit++;
            }
            if (ch.isspaces()){
                spaces++;
            }
         }
        System.out.println("Upper Case in  String "+Upper);
            System.out.println("Lower Case in  String "+Lower);
             System.out.println("Digits Case in  String "+digit);
               System.out.println("Spaces Case in  String "+spaces);
    }
}    
             
