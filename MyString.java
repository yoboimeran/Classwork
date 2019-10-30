public class MyString{
  public char[] kaj;
  public MyString(String a){
    this.kaj = a.toCharArray();
  }
  public int length(){
    return kaj.length;
  }
  public char charAt(int a){
    return kaj[a];
  }
  public boolean startsWith(MyString a){
    boolean b = true;
    for(int i=0; i<a.length(); i++){
      if (this.kaj[i]==a.kaj[i]){
      }
      else{
        b= false; 
        break; 
      }
    }
    return b; 
  }
  
}