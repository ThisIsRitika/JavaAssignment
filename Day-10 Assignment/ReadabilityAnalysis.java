    import java.util.Scanner;

public class ReadabilityAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        
        int characters = countCharacters(text);
        int sentences = countSentences(text);
        int words = countWords(text);
        int syllables = countSyllables(text);

        double readabilityScore = 206.835 - (1.015 * ((double) words / sentences)) - (84.6 * ((double) syllables / words));
        String category;

        if (readabilityScore >= 90) {
            category = "Very Easy";
        } else if (readabilityScore >= 80) {
            category = "Easy";
        } else if (readabilityScore >= 70) {
            category = "Fairly Easy";
        } else if (readabilityScore >= 60) {
            category = "Standard";
        } else if (readabilityScore >= 50) {
            category = "Fairly Difficult";
        } else if (readabilityScore >= 30) {
            category = "Difficult";
        } else {
            category = "Very Confusing";
        }

        System.out.println("\n--- Readability Analysis ---");
        System.out.println("Total Characters: " + characters);
        System.out.println("Total Words: " + words);
        System.out.println("Total Sentences: " + sentences);
        System.out.println("Total Syllables: " + syllables);
        System.out.println("Readability Score: " + readabilityScore);
        System.out.println("Readability Level: " + category);
    }

    public static int countCharacters(String text) {
        return text.replaceAll("\\s+", "").length();
    }

    public static int countWords(String text) {
        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    public static int countSentences(String text) {
        String[] sentences = text.split("[.!?]+\s*");
        return sentences.length;
    }

    public static int countSyllables(String text) {
        String[] words = text.split("\\s+");
        int syllableCount = 0;
        String vowels = "aeiouyAEIOUY";

        for (String word : words) {
            int count = 0;
            word = word.toLowerCase().replaceAll("[^a-z]", "");

            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (vowels.indexOf(c) != -1) {
                    if (i == 0 || vowels.indexOf(word.charAt(i - 1)) == -1) {
                        count++;
                    }
                }
            }

            if (word.endsWith("e") && count > 1) {
                count--;
            }

            syllableCount += Math.max(count, 1);
        }
        return syllableCount;
    }
}
