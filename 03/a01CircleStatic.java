public class a01CircleStatic{
    static int circleCount = 0;
    public double x, y, r;
    public a01CircleStatic(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
        circleCount += 1;
    }
    public a01CircleStatic(double r){
        this(0.0, 0.0, r);
        //circleCount += 1;
    }
    public a01CircleStatic(a01CircleStatic c){
        this(c.x, c.y, c.r);
        //circleCount += 1;
    }
    public a01CircleStatic(){
        this(0.0, 0.0, 1.0);
        //circleCount += 1;
    }
    public double circumference(){
        return(2*3.14*r);
    }
    public double area(){
        return(3.14*r*r);
    }

    public static void main(String args[]){
        a01CircleStatic c1 = new a01CircleStatic();
        System.out.println("Circle 1:");
        System.out.printf("Circumference: %f\t Area: %f\n\n", c1.circumference(), c1.area());

        a01CircleStatic c2 = new a01CircleStatic(2, 4, 6);
        System.out.println("Circle 2:");
        System.out.printf("Circumference: %f\t Area: %f\n\n", c2.circumference(), c2.area());

        a01CircleStatic c3 = new a01CircleStatic(2);
        System.out.println("Circle 3:");
        System.out.printf("Circumference: %f\t Area: %f\n\n", c3.circumference(), c3.area());

        a01CircleStatic c4 = new a01CircleStatic(c2);
        System.out.println("Circle 4:");
        System.out.printf("Circumference: %f\t Area: %f\n\n", c4.circumference(), c4.area());

        System.out.println("Total number of Circle instance is: " + circleCount);
        System.out.printf("c1.count: %d\t c2.count: %d\t c3.count: %d\t c4.count: %d", c1.circleCount, c2.circleCount, c3.circleCount, c4.circleCount);


    }
}
