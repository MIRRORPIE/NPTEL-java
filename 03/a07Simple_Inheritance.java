class Point2D{
    int x;
    int y;
    Point2D(int a, int b){
        x = a;
        y = b;
    }
    void display(){
        System.out.println("x = " + x + "\ty = " + y);
    }
}

class Point3D extends Point2D{
    int z;
    Point3D(int c){
        z = c;
    }
    void display(){
        System.out.println("x = " + x + "\ty = " + y + "\tz = " + z);
    }
}

class a07Simple_Inheritance{
    public static void main(String args[]){
        Point2D P1 = new Point2D(10, 20);
        System.out.println("Point2d P1 is: ");
        P1.display();

        Point3D P2 = new Point3D(70);
        System.out.println("Point3D P2 is: ");
        P2.display();

        Point2D P3 = (Point2D) P2;
        P3.dispaly();
    }
}
