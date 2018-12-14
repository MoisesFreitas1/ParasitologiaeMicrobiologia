package com.a2stars.parasitologiaemicrobiologia.ListViews;

import com.a2stars.parasitologiaemicrobiologia.Models.Question;
import com.a2stars.parasitologiaemicrobiologia.R;

import java.util.ArrayList;
import java.util.List;

public class LMicrobiologia07 {
    private static List<Question> lquestion = new ArrayList<>();

    public static List<Question> getLquestion() {
        if (lquestion.isEmpty()) {
            Question question = new Question();
            question.setId(1L);
            question.setTema("Microbiologia");
            question.setEnunciado("Sobre as micoses superficiais estritas, marque a alternativa correta:");
            question.setEnunciado2("");
            question.setA("São micoses que atacam a camada mais externa da derme, o estrato queratínico, bem como, a cutícula do pelo.");
            question.setB("Apresentam resposta imune franca, porém o hospedeiro é assintomático.");
            question.setC("Em indivíduos imunocomprometidos, as micoses superficiais estritas podem evoluir para outras camadas da pele, mas não ultrapassa a camada basal.");
            question.setD("As doenças mais comuns são o “pano branco”, a piedra branca e preta, e, a paracoccidiodomicose.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.a);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Microbiologia");
            question.setEnunciado("A Pitiríase versicolor é uma micose estrita à camada córnea dérmica sendo causada pelo fungo do gênero Malassezia spp. Sobre a micose dita, assinale a afirmativa incorreta:");
            question.setEnunciado2("");
            question.setA("A pitiríase versicolor também chamada de “dematomicose furfurácea”, com clínica de máculas hipo/hiperpigmentadas, assimétricas em tronco, pescoço e face.");
            question.setB("É uma micose ubíqua, mais prevalente no sexo masculino e em adultos brancos de zona de elevada incidência solar.");
            question.setC("O diagnóstico é predominantemente clínico com presença dos sinais de Besnier e de Zileri, bem como, fluorescência verde-amarelada ao uso da lâmpada de Wood.");
            question.setD("O diagnóstico rápido também pode ser feito laboratorialmente sob coleta em KOH e cultura em Ágar Sabouraud.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.d);
            lquestion.add(question);

            question = new Question();
            question.setId(3L);
            question.setTema("Microbiologia");
            question.setEnunciado("A Piedra preta tem como agente etiológico o ascomiceto Piedraia hortae, que causa tal enfermidade nos pelos, podendo ser chamada também de “Tricomicose nodosa escura” ou “Tricomicose dos estudantes”. Sobre essa micose, marque a alternativa correta:");
            question.setEnunciado2("");
            question.setA("Há envolvimento patológico do folículo piloso, que cursa com alopecia bem delimitada ao campo de acometimento fúngico.");
            question.setB("A clínica dessa enfermidade é o aparecimento de nódulos escuros e endurecidos aderidos aos cabelos e outro pelos.");
            question.setC("Tem alto poder de contágio, assintomático, crônico e recidivante, sendo mais frequente em indivíduos do sexo masculino.");
            question.setD("O diagnóstico laboratorial pode ser feito pela coleta e exame direto com KOH 20% - com presença de hifas dermáceas – e coleta e exame cultural em Ágar Sangue – com presença de colônia preta ou verde escura com elevação central.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.b);
            lquestion.add(question);
        }
        return lquestion;
    }

}