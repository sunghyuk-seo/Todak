package com.example.todak.DoubtDiagnosis;

public class ListViewItem {

    private String QuestionNum;
    private String Question;

    public void SetQuestionNum(int position)
    {
        QuestionNum = Integer.toString(position);
    }

    public void setQuestion(String text)
    {
        Question = text;
    }

    public String getQuestionNum()
    {
        return QuestionNum;

    }

    public String getQuestion()
    {
        return Question;
    }
}
