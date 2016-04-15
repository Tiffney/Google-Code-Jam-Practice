/**
 * Created by Tiffney on 4/15/2016.
 * Correct for small submission.
 * Correct for large submission.
 */
import java.util.*;
import java.io.*;
import java.util.Collections;

public class QRAAfrica2010StoreCredit {
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(new File("C:\\Users\\Tiffney\\Documents\\GitHub\\Google-Code-Jam-Practice\\in\\A-large-practice (1).in"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int tests = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.

        for (int i = 1; i <= tests; i++) {
            int credit = in.nextInt();
            int items = in.nextInt();

            List prices = new ArrayList();

            for (int j = 0; j < items; j++) {
                prices.add(in.nextInt());
            }

            List result = match(credit, prices);

            System.out.println("Case #" + i + ": " + result.get(0) + " " + result.get(1));
        }
    }

    public static List match(int credit, List prices) {
        int length = prices.size();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int price = (int) prices.get(i);
                if (price + (int) prices.get(j) == credit)
                    return Arrays.asList(i + 1, j + 1);
            }
        }
        return null;
    }
}