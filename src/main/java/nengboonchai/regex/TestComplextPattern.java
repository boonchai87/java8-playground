package nengboonchai.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestComplextPattern {
    public static void main(String[] args) {
        // Example 1: Matching a specific pattern
        System.out.println("Example 1: Matching a specific pattern");
        // Define the text in which to search
        String text1 = "The quick brown fox jumps over the lazy dog";
        // Define the pattern to match
        String pattern1 = "fox.*";
        // Check if the pattern matches the text using Pattern.matches()
        boolean matches1 = Pattern.matches(pattern1, text1);
        // Output whether the text contains the pattern
        System.out.println("Does the text contain the word 'fox'? " + matches1);

        // Example 2: Using Pattern and Matcher classes
        System.out.println("\nExample 2: Using Pattern and Matcher classes");
        // Define the text to search within
        String text2 = "Java is a programming language";
        // Define the regex pattern to match 3-letter words
        String regex2 = "\\b\\w{3}\\b";
        // Compile the regex pattern into a Pattern object
        Pattern pattern2 = Pattern.compile(regex2);
        // Create a Matcher object to apply the pattern on the text
        Matcher matcher2 = pattern2.matcher(text2);
        // Find and output all matches found by iterating over Matcher's results
        System.out.print("3-letter words in the text: ");
        while (matcher2.find()) {
            System.out.print(matcher2.group() + " ");
        }
        System.out.println();

        // Example 3: Replacing matched patterns
        System.out.println("\nExample 3: Replacing matched patterns");
        // Define the text in which to search
        String text3 = "The cat sat on the mat";
        // Define the regex pattern to match the word 'cat'
        String regex3 = "\\bcat\\b";
        // Define the replacement string
        String replacement3 = "dog";
        // Replace all occurrences of 'cat' with 'dog' using String's replaceAll()
        // method
        String replacedText3 = text3.replaceAll(regex3, replacement3);
        // Output the original and replaced text
        System.out.println("Original text: " + text3);
        System.out.println("Replaced text: " + replacedText3);
        // Example 4: Splitting text using regex
        System.out.println("\nExample 4: Splitting text using regex");
        // Define the text to split
        String text4 = "apple,banana,orange,grape";
        // Define the regex pattern for splitting by comma
        String regex4 = ",";
        // Split the text using the regex pattern into an array of strings
        String[] parts4 = text4.split(regex4);
        // Output the split parts
        System.out.print("Fruits separated: ");
        for (String part : parts4) {
            System.out.print(part + " ");
        }
        System.out.println();
        // Example 5: Validating email addresses
        System.out.println("\nExample 5: Validating email addresses");
        // Define an array of email addresses to validate
        String[] emails = { "user@example.com", "invalid.email.com", "another.user@domain.co" };
        // Define the regex pattern for validating email addresses
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        // Compile the regex pattern into a Pattern object
        Pattern emailPattern = Pattern.compile(emailRegex);
        // Validate each email address by matching against the regex pattern
        System.out.println("Validating email addresses:");
        for (String email : emails) {
            // Create a Matcher object for each email
            Matcher emailMatcher = emailPattern.matcher(email);
            // Output the result of validation
            System.out.println(email + ": " + emailMatcher.matches());
        }
        // Example 6: Extracting domain names from URLs
        System.out.println("\nExample 6: Extracting domain names from URLs");
        // Define a URL
        String url = "https://www.example.com";
        // Define the regex pattern for extracting domain names from URLs
        String domainRegex = "^(https?://)?(www\\.)?([a-zA-Z0-9-]+\\.[a-z]{2,})";
        // Compile the regex pattern into a Pattern object
        Pattern domainPattern = Pattern.compile(domainRegex);
        // Create a Matcher object for the URL
        Matcher domainMatcher = domainPattern.matcher(url);
        // Find the domain name by matching against the regex pattern and output it
        if (domainMatcher.find()) {
            System.out.println("Domain extracted from URL: " + domainMatcher.group(3));
        }
    }
}
