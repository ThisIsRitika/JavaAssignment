import java.io.*;
import java.util.*;

public class QuizApp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("questions.txt"));
        Scanner sc = new Scanner(System.in);

        String question;
        int score = 0;

        while ((question = br.readLine()) != null) {
            System.out.println(question);
            String correctAnswer = br.readLine();

            System.out.print("Your answer: ");
            String userAnswer = sc.nextLine();

            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                score++;
            }
        }
        System.out.println("Your score: " + score);
        br.close();
    }
}
