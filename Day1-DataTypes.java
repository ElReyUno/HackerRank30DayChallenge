import java.io.*;
import java.util.*;

public class Solution {
  
  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    // Declare 3 variables
    int i = 4;
    double d = 4.0;
    String s = "HackerRank ";
        
    // Scanner class reads from stdin
    Scanner scan = new Scanner(System.in);
        
    // Read a line of input, save it to a variable, and print scanned input
    int anInt = scan.nextInt();
    System.out.println(anInt + i);        
    double aDouble = scan.nextDouble();
    System.out.println(aDouble + d);
    // Read from Scanner's current location until the beginning of the next line
    scan.nextLine(); 
    String aString = scan.nextLine();
    System.out.printf(s + aString);
        
    // Close Scanner to avoid Resource Leak
    scan.close();
  }
}
