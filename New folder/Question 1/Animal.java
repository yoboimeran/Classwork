public abstract class Animal{
  public String name;
  public Animal(String a){
    this.name = a; 
  }
  public String getName(){
    return this.name;
  }
  public abstract String makeNoise();
}