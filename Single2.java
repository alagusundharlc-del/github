class Person {
void displayName() {
System.out.println("Person name is Alagu");
}
}

class Student extends Person {
void displayMarks() {
System.out.println("Student marks are 90");
}
}

class Main {
public static void main(String[] args) {
Student s = new Student();
s.displayName();
s.displayMarks();
}
}
