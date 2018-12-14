package com.a2stars.parasitologiaemicrobiologia.ListViews;

import com.a2stars.parasitologiaemicrobiologia.Models.Question;
import com.a2stars.parasitologiaemicrobiologia.R;

import java.util.ArrayList;
import java.util.List;

public class LMicoses {
    private static List<Question> lquestion = new ArrayList<>();

    public static List<Question> getLquestion() {
        if (lquestion.isEmpty()) {
            Question question = new Question();
            question.setId(1L);
            question.setTema("Micoses");
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
            question.setTema("Micoses");
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
            question.setTema("Micoses");
            question.setEnunciado("A Tinea nigra é uma feohifomicose, cujo agente etiológico é a Hortae werneckii, acometendo as regiões palmar e plantar de um indivíduo. Assinale a alternativa correta:");
            question.setEnunciado2("");
            question.setA("A clínica desta micose se baseia em lesões hiperemiadas, descamativas, bem delimitadas, pruriginosas e com edema associado.");
            question.setB("Atinge mais crianças e jovens abaixo de 20 anos e mais o sexo masculino.");
            question.setC("O diagnóstico pode ser feito por meio da coleta do raspado de bordos e visualização do fungo, bem como, exposição deste ao KOH 20%.");
            question.setD("O diagnóstico laboratorial por cultura fúngica com material seletivo para esse tipo de ser vivo, o Ágar Sangue.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(4L);
            question.setTema("Micoses");
            question.setEnunciado("A Piedra preta tem como agente etiológico o ascomiceto Piedraia hortae, que causa tal enfermidade nos pelos, podendo ser chamada também de “Tricomicose nodosa escura” ou “Tricomicose dos estudantes”. Sobre essa micose, marque a alternativa correta:");
            question.setEnunciado2("");
            question.setA("Há envolvimento patológico do folículo piloso, que cursa com alopecia bem delimitada ao campo de acometimento fúngico.");
            question.setB("A clínica dessa enfermidade é o aparecimento de nódulos escuros e endurecidos aderidos aos cabelos e outro pelos.");
            question.setC("Tem alto poder de contágio, assintomático, crônico e recidivante, sendo mais frequente em indivíduos do sexo masculino.");
            question.setD("O diagnóstico laboratorial pode ser feito pela coleta e exame direto com KOH 20% - com presença de hifas dermáceas – e coleta e exame cultural em Ágar Sangue – com presença de colônia preta ou verde escura com elevação central.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.b);
            lquestion.add(question);

            question = new Question();
            question.setId(5L);
            question.setTema("Micoses");
            question.setEnunciado("A Piedra branca é uma hialohifomicose, ocasionada por uma levedura do gênero Trichosporon spp. Sobre essa enfermidade, assinale a incorreta:");
            question.setEnunciado2("");
            question.setA("Há envolvimento do pelo com aparecimento de nódulos claros e moles principalmente na região púbica.");
            question.setB("Pode evoluir de assintomático para sintomático, ocasionando lesões cutâneas hiperemiadas na base do folículo piloso.");
            question.setC("Atinge mais a homens e tem como tratamentos antifúngicos orais e tricotomia.");
            question.setD("O diagnóstico em exame direto com KOH 20% é visto nódulos castanhos claros com massa de leveduras hialinas; já, em exame cultural, observa-se colônia cremosa, leveduriformes, de cor bege-amarelada.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(6L);
            question.setTema("Micoses");
            question.setEnunciado("As micoses cutâneas ou dermatofitoses são principalmente ocasionadas pelos dermatófitos, que são fungos filamentosos hialinos capazes de digerir a queratina presente em pele e fâneros humanos. Sobre essas micoses e seus agentes etiológicos, cite a alternativa incorreta:");
            question.setEnunciado2("");
            question.setA("Os principais gêneros patógenos nas dermatofitoses são Trichophyton spp., Microsporum spp., e, Epidermophyton spp.");
            question.setB("Os artroconídeos só conseguem iniciar a infecção se houver uma porta de entrada na pele.");
            question.setC("Micose mais prevalente em mulheres, e, ubíqua com variação de espécies ao redor do globo.");
            question.setD("Idade, gênero, imunocomprometimento, hábitos em geral e migrações são fatores predisponentes para as dermatofitoses.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(7L);
            question.setTema("Micoses");
            question.setEnunciado("Ainda sobre as dermatofitoses, assinale a correta:");
            question.setEnunciado2("");
            question.setA("A pele glabra, ou, “pele sem pelos”, pode ser classificada de acordo com a região de acometimento da lesão em pelos corporais ou unhas.");
            question.setB("A transmissão da tinea pedis, ou tinha das mãos, pode ocorrer devido ao fenômeno “two feet-one hand syndrome.");
            question.setC("A micose Tokelau, que é caracterizada por lesões escamosas muito contagiosas que formam desenhos concêntricos, que são usados pelos indígenas do Pacífico e no Brasil para adorno corporal, pode ser considerada doença.");
            question.setD("A Tinea capitis é mais prevalente em crianças na puberdade, pois os hormônios esteróides são ativadores da multiplicação fúngica.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.a);
            lquestion.add(question);

            question = new Question();
            question.setId(8L);
            question.setTema("Micoses");
            question.setEnunciado("As micoses subcutâneas são normalmente causadas por fungos saprófitos habituais do solo e organismo vegetais em decomposição. Geralmente acessam o corpo humano por meio de um trauma prévio ou adjacente a ele. Considere as afirmativas abaixo e assinale a incorreta:");
            question.setEnunciado2("");
            question.setA("A infecção depende principalmente da resistência do hospedeiro, da virulência da cepa fúngica e da quantidade de material patogênico inoculado.");
            question.setB("As lesões tendem a cronicidade, e, em indivíduos com imunocomprometimento, pode haver fungemia.");
            question.setC("O tratamento pode ocorrer ambulatorialmente com antifúngicos orais ou tópicos, ou, cirurgicamente.");
            question.setD("As lesões normalmente ocorrem nos MMII e nos MMSS.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.d);
            lquestion.add(question);

            question = new Question();
            question.setId(9L);
            question.setTema("Micoses");
            question.setEnunciado("A Esporotricose é ocasionada por um fungo dimórfico Sporothrix spp., é considerada uma micose ocupacional, pois atinge mais a trabalhadores de jardinagem, mineração e agricultura. Sobre essa micose, assinale a alternativa incorreta:");
            question.setEnunciado2("");
            question.setA("É uma micose endêmica – América do Sul – que acomete mais aos indivíduos do sexo masculino.");
            question.setB("O diagnóstico pelo exame direto fecha diagnóstico devido forte evidência, quando visualizado corpos leveduriformes semelhantes a charuto.");
            question.setC("A clínica da Esporotricose é característica de uma doença crônica granulomatosa que surge de 1-12 semanas após exposição, de cor róseo-avermelhada, podendo evoluir com ulceração e disseminação linfática.");
            question.setD("O diagnóstico pela cultura do Sporothrix spp. e visualização dos corpos de frutificação semelhantes à margaridas tem maior fator diagnóstico.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.b);
            lquestion.add(question);

            question = new Question();
            question.setId(10L);
            question.setTema("Micoses");
            question.setEnunciado("A Cromomicose é uma micose granulomatosa crônica subcutânea ocasionada pela entrada de fungos demáceos em locais de trauma prévio ou adjacente. Sobre essa micose, assinale a incorreta:");
            question.setEnunciado2("");
            question.setA("Os fungos demáceos mais comuns na Cromomicose são os Fonsecaea pedrosoi e Cladophialophora carrionii.");
            question.setB("Atinge mais a homens por motivos laborais, e, mais em países tropicais ou subtropicais.");
            question.setC("A clínica do paciente com Cromomicose é característico de lesões em “aspecto de couve flor”.");
            question.setD("Ao exame direto com fins diagnósticos, observam-se invasões por hifas.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.d);
            lquestion.add(question);

            question = new Question();
            question.setId(11L);
            question.setTema("Micoses");
            question.setEnunciado("Sobre a Feohifomicose, assinale a correta:");
            question.setEnunciado2("");
            question.setA("É ocasionada por fungos oportunistas ubíquos principalmente em zonas rurais.");
            question.setB("Seu ciclo evolutivo se destaca em 3 partes, sendo elas, a colonização superficial, a implantação por trauma e por fim, a infecção restrita ao espaço córneo da derme.");
            question.setC("A lesão cística encapsulada e subcutânea presente na micose pode levar a um quadro sistêmico podendo ser fatal em pacientes imunocompetentes.");
            question.setD("No exame anatomopatológico, vê-se hifas demáceas septadas em meio de transudato.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.a);
            lquestion.add(question);

            question = new Question();
            question.setId(12L);
            question.setTema("Micoses");
            question.setEnunciado("Sobre a Lobomicose e Rinosporidiose, assinale a incorreta:");
            question.setEnunciado2("");
            question.setA("Lobomicose é uma micose subcutânea crônica, mais prevalente em homens entre 20-40 anos, devido questão laboral.");
            question.setB("O diagnóstico de Lobomicose é feito por imunofluorescência direta e vê-se cadeias pigmentadas de células leveduriformes.");
            question.setC("A Rinosporidiose é uma micose granulomatose crônica, não transmitível entre humanos.");
            question.setD("A clínica da Rinosporidiose é marcada por grandes pólipos, tumores, papilomas e lesões verrucosas na região nasal, sendo transmitido entre humanos.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.d);
            lquestion.add(question);

            question = new Question();
            question.setId(13L);
            question.setTema("Micoses");
            question.setEnunciado("A Paracoccidioidomicose é uma micose sistêmica causada pelo fungo Paracoccidioies brasiliensis, seu contágio se dá por meio da inalação de conídeos, afetando mais a população campesinata masculina de 30 a 50 anos. São características clínicas e diagnósticas, exceto:");
            question.setEnunciado2("");
            question.setA("Forma aguda: acometimento osteoarticular, hepatoespleno-linfadenomegalia e lesões cutâneas.");
            question.setB("Forma crônica: tuberculose com calcificação pulmonar, lesões ulcerativas e hipo/hiperplasia de mucosa.");
            question.setC("O teste padrão-ouro é o isolamento do agente etiológico por exame a fresco de escarro, raspado de bordo lesional, PAAF, fragmento de biópsia.");
            question.setD("No diagnóstico por exame direto com KOH 20%, pode-se ver morfologia “roda de leme”, com presença de células filamentosas arredondadas.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.d);
            lquestion.add(question);

            question = new Question();
            question.setId(14L);
            question.setTema("Micoses");
            question.setEnunciado("A Coccidioidomicose é uma micose causada pelo fungo Coccidioides immitis, com ampla distribuição geográfica nas Américas. Marque a alternativa incorreta:");
            question.setEnunciado2("");
            question.setA("As formas de acometimento do fungo são pulmonar, disseminada – em pacientes imunocomprometidos – e, inoculação primária.");
            question.setB("O hábitat do fungo é caracterizado por solos de clima frio com alta salinidade e ph alcalino.");
            question.setC("A transmissão desse fungo se dá pela inalação de artroconídios.");
            question.setD("No exame direto diagnóstico se podem ver elementos espessos esféricos repletos de endósporos.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.b);
            lquestion.add(question);

            question = new Question();
            question.setId(15L);
            question.setTema("Micoses");
            question.setEnunciado("A Histoplasmose é uma micose causada pelo fungo Histoplasma capsulatum com distribuição geográfica mundial. Desse modo, marque a alternativa correta:");
            question.setEnunciado2("");
            question.setA("O hábitat desse fungo é em solos enriquecidos de fezes de aves e morcegos, e, a transmissão se dá pela inalação de conídios.");
            question.setB("A forma pulmonar se divide em dois momentos, a fase aguda – nódulos calcificados – e a fase crônica – cavitações pulmonares com aumento do volume residual pulmonar e macicez à percussão.");
            question.setC("O diagnóstico laboratorial por exame direto encontra pequenas hifas encapsuladas.");
            question.setD("O teste sorológico com histoplasmina se considera positivo com presença somente de eritema.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.a);
            lquestion.add(question);

            question = new Question();
            question.setId(16L);
            question.setTema("Micoses");
            question.setEnunciado("A Criptococose é uma micose ocasionada pelo fungo Cryptococcus neoformans, tendo como fatores predisponentes grandes aglomerados populacionais de pombos, ventilação insatisfatória, limpeza inadequada e temperatura elevada. Costuma atacar órgãos profundos e pele, mas tem tropismo pelo SNC. Desse modo, assinale a alternativa verdadeira:");
            question.setEnunciado2("");
            question.setA("É uma das principais doenças, mesmo com as variantes, a atingir pacientes imunocompetentes.");
            question.setB("As manifestações clínicas dos pacientes com Criptococose são assintomática, pulmonar, neurológica e disseminada.");
            question.setC("São fatores negativos de virulência a presença de cápsula, ação da fenoloxidase e da urease.");
            question.setD("O teste ELISA não é eficaz no diagnóstico de Criptococose.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.b);
            lquestion.add(question);

            question = new Question();
            question.setId(17L);
            question.setTema("Micoses");
            question.setEnunciado("A Blastomicose é causada pelo fungo Blastomyces dermatitidis e seu hábitat é em solos úmidos e na presença de organismos vegetais em decomposição. Sobre essa micose, assinale a alternativa incorreta:");
            question.setEnunciado2("");
            question.setA("É frequentemente associado a homens negros na faixa de 30-60 anos de idade.");
            question.setB("Seu local de infecção primária é no tecido pulmonar, onde pode se disseminar por via hematogênica.");
            question.setC("No exame direto, observa-se gêmulos arredondados de parede espessa.");
            question.setD("A evolução pode atingir pele, ossos ou outros órgãos.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(18L);
            question.setTema("Micoses");
            question.setEnunciado("Sobre a Candidose, assinale a incorreta:");
            question.setEnunciado2("");
            question.setA("Ataca pacientes imunocomprometidos.");
            question.setB("Podem ocasionar infecção hospitalar.");
            question.setC("Apresenta diagnóstico claro.");
            question.setD("É primariamente uma infecção endógena.");
            question.setFoto(R.drawable.transparent);
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(19L);
            question.setTema("Micoses");
            question.setEnunciado("Paciente A.A.A, homem, negro, 60 anos, aposentado rural -antes da reforma na previdência-, chega à unidade de saúde referindo “dor de cabeça há 20 dias”. Ao exame clínico, paciente refere cefaleia “em cinturão” progressiva, refratária à dipirona sódica, paracetamol e AAS. Quando arguido sobre outros sintomas refere fadiga, cervicalgia leve, irritabilidade, sonolência diurna excessiva e náusea acompanhada de vômito. Ao exame físico, paciente BEG, normocorado, hidratado, irritadiço e confuso. Quando questionado sobre hábitos sociais rotineiros, paciente relata ida ao parque municipal todo dia pela manhã para alimentar pombos Tax: 37ºC, PA: 130x 90 mmHg, FC: 88 bpm, FR: 16 irpm. À campimetria, observou-se perda da acuidade visual em campo temporal do olho direito. Quando realizado manobra de avaliação da rigidez nucal, detectou-se sinal de Lasègue presente. Examinador solicita neuroimagem e institucionaliza paciente devido risco psicossocial. A seguir, a neuroimagem do paciente AAA:");
            question.setEnunciado2("Baseado na história clínica do paciente dê o diagnóstico provável e o nome do agente etiológico:");
            question.setA("Neurocriptococose – Criptococcus neoformans.");
            question.setB("Cisticercose cerebral – Taenia solium.");
            question.setC("Malária cerebral – Plasmodium vivax");
            question.setD("Esporotricose cerebral – Sporothrix spp.");
            question.setFoto(R.drawable.micoses);
            question.setGabarito(R.id.a);
            lquestion.add(question);
        }
        return lquestion;
    }
}