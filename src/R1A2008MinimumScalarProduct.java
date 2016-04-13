/**
 * Created by Tiffney on 4/9/2016.
 */
import java.util.*;
import java.io.*;
import java.util.Collections;

public class R1A2008MinimumScalarProduct {
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(new File("C:\\Users\\Tiffney\\Documents\\GitHub\\Google-Code-Jam-Practice\\in\\A-large-practice.in"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int tests = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.

        for (int i = 1; i <= tests; ++i) {
            int length = in.nextInt();
            List<Integer> vector1 = new ArrayList<>();
            List<Integer> vector2 = new ArrayList<>();

            for (int j = 0; j < length; j++) {
                vector1.add(in.nextInt());
            }

            for (int j = 0; j < length; j++) {
                vector2.add(in.nextInt());
            }

            System.out.println("Case #" + i + ": " + calculateMin(vector1, vector2));
        }
    }

    public static int calculateMin (List vector1, List vector2) {
        Collections.sort(vector1);
        Collections.sort(vector2);

        int result = 0;
        int length = vector1.size();

        for (int i = 0; i < length; i++) {
            result += (int) vector1.get(i) * (int) vector2.get(length - i - 1);
        }

        return result;
    }
}