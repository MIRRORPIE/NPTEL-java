public class a02CircleStaticMethod{
    public double x, y, r;
    // An instance method, Returns the bigger of two circle
    public a02CircleStaticMethod bigger(a02CircleStaticMethod c){
        if(c.r > r) return c;
        else return this;
    }
    // An class method, Returns the bigger of two classes
    public static a02CircleStaticMethod bigger(a02CircleStaticMethod a, a02CircleStaticMethod b){
        if(a.r > b.r) return a;
        else return b;
    }

    public static void main(String args[]){
        a02CircleStaticMethod a = new a02CircleStaticMethod(2.0);
        a02CircleStaticMethod b = new a02CircleStaticMethod(3.0);
        a02CircleStaticMethod c = a.bigger(b);
        a02CircleStaticMethod d = a02CircleStaticMethod.bigger(a, b);
    }
}
