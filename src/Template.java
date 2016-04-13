/**
 * Created by Tiffney on 4/9/2016.
 */
import java.util.*;
import java.io.*;
import java.util.Collections;

public class Template {
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(new File("C:\\Users\\Tiffney\\Documents\\GitHub\\Google-Code-Jam-Practice\\in\\R1A2008"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int tests = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.

        for (int i = 1; i <= tests; ++i) {
            int number = in.nextInt();
            if (number == 0) {
                System.out.println("Case #" + i + ": ");
                continue;
            }

            System.out.println("Case #" + i + ": ");
        }
    }
}