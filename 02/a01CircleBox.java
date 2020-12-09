class Circle{
    double x, y;
    double r;

    double circumference(){
        return(2*3.14159*r);
    }

    double area(){
        return (22/7)*r*r;
    }
}

class Box{
    double x, y, z;

    double volume(){
        return x*y*z;
    }

    double surfaceArea(){
        return 2*(x*y + y*z + z*x);
    }
}

class a01CircleBox{
    public static void main(String args[]){
        Circle c = new Circle();
        c.x = 0.0;
        c.y = 0.0;
        c.r = 5.0;
        System.out.println("Circumference: " + c.circumference());
        System.out.println("Area: " + c.area());

        Box b = new Box();
        b.x = 2.0;
        b.y = 4.0;
        b.z = 6.0;
        System.out.println("Volume: " + b.volume());
        System.out.println("Surface_Area: " + b.surfaceArea());
    }
}
