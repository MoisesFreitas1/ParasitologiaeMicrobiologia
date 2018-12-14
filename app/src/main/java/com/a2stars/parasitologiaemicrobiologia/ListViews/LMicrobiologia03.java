package com.a2stars.parasitologiaemicrobiologia.ListViews;

import com.a2stars.parasitologiaemicrobiologia.Models.Question;
import com.a2stars.parasitologiaemicrobiologia.R;

import java.util.ArrayList;
import java.util.List;

public class LMicrobiologia03 {
        private static List<Question> lquestion = new ArrayList<>();

        public static List<Question> getLquestion() {
            if (lquestion.isEmpty()) {
                Question question = new Question();
                question.setId(1L);
                question.setTema("Microbiologia");
                question.setEnunciado("Sobre a infecção por HIV/AIDS, há um acometimento do sistema imune, preferencialmente aos linfócitos CD4+. Marque a errada:");
                question.setEnunciado2("");
                question.setA("Uma vez confirmada infecção por HIV em teste imunocromatográfico e em teste sorológico, inicia-se TARV, independente do estado clínico do paciente em questão.");
                question.setB("O ELISA é um método de alta sensibilidade e especificidade, sendo o padrão-ouro da análise confirmatória de infecção por HIV.");
                question.setC("Na infecção aguda, por meio de exames laboratoriais se é possível identificar carga viral e anticorpos anti-HIV.");
                question.setD("Mães portadoras de HIV/AIDS em baixa carga viral podem ter parto vaginal, a depender da indicação do obstetra, porém, contraindica-se fortemente a amamentação.");
                question.setFoto(R.drawable.transparent);
                question.setGabarito(R.id.c);
                lquestion.add(question);

                question = new Question();
                question.setId(2L);
                question.setTema("Microbiologia");
                question.setEnunciado("Sobre o Vírus da Imunodeficiência Humana (HIV), pode-se afirmar que:");
                question.setEnunciado2("");
                question.setA("O HIV está presente sob dois sorotipos, o HIV-1 e o HIV-2, que são igualmente prevalentes mundialmente.");
                question.setB("O HIV é um vírus de RNA – retrovírus –, que tem em sua estrutura envelope viral, responsável pela ligação ao sítio de ligação.");
                question.setC("Tem como fatores de risco biológicos a concentração viral do HIV no fluido, a integridade da mucosa, o tempo de exposição e o sorotipo viral.");
                question.setD("Tem como fatores de risco comportamentais a múltipla parceria sexual, a atividade sexual desprotegida, o uso de drogas EV, bem como, os grupos sociais de risco.");
                question.setFoto(R.drawable.transparent);
                question.setGabarito(R.id.c);
                lquestion.add(question);

                question = new Question();
                question.setId(3L);
                question.setTema("Microbiologia");
                question.setEnunciado("A Síndrome da Imunodeficiência Adquirida (AIDS) tem manifestações clínicas fase-dependentes, sendo divididas em infecção aguda, crônica assintomática e crônica sintomática. Marque a alternativa incorreta:");
                question.setEnunciado2("");
                question.setA("O quadro clínico característico da infecção aguda é a confluência de sintomas inespecíficos, similar a um quadro gripal.");
                question.setB("Na clínica crônica assintomática há um acontecimento chamado “janela imunológica”, caracterizado como o período de produção de anticorpos anti-HIV.");
                question.setC("Na clínica crônica sintomática há um aumento de linfócitos e uma redução da viremia.");
                question.setD("A fase virêmica crônica sintomática é subdividida didaticamente em inicial, intermediária e tardia, tendo a contagem de linfócitos como parâmetro.");
                question.setFoto(R.drawable.transparent);
                question.setGabarito(R.id.c);
                lquestion.add(question);
            }
            return lquestion;
        }

        }