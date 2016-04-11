/**
 * Created by Tiffney on 4/10/2016.
 */
import java.util.*;
import java.io.*;
public class QRAMinimumScalarProduct {
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(new File("C:\\Users\\Tiffney\\IdeaProjects\\Google Code Jam 2016\\src\\A-large.in"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int tests = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.

        for (int i = 1; i <= tests; ++i) {
            int number = in.nextInt();

            System.out.println("Case #" + i + ": ");
        }
    }
}