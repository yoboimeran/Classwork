public class Dog extends Animal{
  public Dog(String a){
  super(a);
  }
  public String makeNoise(){
    return super.name + " says bhao";
  }
}