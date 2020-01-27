package JavaApplication1;

public class CircularArray{
  
  private int start;
  private int size;
  private Object [] cir;
  
  /*
   * if Object [] lin = {10, 20, 30, 40, null}
   * then, CircularArray(lin, 2, 4) will generate
   * Object [] cir = {40, null, 10, 20, 30}
   */
  public CircularArray(Object [] lin, int st, int sz){
      size = sz;
      start = st;
      cir = new Object[lin.length];
      int k = st;
      for (int i=0; i<lin.length; i++){
          cir[k]=lin[i];
          k++;
          if(k==lin.length)
              k=0;
      }
  }
   
  
  //Prints from index --> 0 to cir.length-1
  public void printFullLinear(){
      for (int i=0; i<=cir.length-1; i++){
          System.out.print(cir[i] + " ");
    }
      System.out.println();
  }
        //TO DO
  
  
  // Starts Printing from index start. Prints a total of size elements
  public void printForward(){
    //To DO
  }
  
  
  public void printBackward(){
   //TO DO
  }
  
  // With no null cells
  public void linearize(){
    //TO DO
      Object newLin[] = new Object[size];
      int k = start;
      for (int i=0; i<=size-1; i++){
          newLin[i] = cir[k%cir.length];
          k++;
      }
      cir = newLin;
  }
  
  // Do not change the Start index
  public void resizeStartUnchanged(int newcapacity){
    //TO DO
     Object newLin[] = new Object[newcapacity];
     int k = start; 
     for (int i=0; i<=size-1; i++){
         newLin[k] = cir[k%cir.length];
         k++;
     }
     cir = newLin;
  }
  // Start index becomes zero
  public void resizeByLinearize(int newcapacity){
    //TO DO
     this.linearize();
     Object newLin[] = new Object[newcapacity];
     for (int i=0; i<this.cir.length; i++){
         newLin[i] = cir[i];
     }
     cir = newLin;
  }
  
  /* pos --> position relative to start. Valid range of pos--> 0 to size.
   * Increase array length by 3 if size==cir.length
   * use resizeStartUnchanged() for resizing.
   */
  public void insertByRightShift(Object elem, int pos){
    //TO DO
      if(size==cir.length){
        this.resizeStartUnchanged(this.size+3);
      }
      for(int 
  }
  
  public void insertByLeftShift(Object elem, int pos){
    //TO DO
  }
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByLeftShift(int pos){
    //TO DO
  }
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByRightShift(int pos){
    //TO DO
  }
  
  
  //This method will check whether the array is palindrome or not
  public void palindromeCheck(){
    //TO DO
  }
  
  
  //This method will sort the values by keeping the start unchanged
  public void sort(){
    //TO DO
  }
  
  //This method will check the given array across the base array and if they are equivalent interms of values return true, or else return false
  public boolean equivalent(CircularArray k){
    //TO DO
    return false; // Remove this line
  }
}