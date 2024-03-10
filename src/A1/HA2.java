/*Write a Java program that takes all the lines input to standard input and writes them to
standard output in reverse order. That is, each line is output in the correct order, but the
ordering of the lines is reversed.*/

package A1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class HA2 {
    public static void main(String[] args) {
      
    	
    	Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();

        // Read lines from standard input
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            lines.add(line);
        }

        // Reverse the order of lines
        Collections.reverse(lines);

        // Write lines to standard output in reverse order
        for (String line : lines) {
            System.out.println(line);
        }
    }
}

