import java.util.*;

public class a05MaximumCalculator{
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter two numbers to find maximum of two: ");
        int a = scnr.nextInt();
        int b = scnr.nextInt();
        if(a > b){
            System.out.printf("Between %d and %d, Maximum is %d \n", a, b, a);
        }
        else if(b > a){
            System.out.printf("Between %d and %d, Maximum is %d \n", a, b, b);
        }
        else{
            System.out.printf("Both numbers %d and %d are equal.", a, b);
        }
    }
}
