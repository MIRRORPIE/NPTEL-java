class Circle{
    static int circleCount = 0;
    public double x, y, r;
    public Circle(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
        circleCount += 1;
    }
    public Circle(double r){
        this(0.0, 0.0, r);
    }
    public Circle(Circle c){
        this(c.x, c.y, c.r);
    }
    public Circle(){
        this(0.0, 0.0, 1.0);
    }
    public double circumference(){
        return(2*3.14*r);
    }
    public double area(){
        return(3.14*r*r);
    }
    // An instance method, Returns the bigger of two circle
    public Circle bigger(Circle c){
        if(c.r > r) return c;
        else return this;
    }
    // An class method, Returns the bigger of two classes
    public static Circle bigger(Circle a, Circle b){
        if(a.r > b.r) return a;
        else return b;
    }
}

public class a02CircleStaticMethod{
    public static void main(String args[]){
        Circle a = new Circle(2.0);
        Circle b = new Circle(3.0);
        Circle c = a.bigger(b);
        Circle d = Circle.bigger(a, b);

        System.out.println(c.r);
        System.out.println(d.r);
    }
}
