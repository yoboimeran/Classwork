public class Point {
    private double radius;
    Point (double r) {
        radius = r;
    }
    double space ( ) {
        System.out.println("Space for a point can't be defined");
        return 0;
    }
    protected double getRadius(){
        return radius;
    }

}
