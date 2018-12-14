package com.a2stars.parasitologiaemicrobiologia.ListViews;

import com.a2stars.parasitologiaemicrobiologia.Models.Theme;
import com.a2stars.parasitologiaemicrobiologia.R;

import java.util.ArrayList;
import java.util.List;

public class LParasitologia {

        private static List<Theme> themes = new ArrayList<>();

        public static List<Theme> getThemes() {
            if (themes.isEmpty()) {
                Theme theme = new Theme();
                theme.setIdent(1L);
                theme.setTitulo("Introdução à Parasitologia | Filo Arthropoda | Classe Arachnida: Carrapatos");
                theme.setImagem1(R.drawable.carrapato);
                theme.setVlink("4eoM26ZmHd0");
                theme.setTlink("http://www.soundczech.cz/temp/lorem-ipsum.pdf");
                themes.add(theme);

                theme = new Theme();
                theme.setIdent(2L);
                theme.setTitulo("Filo Arthropoda | Classe Arachnida: Carrapatos | Classe Arachnida: Sarnas");
                theme.setImagem1(R.drawable.sarna);
                theme.setVlink("4eoM26ZmHd0");
                theme.setTlink("http://www.soundczech.cz/temp/lorem-ipsum.pdf");
                themes.add(theme);

                theme = new Theme();
                theme.setIdent(3L);
                theme.setTitulo("Filo Arthropoda | Classe Arachnida: Sarnas | Ordem Diptera");
                theme.setImagem1(R.drawable.diptera);
                theme.setVlink("4eoM26ZmHd0");
                theme.setTlink("http://www.soundczech.cz/temp/lorem-ipsum.pdf");
                themes.add(theme);

                theme = new Theme();
                theme.setIdent(4L);
                theme.setTitulo("Filo Arthropoda | Subordem Cyclorrhapha");
                theme.setImagem1(R.drawable.cyclorrhapha);
                theme.setVlink("4eoM26ZmHd0");
                theme.setTlink("http://www.soundczech.cz/temp/lorem-ipsum.pdf");
                themes.add(theme);

                theme = new Theme();
                theme.setIdent(5L);
                theme.setTitulo("Filo Arthropoda | Ordem Phthiraptera | Filo Arthropoda | Ordem Siphonaptera | Hemíptera");
                theme.setImagem1(R.drawable.hemiptera);
                theme.setVlink("4eoM26ZmHd0");
                theme.setTlink("http://www.soundczech.cz/temp/lorem-ipsum.pdf");
                themes.add(theme);

                theme = new Theme();
                theme.setIdent(6L);
                theme.setTitulo("Filo Protozoa | Entamoeba/Giardia");
                theme.setImagem1(R.drawable.giardia);
                theme.setVlink("4eoM26ZmHd0");
                theme.setTlink("http://www.soundczech.cz/temp/lorem-ipsum.pdf");
                themes.add(theme);

                theme = new Theme();
                theme.setIdent(7L);
                theme.setTitulo("Filo Protozoa | Cryptosporidium/Trichomonas");
                theme.setImagem1(R.drawable.trichomonas);
                theme.setVlink("4eoM26ZmHd0");
                theme.setTlink("http://www.soundczech.cz/temp/lorem-ipsum.pdf");
                themes.add(theme);

                theme = new Theme();
                theme.setIdent(8L);
                theme.setTitulo("Filo Protozoa | Trypanosoma/Plasmodium spp.");
                theme.setImagem1(R.drawable.trypanosoma);
                theme.setVlink("4eoM26ZmHd0");
                theme.setTlink("http://www.soundczech.cz/temp/lorem-ipsum.pdf");
                themes.add(theme);

                theme = new Theme();
                theme.setIdent(9L);
                theme.setTitulo("Taenia solium | Taenia saginata | Taenia spp | Echinochocus granulosus, Hymenolepis nana e Diphyllobothrium");
                theme.setImagem1(R.drawable.solium);
                theme.setVlink("z25r49M4Ki8");
                theme.setTlink("https://docs.wixstatic.com/ugd/f0d361_2eedc237bcf5468c8800fb12c719ba53.pdf?dn=Teniase+e+Cisticercose.pdf");
                themes.add(theme);

                theme = new Theme();
                theme.setIdent(10L);
                theme.setTitulo("Schistosoma spp. e Fasciola hepatica");
                theme.setImagem1(R.drawable.fasciola);
                theme.setVlink("4eoM26ZmHd0");
                theme.setTlink("http://www.soundczech.cz/temp/lorem-ipsum.pdf");
                themes.add(theme);

                theme = new Theme();
                theme.setIdent(11L);
                theme.setTitulo("Ascaris lumbricoides, Trichuris trichiura, Enterobius e Wuchereria bancrofti");
                theme.setImagem1(R.drawable.lumbricoides);
                theme.setVlink("4eoM26ZmHd0");
                theme.setTlink("http://www.soundczech.cz/temp/lorem-ipsum.pdf");
                themes.add(theme);

                theme = new Theme();
                theme.setIdent(12L);
                theme.setTitulo("Família Ancylosmatidae | Strongyloides spp.");
                theme.setImagem1(R.drawable.strongyloides);
                theme.setVlink("4eoM26ZmHd0");
                theme.setTlink("http://www.soundczech.cz/temp/lorem-ipsum.pdf");
                themes.add(theme);
            }
            return themes;
        }
}
