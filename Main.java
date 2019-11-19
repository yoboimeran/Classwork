import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of Circle");
        double x = sc.nextDouble();
        Circle c = new Circle(x);
        System.out.println(c.space());
        System.out.println("Enter radius of Sphere");
        double r = sc.nextDouble();
        Sphere s = new Sphere(r);
        System.out.println(s.space());
    }

}
