class Static_Members{
    int rollno;
    String name;
    static String College = "DSU";
     Static_Members  (int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }
    void display(){
        System.out.println(rollno+ " " +name+ " " +College);
    }

public static void main(String[]args){
    Static_Members s1 = new  Static_Members(20, "Argith ");
      Static_Members s2 = new  Static_Members(22, "Aritra Mondal ");
        s1.display();
        s2.display();
    }
}