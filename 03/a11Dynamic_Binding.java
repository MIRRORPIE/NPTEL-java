class A{
    void callMe(){
        System.out.println("I'm from A.");
    }
}

class B extends A{
    void callMe(){
        System.out.println("I'm from B.");
    }
}

class a11Dynamic_Binding{
    public static void main(String args[]){
        A a = new B();
        a.callMe();

        B b = new B();
        b.callMe();
    }
}
