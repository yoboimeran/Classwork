public class MyString{
  public char[] kaj;
  public MyString(String a){
    this.kaj = a.toCharArray(); //this.kaj
  }
  public int length(){
    return kaj.length;
  }
  public char charAt(int a){
    return kaj[a];
  }
  
  public boolean startsWith(MyString a){
    boolean b = true;
    for(int i=0; i<a.kaj.length; i++){
      if (this.kaj[i]==a.kaj[i]){
      }
      else{
        b= false; 
        break; 
      }
    }
    return b; 
  }
  
  public boolean isEmpty(){
    boolean b = true;
    if (kaj.length==0)
      return b;
    else
      b = false;
    return false; 
  }
  
  public MyString concat(MyString a){
    MyString concat = new MyString(this.toString());
    char []kaj3 = new char[a.kaj.length+this.kaj.length];
    for (int i=0; i<this.kaj.length; i++){
      kaj3[i]=this.kaj[i];
    }
    for (int i=0; i<a.kaj.length; i++){
      kaj3[i+this.kaj.length]=a.kaj[i]; //ekhane -1 nai keno
    }
    concat.kaj = kaj3;
    return concat;
  }
  
  public int lastIndexOf(char a){
    int b=0;
    for(int i=0; i<kaj.length; i++){
      if (kaj[i] == a){
        b=i;
      }
    }
    if (b==0)
      return -1;
    else
      return b;
  }
  
  public int indexOf(char a){
    int b=0;
    for (int i=0; i<kaj.length; i++){
      if (kaj[i]==a){
        b=i;
        break;
      }
    }
    if (b==0)
      return -1;
    else
      return b;
  }
  
  public int indexOf(char a, int c){
    int b=0;
    if (c<0)
      c=0;
    for (int i=c; i<kaj.length; i++){
      if (kaj[i]==a){
        b=i;
        break;
      }
    }
    if (b==0)
      return -1;
    else
      return b;
  }
  
  public int lastIndexOf(char a, int c){
    int b=0;
    if (c>=kaj.length)
      c=kaj.length-1;
    for(int i=0; i<=c; i++){
      if (kaj[i] == a){
        b=i;
      }
    }
    if (b==0)
      return -1;
    else
      return b;
  }
  
  public MyString substring(int a){
    MyString substring = new MyString(this.toString());
    char kaj2[] = new char[this.kaj.length-a];//char kaj
    int j=0;
    for (int i=a; i<=kaj.length-1; i++){
      kaj2[j] = this.kaj[i];
      j++;
    }
    substring.kaj = kaj2;
    return substring;
  }
  
  public MyString substring(int a, int b){
    MyString substring = new MyString(this.toString());
    char kaj2[] = new char[this.kaj.length-a+b];//char kaj
    int j=0;
    for (int i=a; i<=b-1; i++){ //b-1 ken
      kaj2[j] = this.kaj[i];
      j++;
    }
    substring.kaj = kaj2;
    return substring;
  }
  
  public MyString toLowerCase(){
    MyString low = new MyString(this.toString());
    char lowC[] = new char[this.kaj.length];
    int z = 0;
    for (int i=0; i<=this.kaj.length-1; i++){
      if ((int)this.kaj[i]<97){
        z = (int)this.kaj[i]+32;
        lowC[i] = (char)z;
      }
      else
        lowC[i] = this.kaj[i];
    }
    low.kaj = lowC;
    return low;
  }
  
  public MyString toUpperCase(){
    MyString up = new MyString(this.toString());
    char upC[] = new char[this.kaj.length];
    int z = 0;
    for (int i=0; i<=this.kaj.length-1; i++){
      if ((int)this.kaj[i]>96){
        z = (int)this.kaj[i]-32;
        upC[i] = (char)z;
      }
      else
        upC[i] = this.kaj[i];
    }
    up.kaj = upC;
    return up;
  }
  
  
  public boolean equals(MyString a){
    boolean b = true;
    if (this.kaj.length==a.kaj.length){
      for(int i=0; i<kaj.length; i++){
        if (this.kaj[i]==a.kaj[i]){
        }
        else{
          b=false; 
          break; 
        }
      }
    }
    else  
      b=false;
    return b;
  }
  
  public boolean equalsIgnoreCase(MyString a){
    boolean b = true;
    if (this.kaj.length==a.kaj.length){
      for(int i=0; i<kaj.length; i++){
        if ((this.kaj[i]==a.kaj[i]) || ((int)this.kaj[i]+32==(int)a.kaj[i]) || ((int)this.kaj[i]-32==(int)a.kaj[i])){
        }
        else{
          b=false; 
          break; 
        }
      }
    }
    else  
      b=false;
    return b;
  }
  
  public boolean contains(char[] a){
    boolean b = true;
    int k = 0;
    for(int j=0; j<this.kaj.length-a.length+1; j++){
      for(int i=j; i<a.length; i++){
        if (this.kaj[i]==a[k]){
          k++;
        }
        if (k==a.length-1)
          break;
      }
      if (k==a.length-1)
        break;
    }
    return b;
  }
  
  
  public String toString(){
    String x = "";
    for (int i=0; i<kaj.length; i++){
      x = x + kaj[i];
    }
    return x;
  }
  
  
}

