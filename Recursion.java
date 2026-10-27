public class Recursion{
    public void PrintNumbers(int n){
        if(n==0)
        {
            return;
        }
        System.out.println(n); //recurssion call
    
        PrintNumbers(n-1); 
    }
    void main(){
        PrintNumbers(5);
    }
}