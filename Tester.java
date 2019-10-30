import java.util.Scanner;

public class Tester{ 
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String");
    String a = sc.nextLine();
    MyString string = new MyString(a);
    MyString string2 = new MyString("duck");
    
    
    System.out.println(string.length());
    System.out.println(string.startsWith(string2));
    System.out.println(string.charAt(1));
  }
}