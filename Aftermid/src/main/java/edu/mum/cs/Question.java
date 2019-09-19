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

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean checkAnswer(String answer){
        System.out.println(answer);
        if(answer == null){
            System.out.println(this.answer.equals(answer));
        }
        return this.answer.equals(answer);
    }
}
