package com.a2stars.parasitologiaemicrobiologia.ListViews;

import com.a2stars.parasitologiaemicrobiologia.Models.Question;
import com.a2stars.parasitologiaemicrobiologia.R;

import java.util.ArrayList;
import java.util.List;

public class LVoid {
    private static List<Question> lquestion = new ArrayList<>();

    public static List<Question> getLquestion() {
        if (lquestion.isEmpty()) {
            Question question = new Question();
            question.setId(1L);
            question.setTema("");
            question.setEnunciado("");
            question.setEnunciado2("");
            question.setA("");
            question.setB("");
            question.setC("");
            question.setD("");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("");
            question.setEnunciado("");
            question.setEnunciado2("");
            question.setA("");
            question.setB("");
            question.setC("");
            question.setD("");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.c);
            lquestion.add(question);
        }
        return lquestion;
    }

}