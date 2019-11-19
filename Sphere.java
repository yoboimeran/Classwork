public class Sphere extends Point {

    public Sphere(double r){
        super(r);
        System.out.println("Creating a Sphere … done!");

    }
    double space(){
        double a = (4/3)*Math.PI*Math.pow(getRadius(),3);
        System.out.print("The area of the Sphere is ");
        return a;
    }
}
