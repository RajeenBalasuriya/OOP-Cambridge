package lecture3;

public class Question {
    //private variables for state
    private final String prompt;
    private final String solution;

    //constructor for the class
    public Question(String prompt, String solution) {
        this.prompt = prompt;
        this.solution = solution;

    }

    public void ask(){
        System.out.println(prompt);
    }

    public boolean check(String answer){
        return this.solution.equals(answer);
    }
}
