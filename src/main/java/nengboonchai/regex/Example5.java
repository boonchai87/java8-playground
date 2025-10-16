package nengboonchai.regex;

import java.util.regex.Pattern;

public class Example5 {
    public static void main(String[] args) {
        // Following line prints "true" because the whole
        // text "geeksforgeeks" matches pattern
        // "geeks.*"
        System.out.println(Pattern.matches(
                "geeks.*", "geeksforgeeks"));// true

        // Following line prints "false" because the whole
        // text "geeks12s" doesn't match pattern "geeks[0-9]+"
        System.out.println(
                Pattern.matches("geeks[0-9]+", "geeks12s"));// false


        // Checks if the string matches with the regex
        // Should be single character a to z
        System.out.println(Pattern.matches("[a-z]",
                "g"));// true

        // Check if the element is range a to z or A to Z
        System.out.println(Pattern.matches("[a-zA-Z]",
                "Gfg"));// false

        // Checking all the strings using regex
        System.out.println("[b-z]?" +Pattern.matches("[b-z]?",
                ""));// false

        // Check if all the elements are in range a to z
        // or A to Z
        System.out.println("[a-zA-Z]+"+Pattern.matches("[a-zA-Z]+",
                "GfgTestCase"));// true

        // Check if elements is not in range a to z
        System.out.println("[^a-z]?"+Pattern.matches("[^a-z]?",
                "g"));// false

        // Check if all the elements are either g,e,k or s
        System.out.println("[geks]*"+Pattern.matches("[geks]*",
                "geeksgeeks"));// true


        // Check if all elements are numbers
        System.out.println(Pattern.matches("\\d+", "1234"));// true

        // Check if all elements are non-numbers
        System.out.println(Pattern.matches("\\D+", "1234"));// false

        // Check if all the elements are non-numbers
        System.out.println(Pattern.matches("\\D+", "Gfg"));// true

        // Check if all the elements are non-spaces
        System.out.println(Pattern.matches("\\S+", "gfg"));// true

        // x? = ไม่มี หรือ มี 1 ตัว
        // x+ อย่างน้อย 1 ตัวขึ้นไป
        // x* ไม่่มี หรือ มีไม่่จำกัด
    }
}
