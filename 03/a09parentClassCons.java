class Animal{
    Animal(){
        System.out.println("Animal is created.");
    }
}

class Dog extends Animal{
    Dog(){
        super();
        System.out.println("Dog is created.");
    }
}

class a09parentClassCons{
    public static void main(String args[]){
        Dog d = new Dog();
    }
}
