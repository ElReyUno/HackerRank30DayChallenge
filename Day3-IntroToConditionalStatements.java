import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

// BufferedReader is synchronous while Scanner is not. BufferedReader should be used if we are working with multiple threads. 
// BufferedReader has significantly larger buffer memory than Scanner. The Scanner has a little buffer (1KB char buffer) as 
// opposed to the BufferedReader (8KB byte buffer), but it's more than enough.
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        // If n is odd || n is even and in the inclusive range of 6 to 20 print Weird
        if((N % 2 != 0) || ((N % 2 == 0) && (N >= 6 && N <= 20)))
        {
            System.out.println("Weird");
        }
        // If n is even and in the inclusive range of 2 to 5 || or is even and greater than 20 print Not Weird
        else if(((N % 2 == 0) && (N >=2 && N <= 5)) || ((N % 2 == 0) && (N >= 20)))
        {
            System.out.println("Not Weird");
        }
    }
}
