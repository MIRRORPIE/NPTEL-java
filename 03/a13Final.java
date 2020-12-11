final class Bike{}

class Hondal extends Bike{
    void run(){
        System.out.println("Running...");
    }
}

class a13Final{
    public static void main(String args[]){
        Hondal h = new Hondal();
        h.run();
    }
}


//error: cannot inherit from final Bike
