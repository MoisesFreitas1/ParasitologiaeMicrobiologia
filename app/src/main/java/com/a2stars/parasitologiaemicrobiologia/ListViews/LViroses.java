package com.a2stars.parasitologiaemicrobiologia.ListViews;

import com.a2stars.parasitologiaemicrobiologia.Models.Question;
import com.a2stars.parasitologiaemicrobiologia.R;

import java.util.ArrayList;
import java.util.List;

public class LViroses {
    private static List<Question> lquestion = new ArrayList<>();

    public static List<Question> getLquestion() {
        if (lquestion.isEmpty()) {
            Question question = new Question();
            question.setId(1L);
            question.setTema("Viroses");
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
            question.setId(2L);
            question.setTema("Viroses");
            question.setEnunciado("A Síndrome da Imunodeficiência Adquirida (AIDS) tem manifestações clínicas fase-dependentes, sendo divididas em infecção aguda, crônica assintomática e crônica sintomática. Marque a alternativa incorreta:");
            question.setEnunciado2("");
            question.setA("O quadro clínico característico da infecção aguda é a confluência de sintomas inespecíficos, similar a um quadro gripal.");
            question.setB("Na clínica crônica assintomática há um acontecimento chamado “janela imunológica”, caracterizado como o período de produção de anticorpos anti-HIV.");
            question.setC("Na clínica crônica sintomática há um aumento de linfócitos e uma redução da viremia.");
            question.setD("A fase virêmica crônica sintomática é subdividida didaticamente em inicial, intermediária e tardia, tendo a contagem de linfócitos como parâmetro.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(3L);
            question.setTema("Viroses");
            question.setEnunciado("O paciente com infecção por HIV/AIDS tem, por meio do Sistema Único de Saúde (SUS), apoio em amplas esferas. A se destacar, o atual tratamento para HIV/AIDS preconizado é a Terapia Antirretroviral (TARV) preferencialmente por Tenofovir, Lamivudina e Dolutegravir. Entretanto, algumas doenças podem se instalar devido à linfocitopenia grave. São exemplos de doenças bacterianas associadas à infecção prévia por HIV:");
            question.setEnunciado2("");
            question.setA("Leucoplasia oral pilosa, sífilis e tuberculose.");
            question.setB("Dermatofitoses, condilomas acuminados e angiomatose bacilar.");
            question.setC("Sífilis, tuberculose e angiomatose bacilar.");
            question.setD("Molusco contagioso, verrugas e piodermites.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(4L);
            question.setTema("Viroses");
            question.setEnunciado("O Papilomavírus Humano (HPV) é um vírus da família Papovaviridae que apresenta mais de 200 sorotipos conhecidos, sendo alguns com grande potencial oncogênico. Dessa forma, pode-se afirmar que:");
            question.setEnunciado2("");
            question.setA("O HPV é um vírus de DNA que apresenta grande hepatotropismo.");
            question.setB("Os sorotipos 6 e 11 têm grande potencial oncogênico.");
            question.setC("Os sorotipos 16 e 18 provocam as verrugas genitais.");
            question.setD("A vacinação é um meio eficaz de promover auxílio contra o câncer de colo de útero e o câncer de orofaringe.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.d);
            lquestion.add(question);

            question = new Question();
            question.setId(5L);
            question.setTema("Viroses");
            question.setEnunciado("Sobre a infecção por HPV, assinale a afirmativa correta:");
            question.setEnunciado2("");
            question.setA("A transmissão se dá normalmente por contato direto, ou seja, pela via sexual.");
            question.setB("São manifestações clínicas, as verrugas cutâneas, as lesões orais, o papiloma sublingual e as verrugas anogenitais.");
            question.setC("As lesões orais são assintomáticas e evoluem para malignidade.");
            question.setD("As verrugas cutâneas e anogenitais são ocasionadas pelos mesmos sorotipos do HPV.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.a);
            lquestion.add(question);

            question = new Question();
            question.setId(6L);
            question.setTema("Viroses");
            question.setEnunciado("Sobre os métodos preventivos contra o HPV, destacam-se o uso de preservativos e a vacinação. Sobre esses métodos, assinale a verdadeira.");
            question.setEnunciado2("");
            question.setA("O uso de camisinhas é dispensável após a administração vacinal.");
            question.setB("A vacinação é o meio mais seguro e eficaz contra as formas com potencial oncogênico do HPV, sendo esses, os sorotipos 6 e 18.");
            question.setC("A camisinha, método de barreira mais eficaz, deve ser usada mesmo que a outra parceria tenha HPV.");
            question.setD("A vacinação contra o HPV atualmente se dá em meninas de 9 a 15 anos, meninos de 12 a 13 anos, e, em pacientes imunocomprometidos de 9 a 26 anos.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(7L);
            question.setTema("Fundamentos de Enfermagem");
            question.setEnunciado("Sobre as hepatites virais, assinale a incorreta.");
            question.setEnunciado2("");
            question.setA("Atualmente, são conhecidos 5 tipos de hepatite classificadas de A a E, sendo 2 de transmissão oral-fecal e 3 por via hemática.");
            question.setB("Podem ocasionar sintomas inespecíficos, os quais, astenia, abdominalgia, vômito/tontura, febre e icterícia.");
            question.setC("Os subtipos A e E apresentam tratamento sintomático, enquanto, os subtipos B, C e D cronificam e são assintomáticos em sua maior parte.");
            question.setD("Todas as hepatites virais apresentam vacinação disponível.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.d);
            lquestion.add(question);

            question = new Question();
            question.setId(8L);
            question.setTema("Viroses");
            question.setEnunciado("Ainda sobre as hepatites, assinale a correta:");
            question.setEnunciado2("");
            question.setA("O HAV é um vírus envelopado, RNA fita simples, transmitido por via oral-fecal e podem apresentar sintomas como febre, cefalalgia, mal-estar generalizado e icterícia.");
            question.setB("O HBV é um vírus não envelopado, DNA fita dupla, sendo transmitido por via hemática, sexual e transplacentária, tem tendência à cronicidade – evolução para hepatocarcinoma.");
            question.setC("O HCV é um vírus envelopado, RNA fita simples, sendo transmitido por via hemática, sexual e transplacentária, tem tendência à cronicidade.");
            question.setD("O HDV é um vírus RNA fita dupla, tende a haver coinfecção HBV-HDV, sendo caracterizado por infecção aguda autorresoluta.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(9L);
            question.setTema("Viroses");
            question.setEnunciado("As viroses dermotrópicas são conhecidas por serem infecções virais com predileção aos sítios mucocutâneos, ou seja, vírus com restrição à superfície corpórea e/ou vírus de ataque sistêmicos com instalação na pele. Destacam-se os vírus da família Herpesviridae, os Herpes-Vírus Humano (HHV) com sorotipos de 1 a 7. Sobre as propriedades dos HHV, assinale a correta:");
            question.setEnunciado2("");
            question.setA("São vírus envelopados com genoma de DNA fita dupla, ubíquos e reproduzem-se por meio da DNA pol.");
            question.setB("HHV são vírus muito prevalente entre os humanos, tendo alta distribuição, patogenicidade e mortalidade.");
            question.setC("Os sorotipos conhecidos atualmente são subdivididos em relação à sua patogenia e ao sítio de infecção.");
            question.setD("São vírus envelopados com genoma de DNA fita dupla, ubíquos e reproduzem-se por meio da RNA pol.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.a);
            lquestion.add(question);

            question = new Question();
            question.setId(10L);
            question.setTema("Viroses");
            question.setEnunciado("O HHV-1 e o HHV-2 são subdivididos conjuntamente devido ao mesmo mecanismo patogênico, assim sendo, assinale a alternativa incorreta:");
            question.setEnunciado2("");
            question.setA("É uma virose orogenital transmitida por via sexual quando há o contato direto com lesões ou fômites.");
            question.setB("O sítio inicial de infecção são as células mucoepiteliais, causando inflamação local, e, após isso infectam latentemente o neurônio local, por meio de ciclo lisogênico.");
            question.setC("O DNA viral não está totalmente silenciado devido à ação do RNA LATs.");
            question.setD("O ciclo lítico faz com que os vírus fiquem em modo de latência, enquanto que o ciclo lisogênico faz com que os vírus se multipliquem e lisem a célula.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.d);
            lquestion.add(question);

            question = new Question();
            question.setId(11L);
            question.setTema("Viroses");
            question.setEnunciado("Sobre os herpes orogenital, assinale a correta:");
            question.setEnunciado2("");
            question.setA("O HHV-1 é responsável pela infecção latente dos Nn. Lombossacrais, já o HHV-2 é responsável pela infecção latente do N. Trigêmeo.");
            question.setB("A latência do vírus HHV ocorrida em resposta à reação imune é findada quando há imunocomprometimento ou situações de estresse pelo hospedeiro.");
            question.setC("Apresentam em primo-infecção clínica com lesões intermitentes vesiculosas eritematosas com ardência, algia local e prurido associados que evoluem com queixas de ulcerações exsudativas em sítio de infecção de hospedeiro imunocompetente.");
            question.setD("Em mulheres que apresentam cervicite por HHV-1, há risco de contaminação do neonato, que podem evoluir para óbito.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.b);
            lquestion.add(question);

            question = new Question();
            question.setId(12L);
            question.setTema("Viroses");
            question.setEnunciado("A varicela é resultante pela infecção do HHV-3, um vírus de RNA, altamente contagioso, de rápida evolução e caráter benigno. Sobre as doenças que esse patógeno pode causar, assinale a incorreta:");
            question.setEnunciado2("");
            question.setA("A varicela é caracterizada por lesões pruriginosas eritematosas de corpo inteiro que atingem a população pediátrica, não havendo vacina.");
            question.setB("No cobreiro, há um retorno da doença ocasionado pelo HHV-3, devido a um imunocomprometimento do hospedeiro, sendo caracterizado por lesões pruriginosas localizadas em tronco.");
            question.setC("Algumas complicações conhecidas são as infecções bacterianas secundárias, devido a produção de soluções de continuidade pela ação pruriginosa.");
            question.setD("A síndrome de Reye é uma complicação comum quando há contaminação por varicela vírus e há o uso de salicilatos para controle de febre e dor.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.a);
            lquestion.add(question);

            question = new Question();
            question.setId(13L);
            question.setTema("Viroses");
            question.setEnunciado("Sobre as viroses congênitas, assinale a correta:");
            question.setEnunciado2("");
            question.setA("O CMV é um vírus DNA fita simples, da família Herpesviridae, que quando transmitido verticalmente, pode ser fatal ao feto.");
            question.setB("A doença da inclusão citomegálica é uma virose ocasionada pelo CMV, caracterizada semiologicamente pelo sinal “olhos de coruja”.");
            question.setC("O Parvovírus B19 é o agente etiológico da “quinta doença”, caracterizada por eritema bolhoso, em gestantes, pode causar perda fetal por hidropsia (edema) fetal.");
            question.setD("A rubéola é um vírus envelopado de RNA fita simples, que quando presente em gestantes, os neonatos apresentam tríade clínica que consiste em cataratas, cardiopatias congênitas e surdez óssea.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.b);
            lquestion.add(question);

            question = new Question();
            question.setId(14L);
            question.setTema("Viroses");
            question.setEnunciado("Sobre as viroses multissistêmicas, assinale a incorreta:");
            question.setEnunciado2("");
            question.setA("O Sarampo é provocado por um vírus RNA fita simples, cuja vacina é disponibilizada pelo SUS, e, o Brasil até 2016 não apresentava nenhum surto dessa doença.");
            question.setB("O vírus do sarampo provoca uma doença cujo sinal patognomônico é o sinal de Koplik, sendo pequenas manchas hipocoradas com halo eritematoso.");
            question.setC("O vírus da caxumba é um vírus envelopado, RNA fita simples, cuja transmissão ocorre por meio de perdigotos, com período de incubação pequeno.");
            question.setD("A Caxumba ocasiona desconforto respiratório, cefalagia, mal-estar generalizado, anorexia, parotite e febre baixa.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.d);
            lquestion.add(question);
        }
        return lquestion;
    }
}