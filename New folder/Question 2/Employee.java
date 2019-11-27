public class Employee extends Person{
  public double salary;
  public int year;
  public String inNum;
  public Employee(String a, double b, int c, String d){
  super(a);
  this.salary = b;
  this.year = c;
  this.inNum = d;
  }
  public String getName(){
    return super.name;
  }
  public int getYear(){
    return this.year;
  }
  public String getInNum(){
    return this.inNum;
  }
  public double getSalary(){
    return this.salary;
  }
  public String equals(Employee a){
      if (this.inNum.equals(a.inNum))
        return "they are same employees";
      else
        return "they are different employees";
    }
}
  
  