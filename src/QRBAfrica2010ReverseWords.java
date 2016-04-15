/**
 * Created by Tiffney on 4/9/2016.
 * Correct for small submission.
 * Correct for large submission.
 */
import java.util.*;
import java.io.*;
import java.util.Collections;

public class QRBAfrica2010ReverseWords {
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(new File("C:\\Users\\Tiffney\\Documents\\GitHub\\Google-Code-Jam-Practice\\in\\B-large-practice.in"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int tests = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        String blank = in.nextLine();
        for (int i = 1; i <= tests; ++i) {
            String words = in.nextLine();
            System.out.println("Case #" + i + ": " + reverse(words));
        }
    }

    private static String reverse(String str) {
        char charArray[] = str.toCharArray();
        for (int i = 0; i <str.length(); i++){
            if(charArray[i] == ' ')
                return reverse(str.substring(i + 1)) + str.substring(0, i) + " ";
        }

        return str + " ";
    }
}