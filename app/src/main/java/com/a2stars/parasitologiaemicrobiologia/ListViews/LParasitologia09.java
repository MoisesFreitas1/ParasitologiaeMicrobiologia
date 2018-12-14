package com.a2stars.parasitologiaemicrobiologia.ListViews;

import com.a2stars.parasitologiaemicrobiologia.Models.Question;
import com.a2stars.parasitologiaemicrobiologia.R;

import java.util.ArrayList;
import java.util.List;

public class LParasitologia09 {

    private static List<Question> lquestion = new ArrayList<>();

    public static List<Question> getLquestion() {
        if (lquestion.isEmpty()) {
            Question question = new Question();
            question.setId(1L);
            question.setTema("Microbiologia");
            question.setEnunciado("A Classe Cestoda é composta por vermes chatos em forma de fita, tendo como principais membros os espécimes do gênero Taenia, sendo responsável por causar a teníase em humanos e em outros animais. Sobre a Taenia spp. e suas complicações, assinale o item correto:");
            question.setEnunciado2("");
            question.setA("Podendo ser causada pelas espécies T. solium e T. saginata, a Teníase é caracterizada pela ingesta de carne crua contendo oncosferas dos vermes.");
            question.setB("A Teníase tem como características clínicas, a abdominalgia, perda ponderal de peso, náuseas e astenia, constipação intermitente com evacuações semissólidas rotineiras, cefaleia, sendo em menor número pacientes assintomáticos.");
            question.setC("A Cisticercose é uma complicação exclusiva da T. solium, pois a ingesta de alimentos crus ou mal cozidos contendo cisticercos desse verme, pode expressar a doença em variados sítios, como os olhos, músculos e o cérebro.");
            question.setD("A Cisticercose cerebral é uma das complicações mais conhecidas da T. solium, pois causa síndrome epileptiforme focal, sendo tratada com Fenobarbital.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.d);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Microbiologia");
            question.setEnunciado("O complexo Teníase-Cisticercose é definido pelos ciclos evolutivos das tênias que provocam essas enfermidades nos animais. Sobre esse verme e o complexo patológico, marque a alternativa errada:");
            question.setEnunciado2("");
            question.setA("A fase adulta do verme admite somente uma espécie como hospedeiro definitivo, o homem, enquanto em sua forma intermediária, admite o porco como hospedeiro intermediário.");
            question.setB("A transmissão para o ambiente se dá por meio das evacuações de indivíduos previamente infestados e uma falha ou ausência de saneamento sanitário.");
            question.setC("A Cisticercose pode provocar deficiências visuais, ataques epilépticos e entre outros sintomas, já a Teníase pode provocar obstrução espacial de apêndice e ductos pancreático e biliar comum.");
            question.setD("Epidemiologicamente há falta de dados sobre prevalência de teníase, contudo, há uma baixa distribuição no país devido atribuição de boas condições de higiene adotadas.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.d);
            lquestion.add(question);

            question = new Question();
            question.setId(3L);
            question.setTema("Microbiologia");
            question.setEnunciado("Quanto ao diagnóstico do complexo de Teníase-Cisticercose, pode-se afirmar que:");
            question.setEnunciado2("");
            question.setA("O exame parasitológico de fezes (EPF) em 3 amostras é um meio diagnóstico para casos sintomáticos e assintomáticos de Cisticercose.");
            question.setB("A ausência de ovos de Taenia spp. no EPF excluem a possibilidade de infestação por esse verme.");
            question.setC("O diagnóstico de Neurocisticercose se dá por técnicas de imagem e técnicas imunológicas, a primeira buscando nódulos calcificados, e, a segunda, anticorpos em LCR.");
            question.setD("O diagnóstico de Cisticercose é iminentemente laboratorial.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.c);
            lquestion.add(question);
        }
        return lquestion;
    }

}
