import java.util.*;

class stringfunctions{
    public static void main(String[]args){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println("Charatics of 6th String "+ s.charAt(6));
         System.out.println("Length of  String "+ s.length());
          System.out.println("Substring of  String "+ s.substring(6));
           System.out.println("Upper Case of  String "+ s.toUpperCase());
            System.out.println("Lower Case of  String "+ s.toLowerCase());
             System.out.println( "Contains of  String "+s.contains("String"));
              System.out.println("Starts With of  String "+ s.startWith("String"));
               System.out.println("Ends With of  String "+ s.endsWith("String"));
                System.out.println("Index of  String "+ s.indexof("String"));
    }
} 