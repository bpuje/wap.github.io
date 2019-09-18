package edu.mum.cs;

public class Question {
    private String questions;
    private String answer;

    public Question(String questions, String answer) {
        this.questions = questions;
        this.answer = answer;
    }

    public String getQuestions() {
        return questions;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean checkAnswer(String answer){
        return this.answer.equals(answer);
    }
}
