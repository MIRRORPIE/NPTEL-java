abstract class Bike{
    Bike(){
        System.out.println("Superclass constructor called...");
    }
    abstract void run();
}

class Honda extends Bike{
    Honda(){
        System.out.println("Subclass constructor called...");
    }
    void run(){
        System.out.println("Running Safely...");
    }
}

class a12Abstract{
    public static void main(String args[]){
        Bike obj = new Honda();
        obj.run();

        Honda h = new Honda();
        h.run();

        // Bike b = new Bike();
        // b.run();   this will give erroe
        // error: Bike is abstract; cannot be instantiated
    }
}
