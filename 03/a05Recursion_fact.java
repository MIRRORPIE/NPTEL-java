class RecursiveFact{
    int n;
    int fact(int n){
        if(n == 0){
            return(1);
        }
        return(n * fact (n-1));
    }
}

public class a05Recursion_fact{
    public static void main(String args[]){
        RecursiveFact x = new RecursiveFact();
        for(int i = 1; i < 7; i++){
            x.n = i;
            System.out.println("Factorial of " + i + ": " + x.fact(x.n));
        }
    }
}
