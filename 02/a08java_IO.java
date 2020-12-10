import java.io.*;
class a08java_IO{
    public static void main(String args[]){
        Float p = new Float(0);
        Float r = new Float(0);
        int n = 0;
        try{
            DataInputStream input = new DataInputStream(System.in);

            String tempString;

            System.out.print("Enter Principal Amount: ");
            System.out.flush();
            tempString = input.readLine();
            p = Float.valueOf(tempString);

            System.out.print("Enter Rate of Interest: ");
            System.out.flush();
            tempString = input.readLine();
            r = Float.valueOf(tempString);

            System.out.print("Enter Number of Years: ");
            System.out.flush();
            tempString = input.readLine();
            n = Integer.parseInt(tempString);

            float interestTotal = (p * r * n) / 100;

            System.out.println("Total Interest: " + interestTotal);
        }
        catch(Exception ex){
            System.out.println("There is Error in Program.");
        }
    }
}
