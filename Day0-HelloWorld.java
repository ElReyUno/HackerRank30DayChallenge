import java.io.*;
import java.util.*;

public class Solution {
  
  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scan = new Scanner(System.in); // use the Scanner class to read from stdin
    String inputString = scan.nextLine(); // read a line of input and save it to a variable
    scan.close(); // close the scanner
      
    // Your first line of output goes here
    System.out.println("Hello, World.");
      
    // Write the second line of output
    System.out.println(inputString);
  }
}