import java.io.*;
import java.net.URLEncoder;

public class EncoderTest {
    public static void main(String[] args) {
        try {

            System.out.println(URLEncoder.encode("This string has spaces", "UTF-8"));
            System.out.println(URLEncoder.encode("This*string*has*asrersiks", "UTF-8"));
            System.out.println(URLEncoder.encode("This%string%has%percents%signs", "UTF-8"));
            System.out.println(URLEncoder.encode("This+string+has+pluses", "UTF-8"));
            System.out.println(URLEncoder.encode("This/string/has/slashes", "UTF-8"));
            System.out.println(URLEncoder.encode("This\"string\"has\"quote\"marks", "UTF-8"));
            System.out.println(URLEncoder.encode("This: string: has: colons", "UTF-8"));
            System.out.println(URLEncoder.encode("This~string~ has~tildes", "UTF-8"));
            System.out.println(URLEncoder.encode("This (string)has(parenthesis)", "UTF-8"));
            System.out.println(URLEncoder.encode("This.string.has.periods", "UTF-8"));
            System.out.println(URLEncoder.encode("Thiséstringéhasénon non-ASCII characters", "UTF-8"));

        } catch (UnsupportedEncodingException ex) {
            throw new RuntimeException("Broken VM doesnot support UTF-8");
        }

    }
}
