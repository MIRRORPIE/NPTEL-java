class Point2D{
    int x;
    int y;
    void display(){
        System.out.println("x = " + x + "\ty = " + y);
    }
}

class Point3D extends Point2D{
    int z;
    void display(){
        System.out.println("x = " + x + "\ty = " + y + "\tz = " + z);
    }
}

class a06Simple_Inheritance{
    public static void main(String args[]){
        // Point2D new P1();
        // Point3D new P2();
        Point2D P1 = new Point2D();
        Point3D P2 = new Point3D();
        P1.x = 10;
        P1.y = 20;
        System.out.println("Point2d P1 is: ");
        P1.display();

        P2.x = 5;
        P2.y = 6;
        P2.z = 7;
        System.out.println("Point3D P2 is: ");
        P2.display();
    }
}
