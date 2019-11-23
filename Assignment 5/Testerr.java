import java.util.Scanner;

public class Testerr{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String");
    String a = sc.nextLine();
    MyString string = new MyString(a);
    MyString string2 = new MyString("duck");
    char z = (char)'a'+2; //why not work in method
    char[] x={'d','u'};
    
    System.out.println(string.length());
    System.out.println(string.startsWith(string2));
    System.out.println(string.charAt(1));
    System.out.println(string.isEmpty());
    System.out.println(string.concat(string2));
    System.out.println(string.lastIndexOf('a'));
    System.out.println(string.indexOf('a'));
    System.out.println(string.indexOf('a', 23));
    System.out.println(string.lastIndexOf('a', 23));
    System.out.println(string.substring(2));
    System.out.println(string.substring(1,3));
    System.out.println(string.toLowerCase());
    System.out.println(string.toUpperCase());
    System.out.println(string.equals(string2));
    System.out.println(string.equalsIgnoreCase(string2));
    System.out.println(string.contains(x));
    System.out.println(string.endsWith(string2));
    System.out.println(string.replaceAll('d','u'));
    System.out.println(string.replaceFirst('d','u'));
    System.out.println(string.replaceLast('d','u'));
    System.out.println(string.trim());
    System.out.println(string.compareTo(string2));
    System.out.println(string.compareToIgnoreCase(string2));
  }
}
