public class Puzzle {

    private String prompt;
    private String solution;

    public Puzzle(String prompt, String solution) {
        this.prompt = prompt;
        this.solution = solution;
    }

    public boolean solve(String answer) {
        return answer.equalsIgnoreCase(solution);
    }

    public String getPrompt() {
        return prompt;
    }
}
