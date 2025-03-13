package lecture3;


import java.util.List;
import java.util.Scanner;

public class Quiz {

    void doQuiz(){
        List<Question> questions = List.of(new Question("should I indent source code with tabs or spaces?","tabs"),
                new Question("Which is the best collage?","mine")
                );
        //Initialize of scanner object to get input
        Scanner scanner = new Scanner(System.in);
        int correct = 0;

        for(Question question : questions) {
            question.ask();
            String response = scanner.nextLine();
            if (question.check(response)) {
                correct++;
            }
        }
        System.out.printf("Correct: %d%n", correct);




    }

    public static void main(String [] args){
        new Quiz().doQuiz();
    }
}
