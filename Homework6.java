// Lucas Walker
// AT CS
// Homework #6

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        int vowelCount = 0;
        int wordCount = 0;
        int consCount = 0;
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        while (line.length() > 0) {
            int vowelOne = 0;
            int consOne = 0;
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
            System.out.println(line + ": " + vowelOne + " vowels");
            System.out.println(line + ": " + consOne + " consonants");
            wordCount++;
            line = input.nextLine();
        }
        System.out.println(vowelCount);
        System.out.println(wordCount);
        System.out.println(consCount);
    }
}