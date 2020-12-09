class A{
    void mari(){
        System.out.println("Hello Mari!");
    }
    void nani(){
        System.out.println("Hello Nani!");
        this.mari();
    }
}

class a04This_Method{
    public static void main(String args[]){
        A a = new A();
        a.nani();
    }
}
