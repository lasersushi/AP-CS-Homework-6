// Lucas Walker
// AT CS
// Homework #6

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        int vowelCount = 0;
        int wordCount = 0;
        int consCount = 0;
        int vowelOne = 0;
        int consOne = 0;
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        while (line.length() > 0) {
            vowelOne = 0;
            consOne = 0; // Reset loop counts
            for (int i = 0; i < line.length(); i++) {
                String result = line.substring(i, i + 1);
                boolean isLetter = Character.isLetter(line.charAt(i)); // Checks if character is a letter, if not than
                                                                       // ignored by code
                if (result.equalsIgnoreCase("a") || result.equalsIgnoreCase("e") || result.equalsIgnoreCase("i")
                        || result.equalsIgnoreCase("o") || result.equalsIgnoreCase("u")) {
                    vowelOne++;
                    vowelCount++;
                } else if (isLetter) {
                    consOne++;
                    consCount++;
                }
            }
            if (vowelOne > 1 && vowelOne != 0) {
                System.out.println(line + ": " + vowelOne + " vowels");
            } else {
                System.out.println(line + ": " + vowelOne + " vowel");
            }
            if (consOne > 1 && consOne != 0) {
                System.out.println(line + ": " + consOne + " consonants");
            } else {
                System.out.println(line + ": " + consOne + " consonant");
            }
            // Above if and else statments handle plurals
            wordCount++;
            line = input.nextLine(); // Goes to next line of loop
        }
        // Print totals with correct pluralization
        System.out.println(pluralize(wordCount, "word"));
        System.out.println(pluralize(vowelCount, "vowel"));
        System.out.println(pluralize(consCount, "consonant"));
    }

    public static String pluralize(int count, String word) {
        if (count == 1) {
            return count + " " + word;
        } else {
            return count + " " + word + "s";
        }
    }
}