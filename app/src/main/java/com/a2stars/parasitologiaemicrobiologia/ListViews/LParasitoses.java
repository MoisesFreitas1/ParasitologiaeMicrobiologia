package com.a2stars.parasitologiaemicrobiologia.ListViews;

import com.a2stars.parasitologiaemicrobiologia.Models.Question;
import com.a2stars.parasitologiaemicrobiologia.R;

import java.util.ArrayList;
import java.util.List;

public class LParasitoses {
    private static List<Question> lquestion = new ArrayList<>();

    public static List<Question> getLquestion() {
        if (lquestion.isEmpty()) {
            Question question = new Question();
            question.setId(1L);
            question.setTema("Parasitoses");
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
            question.setTema("Parasitoses");
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
            question.setTema("Parasitoses");
            question.setEnunciado("Sobre a patogenia e patologia da Cisticercose, assinale a incorreta:");
            question.setEnunciado2("");
            question.setA("A sequência clínica de acontecimentos na Neurocisticercose faz com que haja a morte do cisto devido às citocinas inflamatórias e eosinófilos no tecido cerebral, havendo por fim, inflamação e calcificação.");
            question.setB("No músculo cardíaco, pode provocar palpitações, ruídos anormais à ausculta e dispneias, já, quando instalados nos olhos, pode causar deslocamento ou perfuração da retina, reações inflamatórias com opacificação do humor vítreo, culminando em perda de visão.");
            question.setC("Quando em instalação muscular ou subcutânea pode provocar algia, fadiga/astenia e câimbras, podendo, chegar a comprometimento total da musculatura com inatividade muscular.");
            question.setD("Quando em tecido cerebral, as manifestações clínicas dependem de localização, estágio da doença, quantidade, estado clínico, virulência da cepa parasitária e grau de resposta imune ao cisticerco.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(4L);
            question.setTema("Parasitoses");
            question.setEnunciado("Quanto ao diagnóstico do complexo de Teníase-Cisticercose, pode-se afirmar que:");
            question.setEnunciado2("");
            question.setA("O exame parasitológico de fezes (EPF) em 3 amostras é um meio diagnóstico para casos sintomáticos e assintomáticos de Cisticercose.");
            question.setB("A ausência de ovos de Taenia spp. no EPF excluem a possibilidade de infestação por esse verme.");
            question.setC("O diagnóstico de Neurocisticercose se dá por técnicas de imagem e técnicas imunológicas, a primeira buscando nódulos calcificados, e, a segunda, anticorpos em LCR.");
            question.setD("O diagnóstico de Cisticercose é iminentemente laboratorial.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(5L);
            question.setTema("Parasitoses");
            question.setEnunciado("Sobre a Equinococose e a Hidatose, zoonoses classificadas como verminoses que podem ser transmitidas aos seres humanos. Sobre essas doenças, pode-se considerar a alternativa errada:");
            question.setEnunciado2("");
            question.setA("A Equinococose é causada por um platelminto da classe Cestodea, o Echinococcus spp., que tem como hospedeiro definitivo o homem, e hospedeiro intermediário o cão.");
            question.setB("Quando há a infestação por Echinococcus spp. há, no homem, a formação de cistos hidáticos no pulmão e no fígado que podem romper causando anafilaxia, evoluindo para óbito.");
            question.setC("A Hidatose é ocasionada pelo verme Taenia hydatigena que tem como hospedeiro definitivo os cães, podendo infestar o homem, podendo causar hepatite cisticercosa.");
            question.setD("Há uma diferenciação do sítio infeccioso dos cisticercos das tênias, sendo a T. multiceps o cérebro, e, a T. hydatigena o fígado.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.a);
            lquestion.add(question);

            question = new Question();
            question.setId(6L);
            question.setTema("Parasitoses");
            question.setEnunciado("Sobre a Hymenopelis nana, podem ser consideradas as afirmativas a seguir. Marque a incorreta:");
            question.setEnunciado2("");
            question.setA("Nessa espécie de tênia, o hospedeiro intermediário é o rato, e, o hospedeiro definitivo é o homem.");
            question.setB("É uma tênia menor e mais comum em homens, tendo como outros hospedeiros, roedores e aves.");
            question.setC("A transmissão pode ocorrer por meio da ingesta de ovos ou por meio da ingesta da pulga do rato.");
            question.setD("O tipo de infestação autóloga é a mais comum, provocando infestações recorrentes.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.a);
            lquestion.add(question);

            question = new Question();
            question.setId(7L);
            question.setTema("Parasitoses");
            question.setEnunciado("A tênia do peixe é comum em países que consomem peixes de águas frias e profundas, como o salmão e a carpa. Sendo assim, assinale a alternativa correta:");
            question.setEnunciado2("");
            question.setA("Infestação parasitária causada pelo verme Diphyllobothrium latum que em seu estágio mais primário se desenvolve em mamíferos ou em aves, e, o estágio adulto em copépodes (crustáceos) e peixes.");
            question.setB("O sítio de infestação é o intestino delgado onde se desenvolve suas proglotes e desova essas pelo sistema gastrintestinal do animal.");
            question.setC("A infestação por D. latum pode ocasionar o aumento de muco e inflamação de mucosa intestinal, com espoliação nutricional, que pode evoluir para anemia megaloblástica (espoliação de vitamina B12).");
            question.setD("O diagnóstico pode ser feito pelo resultado positivo de proglótides gravídicas em EPF – 3 amostras, e, em peixes com a biópsia de musculatura com achado de verme adulto.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.b);
            lquestion.add(question);

            question = new Question();
            question.setId(8L);
            question.setTema("Parasitoses");
            question.setEnunciado("O Strongyloides stercoralis tem duas formas patogênicas para o homem, sendo encontrado mundialmente, com elevada prevalência em áreas tropicais e subtropicais, com fácil transmissão (probabilidade alta para autoinfecção), tendência à cronicidade podendo ‟agudizar‟ e disseminar pelo organismo humano. Sobre esse patógeno, assinale a incorreta:");
            question.setEnunciado2("");
            question.setA("A eliminação de larvas rabditóides nas fezes do hospedeiro pode realizar o ciclo partenogenético (infectante) e o ciclo sexuado (vida livre).");
            question.setB("A forma cutânea é discreta em pele e mucosas, não podendo levar a reações de hipersensibilidade; já, a forma pulmonar é presente em todos casos com tosse, dispnéia e crises asmatiformes, não podendo haver hemoptise.");
            question.setC("Epidemiologicamente afeta mais trabalhadores rurais e, em países tropicais, crianças, devido ao solo contaminado e a falta de calçados.");
            question.setD("A forma intestinal pode causar enterite, ulcerações com presença de infecção bacteriana secundária; já a forma disseminada é comum em pacientes imunocomprimidos.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.b);
            lquestion.add(question);

            question = new Question();
            question.setId(9L);
            question.setTema("Parasitoses");
            question.setEnunciado("A Malária ou Paludismo é causada por um protozoário chamado Plasmodium spp., sendo conhecido 4 espécies causadoras de doença ao homem (P. vivax, P. falciparum, P. malarie, P. ovalae). A Malária afeta cerca 300 milhões de pessoas, evoluindo para óbito para mais de 1 milhão de casos. Sobre esse agente patogênico, assinale a alternativa correta:");
            question.setEnunciado2("");
            question.setA("O ciclo de vida dos Plasmodium spp. é caracterizado pela entrada de esporozoítos na circulação sanguínea, após isso há a transformação em merozoítos, sendo seguido por trofozoítos, podendo ir para o baço e entrar em latência em forma de hipnozoítos.");
            question.setB("A reprodução sexuada do protozoário se dá em via sanguínea humana, logo, o homem é o hospedeiro definitivo.");
            question.setC("Com o ato hematofagocítico de fêmeas do gênero Lutzomia spp., há a transmissão do protozoário para os homens e outros animais.");
            question.setD("A transmissão pode ocorrer devido à hematofagia de vetor entomológico, por transmissão acidental e por via congênita, sendo esta última uma forma rara de transmissão.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.d);
            lquestion.add(question);

            question = new Question();
            question.setId(10L);
            question.setTema("Parasitoses");
            question.setEnunciado("O verme Trichuris trichiura, também chamado de tricocéfalo, é um patógeno cosmopolita de alta prevalência na população humana e de relação parasitária com a espécie humana de longa data. Há registros de múmias endêmicas da Eurásia com presença de ovos desse parasito em alças intestinais. O verme T. trichiura tem como sítio de infestação o intestino grosso, podendo em infestações mais graves alcançar reto e ânus. Marque a alternativa incorreta:");
            question.setEnunciado2("");
            question.setA("A transmissão desse verme por meio da disseminação de ovos para o ambiente e contaminação de alimentos e água, bem como, a ingesta desses pelo hospedeiro.");
            question.setB("Inflamações mais graves podem causar inflamações retais com indução de resposta autônoma da defecação (tenesmo), que em alguns casos agudos pode evoluir em prolapso retal.");
            question.setC("O diagnóstico desta moléstia é feito por via clínica somente em casos de prolapso retal com presença do verme, ou por via laboratorial com EPF – 3 amostras positivo para T. trichiura.");
            question.setD("Profilaticamente pode ser realizada a educação sanitária e a construção de fossas para redução epidemiológica desse verme na população, não sendo, portanto necessário tratar os pacientes.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.d);
            lquestion.add(question);

            question = new Question();
            question.setId(11L);
            question.setTema("Parasitoses");
            question.setEnunciado("A família Ancylostomatidae tem como principais representantes os vermes cilíndricos Ancylostoma duodenale e Necator americanus podendo provocar uma enfermidade chamada Ancilostomíase ou “amarelão”, que é contraída por via percutânea e via oral, tendo transmissão quando há a deposição de ovos no ambiente. Sobre essas doenças, marque a alternativa correta:");
            question.setEnunciado2("");
            question.setA("Na fase aguda de infestação, há a penetração ativa das larvas com trauma tissular que podem ocasionar hiperemia, prurido e edema locais.");
            question.setB("A transmissão em humanos pode ocorrer por via mamária e vertical, bem como, infestação por alimentos e água.");
            question.setC("Classifica-se em grau das lesões pelo número de larvas, pela sensibilidade do hospedeiro e pelo local de penetração do verme.");
            question.setD("Na infestação em intestino pode haver sintomas de aumento de apetite, diarreia explosiva e mucosanguinolenta, já em infestação em pulmões pode haver febre e tosse.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.a);
            lquestion.add(question);

            question = new Question();
            question.setId(12L);
            question.setTema("Parasitoses");
            question.setEnunciado("Uma das helmintíases mais frequentes, a Ascaridíase é provocada pelo verme cilíndrico Ascaris lumbricoides, sendo um verme cosmopolita de prevalência variada nas populações. No Brasil, o A. lumbricoides chega a infestar cerca de 90 milhões de pessoas por ano, com altos níveis de parasitismo em zonas rurais e urbanas, principalmente em crianças abaixo dos 12 anos. Assinale a alternativa correta:");
            question.setEnunciado2("");
            question.setA("Maior dos nematódeos do trato digestivo humano, o A. lumbricoides é um verme estenoxeno de aparência macroscópica muito similar ao verme T. solium.");
            question.setB("A ingesta de água e alimentos contaminados, ou deposições subungueais, ou a veiculação aérea (poeira e insetos) fazem parte do processo de contaminação.");
            question.setC("A passagem do parasito pelos pulmões ocasiona a Síndrome de Loeffler, ocasionando edema alveolar, infiltrado basofílico, manifestações alérgicas, febre, bronquite e pneumonia.");
            question.setD("O diagnóstico clínico de Ascaridíase é dado pela eliminação de vermes nas fezes, já o diagnóstico laboratorial é dado por EPF – 3 amostras; exames de imagem não são utilizados.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.b);
            lquestion.add(question);

            question = new Question();
            question.setId(13L);
            question.setTema("Parasitoses");
            question.setEnunciado("O vulgarmente conhecido “Bicho geográfico”, ou Larva Migrans, é causado por um verme cilíndrico chamado A. braziliensi, podendo ser também causado pelo A. caninum, sendo um verme cosmopolita com predomínio em regiões tropicais e subtropicais. Sobre essa doença, marque a errada:");
            question.setEnunciado2("");
            question.setA("A penetração ativa da larva na pele humana faz com que haja reação inflamatória localizada em pessoas sensibilizadas anteriormente, e a progressão da larva pela pele faz com que haja infiltrado eosinofílico pelo trajeto do verme, assim, estabelecendo o nome vulgar do verme.");
            question.setB("As partes mais atingidas nos humanos são MMSS e MMII, podendo atingir mucosa oral pelo hábito de geofagia.");
            question.setC("O diagnóstico clínico não é confiável sendo necessário pedir exames laboratoriais como EPF ou sorológico para A. braziliensi.");
            question.setD("Há uma variante da doença chamada Larva Migrans ocular, sendo ocasionada pelo Toxocara canis, de difícil diagnóstico devido ao EPF negativo (ciclo de vida não se completa no homem).");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(14L);
            question.setTema("Parasitoses");
            question.setEnunciado("A Esquistossomíase ou Esquistossomose é uma doença conhecida vulgarmente por “Barriga d‟água”, devido à ascite volumosa presente nos pacientes. Vermes com dimorfismo sexual amplamente distribuído pelo globo, com presença de hospedeiro intermediário e hospedeiro definitivo. Sobre essa doença, assinale a correta:");
            question.setEnunciado2("");
            question.setA("O ciclo de vida deste parasito se dá pela liberação de ovos perto de represas e lagos com a presença do caramujo do gênero Biomphalaria, sendo assim, os ovos eclodem em cercárias que entram nos caramujos e viram miracídios, formas infectantes, que entram ativamente no homem.");
            question.setB("A forma adulta do verme vive no espaço porta, podendo ir para ramos terminais da V. mesentérica superior para reprodução.");
            question.setC("O diagnóstico clínico pode ofertar planejamento sobre a fase da doença, já o laboratorial pode ser feito por EPF e biópsia estomacal.");
            question.setD("A gravidade da infestação depende de vários fatores, os quais, reposta imune do hospedeiro, estado nutricional, idade, carga parasitária e cepa do parasito.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.d);
            lquestion.add(question);

            question = new Question();
            question.setId(15L);
            question.setTema("Parasitoses");
            question.setEnunciado("A Criptosporidíase é uma doença causada pelo protozoário Cryptosporidium parvum, uma doença que gera diarreia em pacientes. Sobre a doença e seu causador, marque a alternativa incorreta:");
            question.setEnunciado2("");
            question.setA("A transmissão se dá preferencialmente por via oral-fecal com transporte dos oocistos.");
            question.setB("Em pacientes HIV/AIDS descontrolados há a manifestação de enterocolite aguda e autolimitada.");
            question.setC("Com a esteatorreia causada pode haver uma espoliação de vitaminas lipossolúveis como as vitaminas K, E, D, A.");
            question.setD("O diagnóstico pode ser feito por meio de EPF – 3 amostras.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.b);
            lquestion.add(question);

            question = new Question();
            question.setId(16L);
            question.setTema("Parasitoses");
            question.setEnunciado("A Enterobíase, ou Oxiuríase é uma doença provocada pelo agente patogênico Enterobius vermicularis, sendo uma doença bastante comum e de natureza benigna. É conhecida popularmente por provocar nos pacientes um prurido anal pela noite, devido à deposição noturna de ovos pela fêmea. Sobre a Oxiuríase, marque a alternativa correta:");
            question.setEnunciado2("");
            question.setA("Parasitose universal mais comum em regiões frias e temperadas, os vermes E. vermicularis são monoxênicos e exclusiva da espécie humana, tendo como ponto de infecção o meio familiar.");
            question.setB("O diagnóstico consiste na clínica de prurido anal associada a hemograma, a qual a eosinofilia constitui grande aporte diagnóstico.");
            question.setC("Em mulheres pode haver a migração do verme para vulva e vagina, ocasionando uma vulvovaginite acompanhada sempre de secreção.");
            question.setD("O prurido anal relatado pelos pacientes se refere à intensa reação inflamatória provocada pelos ovos do parasita quando depositados na pele da região glútea do paciente, podendo evoluir a formações pustulosas exsudativas.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.a);
            lquestion.add(question);

            question = new Question();
            question.setId(17L);
            question.setTema("Parasitoses");
            question.setEnunciado("A Fasciolose é uma zoonose proveniente da Europa, ocasionada pelos vermes Fasciola hepatica e F. gigantica, com distribuição mundial e transmissão ao homem por meio da ingesta de animais aquáticos e água contaminada pelo parasito. Sobre esse parasito e a doença que ele provoca, assinale a incorreta:");
            question.setEnunciado2("");
            question.setA("Em infecções agudas, o parasito se hospeda no fígado causando morte de hepatócitos, lesões na superfície hepática e áreas de necrose, levando a cicatrização e inflamação do sítio hepático.");
            question.setB("O diagnóstico por meio de EPF – 3 amostras apresenta bom aporte diagnóstico, uma vez que sempre há a presença dos ovos nas fezes.");
            question.setC("Em infecções crônicas, acima de 7 semanas, o parasito se aloca em vesícula biliar e árvore biliar, podendo haver presença de litíase e hepatomegalia.");
            question.setD("A proteção de mananciais aquáticos da poluição fecal pode favorecer para redução dessa zoonose.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.b);
            lquestion.add(question);

            question = new Question();
            question.setId(18L);
            question.setTema("Parasitoses");
            question.setEnunciado("A Filariose ou “Elefantíase” é uma doença parasitária ocasionada por um nematódeo chamada Wuchereria bancrofti sendo comum nas Américas e na África, sendo comum sua infestação, tendo como prevalência de W. bancrofti 112 milhões de indivíduos atualmente. No Brasil, em 1997, houve a instauração do Programa Nacional de Eliminação da Filariose tendo diminuído bastante os números oficiais dessa parasitose, ficando alguns focos dessa no estado do Pernambuco. Sobre essa parasitose, assinale a incorreta:");
            question.setEnunciado2("");
            question.setA("É uma parasitose exclusiva da espécie humana, contendo como vetor o mosquito Culex spp., tendo como sítio de infestação as vias linfáticas.");
            question.setB("É uma parasitose tem seu ciclo heteroxênico, apresentando fase assexuada nos homens e sexuada nos mosquitos vetores.");
            question.setC("A disfunção linfática ocorre devido a obliteração dos vasos linfáticos pelo nematódeo, fato que provoca o edema correlato.");
            question.setD("Laboratorialmente, pode ser realizada a pesquisa de sangue periférico com o achado para filárias no microscópio.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.a);
            lquestion.add(question);

            question = new Question();
            question.setId(19L);
            question.setTema("Parasitoses");
            question.setEnunciado("Paciente E.V.A., 24 anos, profissional do sexo, chega à UBS “Comigo Ninguém Pode” relatando prurido vaginal intenso. À anamnese, paciente relata prurido vaginal intenso de início gradual progressivo há 2 semanas, associado a dispaurenia , disúria e desconforto miccional. Ao exame físico, presença de vulvovaginite extensa. Ao exame especular, leucorreia não fisiológica branca leitosa, com formação de bolhas e fétida, ao se analisar orifício cervical externo, vê-se colo em morango. Segundo a clínica, destaque a doença correta da paciente e o agente patogênico:");
            question.setEnunciado2("");
            question.setA("Candidíase – Candida albicans.");
            question.setB("Leucorreia por Clamídia - Chlamydia trachomatis.");
            question.setC("Tricomoníase – Trichomonas vaginalis.");
            question.setD("Vaginose bacteriana - Gardnerella vaginalis e Mycoplasma hominis.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(20L);
            question.setTema("Parasitoses");
            question.setEnunciado("Homem, 67 anos, chega ao pronto socorro com queixas de dispneias aos pequenos esforços, relatando estar infartando. Depois de institucionalizado e medicado com droga beta-bloqueadora, realiza-se anamnese, o qual paciente relata dispnéia aos pequenos esforços, mal-estar, epigastralgia, disfagia com regurgitações, palpitações e insônia de longas datas. O paciente refere fazer uso de zolpidem (hipnótico) para indução de sono, omeprazol (inibidor da bomba de prótons) para tratamento da disfagia e IECA+ diurético de alça devido HAS diagnosticada no posto de saúde. A conduta adotada foi radiografia contrastada com Bário de tórax, sendo visto a imagem abaixo (figura 1). Paciente, entretanto, teve um episódio de arritmia não controlável e evoluiu para PCR com óbito após RCP. Ao exame necrópsico, paciente apresentava cardiomegalia, sendo extraídos fragmentos para biópsia. O resultado dessa biópsia (figura 2) revela ninho de amastigotas. Assinale a afirmativa cuja doença encaixa com a clínica do paciente:");
            question.setEnunciado2("");
            question.setA("Doença de Chagas.");
            question.setB("Endocardite de Libman-Sacks.");
            question.setC("Cardiopatia e esofagopatia lúpica.");
            question.setD("Endocardite por Streptococcus mutans.");
            question.setFoto(R.drawable.parasitoses);
            question.setGabarito(R.id.a);
            lquestion.add(question);
        }
        return lquestion;
    }
}