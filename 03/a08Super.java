class Animal{
    String color = "White";

    void eat(){
        System.out.println("Animal Eating...");
    }
}

class Dog extends Animal{
    String color = "Black";
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }

    void eat(){
        System.out.println("Dog Eating Bread...");
    }

    void bark(){
        System.out.println("Dog Barking...");
    }

    void work(){
        super.eat();
        bark();
        eat();
    }
}

class a08Super{
    public static void main(String args[]){
        Dog d = new Dog();
        d.printColor();
        d.work();
    }
}
