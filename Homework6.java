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
            for (int i = 0; i < line.length(); i++) {
                String result = line.substring(i, i + 1);
                boolean isLetter = Character.isLetter(line.charAt(i));
                if (result.equalsIgnoreCase("a") || result.equalsIgnoreCase("e") || result.equalsIgnoreCase("i")
                        || result.equalsIgnoreCase("o") || result.equalsIgnoreCase("u")) {
                    vowelOne++;
                    vowelCount++;
                } else if (isLetter) {
                    consOne++;
                    consCount++;
                }
            }
            if (vowelOne > 1) {
            System.out.println(line + ": " + vowelOne + " vowels");
            } else {
                System.out.println(line + ": " + vowelOne + " vowel");
            }
            if (consOne > 1) {
            System.out.println(line + ": " + consOne + " consonants");
            } else {
                System.out.println(line + ": " + consOne + " consonant");
            }
            wordCount++;
            line = input.nextLine();
        }
        String wordsFinal = wordCount + " words";
        String vowelsFinal = vowelCount + " vowels";
        String consFinal = consCount + " consonants";
        System.out.println(wordsFinal);
        System.out.println(vowelsFinal);
        System.out.println(consFinal);
    }
}