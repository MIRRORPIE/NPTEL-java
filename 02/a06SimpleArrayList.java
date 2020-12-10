import java.util.*;

public class a06SimpleArrayList{
    public static void main(String args[]){
        int sum = 0;
        float avg = 0;
        ArrayList <Integer> arr = new ArrayList<Integer>();
        System.out.print("Enter the inputs: ");
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt()){
            arr.add(input.nextInt());
        }
        for(int i = 0; i < arr.size(); i++){
            sum += arr.get(i);
        }
        avg = sum / (arr.size());
        System.out.println("Average: " + avg);
    }
}
