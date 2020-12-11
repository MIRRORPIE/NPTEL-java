class Animal{
    void run(){
        System.out.println("Animal Running...");
    }
}

class Dog extends Animal{
    void run(){
        System.out.println("Dog Running...");
    }
}

class a10super{
    public static void main(String args[]){
        Dog d = new Dog();
        d.run();

        Animal a = new Animal();
        a.run();

        Animal aa = new Dog(); // upcasting
        aa.run();
    }
}
