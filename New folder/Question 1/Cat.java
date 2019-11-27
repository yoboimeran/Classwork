public class Cat extends Animal{
  public Cat(String a){
  super(a);
  }
  public String makeNoise(){
    return super.name + " says meow";
  }
}