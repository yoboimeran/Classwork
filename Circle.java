public class Circle extends Point {
    public Circle(double r){
        super(r);
        System.out.println("Creating a Circle … done!");

    }
    public double space(){
        double a = Math.PI* Math.pow(getRadius(), 2);
        System.out.print("The area of the Circle is ");
        return a;
    }
}
