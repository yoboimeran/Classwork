public class Tester{
  public static void main (String[] args){
    Cat c = new Cat("Cat");
    Dog d = new Dog("Dog");
    System.out.println(c.makeNoise());
    System.out.println(d.makeNoise());
  }
}