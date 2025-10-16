package nengboonchai.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 {
    public static void main(String[] args) {
        // https://www.javatpoint.com/java-regex
//        Pattern p = Pattern.compile(".s");
//        String text = "as";
//        Matcher m = p.matcher(text);
//        boolean result = m.matches();
//        System.out.println(result);
//
//        //2nd way
//        boolean b2=Pattern.compile(".s").matcher("as").matches();
//
//        //3rd way
//        boolean b3 = Pattern.matches(".s", "as");
//        System.out.println(b3);
            //  . = any character
//        System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)
//        System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)
//        System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)
//        System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)
//        System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)
//
//        System.out.println(Pattern.matches(
//                "geeks.*", "geeksforgeeks"));
//
//        // Regex Character classes , just one character
//        System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)
//        System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)
//        System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)

        //Regex Quantifiers
        System.out.println("? quantifier ....");
        System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)
        System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)
        System.out.println(Pattern.matches("[amn]?", "am"));//true (a or m or n must come one time)

        System.out.println("+ quantifier ....");
        System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)
        System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)
        System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)
        System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)

        System.out.println("* quantifier ....");
        System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)

        System.out.println(Pattern.matches("java","this is java, do you know java"));

    }
}
