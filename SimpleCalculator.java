import java.util.Scanner;

class SimpleCalculator {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

```
    System.out.println("Enter a:");
    int a = sc.nextInt();

    System.out.println("Enter b:");
    int b = sc.nextInt();

    System.out.println("Addition = " + (a + b));
    System.out.println("Subtraction = " + (a - b));
    System.out.println("Multiplication = " + (a * b));
    System.out.println("Division = " + ((b != 0) ? (double) a / b : "Cannot divide by zero"));
}
```

}
