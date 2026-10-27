public class Factorial{
    public int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * factorial (n-1); //recurssion call
    }
    public void main(){
        System.out.println(factorial(5));
    }
}