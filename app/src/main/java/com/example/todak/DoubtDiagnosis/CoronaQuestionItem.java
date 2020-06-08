package com.example.todak.DoubtDiagnosis;

public class CoronaQuestionItem {

    //리스트뷰 아이템의 기본값 설정
    private String QuestionNum= null;
    private String Question = null;
    private boolean selected = false;

    public CoronaQuestionItem(String Qnum, String Q, boolean select)
    {
        QuestionNum = Qnum;
        Question = Q;
        selected = select;
    }


    public void SetQuestionNum(int position)
    {
        QuestionNum = Integer.toString(position);
    }

    public void setQuestion(String text)
    {
        Question = text;
    }

    public void setSelected(boolean select)
    {
        selected = select;
    }
    public boolean isSelected()
    {
        return selected;
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
