package com.a2stars.parasitologiaemicrobiologia.ListViews;

import com.a2stars.parasitologiaemicrobiologia.Models.Theme;
import com.a2stars.parasitologiaemicrobiologia.R;

import java.util.ArrayList;
import java.util.List;

public class LMicrobiologia {

    private static List<Theme> themes = new ArrayList<>();

    public static List<Theme> getThemes() {
        if (themes.isEmpty()) {
            Theme theme = new Theme();
            theme.setIdent(1L);
            theme.setTitulo("Bacteriologia Clínica I: Manifestações clínicas condicionadas por cocos Gram-positivos e Gram-negativos");
            theme.setImagem1(R.drawable.cocos);
            theme.setVlink("4eoM26ZmHd0");
            theme.setTlink("http://www.soundczech.cz/temp/lorem-ipsum.pdf");
            themes.add(theme);

            theme = new Theme();
            theme.setIdent(2L);
            theme.setTitulo("Bacteriologia Clínica II: Manifestações clínicas condicionadas por bacilos Gram-positivos e Gram-negativos");
            theme.setImagem1(R.drawable.bacilos);
            theme.setVlink("4eoM26ZmHd0");
            theme.setTlink("http://www.soundczech.cz/temp/lorem-ipsum.pdf");
            themes.add(theme);

            theme = new Theme();
            theme.setIdent(3L);
            theme.setTitulo("Espiroquetas, micoplasmas, clamídias e riquétsias");
            theme.setImagem1(R.drawable.espiroquetas);
            theme.setVlink("4eoM26ZmHd0");
            theme.setTlink("http://www.soundczech.cz/temp/lorem-ipsum.pdf");
            themes.add(theme);

            theme = new Theme();
            theme.setIdent(4L);
            theme.setTitulo("Virologia Clínica: Vírus da imunodeficiência humana (HIV) e Papilomavírus humano (HPV)");
            theme.setImagem1(R.drawable.hiv);
            theme.setVlink("s76tPCTPfC4");
            theme.setTlink("https://docs.wixstatic.com/ugd/f0d361_2206adaf2ee24d42839c1c9720ad32d3.pdf?dn=AIDS.pdf");
            themes.add(theme);

            theme = new Theme();
            theme.setIdent(5L);
            theme.setTitulo("Virologia Clínica: Hepatites virais");
            theme.setImagem1(R.drawable.hepatite);
            theme.setVlink("4eoM26ZmHd0");
            theme.setTlink("http://www.soundczech.cz/temp/lorem-ipsum.pdf");
            themes.add(theme);

            theme = new Theme();
            theme.setIdent(6L);
            theme.setTitulo("Virologia Clínica: Viroses dermotrópicas, congênitas e multissistêmicas");
            theme.setImagem1(R.drawable.virologia);
            theme.setVlink("4eoM26ZmHd0");
            theme.setTlink("http://www.soundczech.cz/temp/lorem-ipsum.pdf");
            themes.add(theme);

            theme = new Theme();
            theme.setIdent(7L);
            theme.setTitulo("Micologia Clínica: Micoses superficiais estritas");
            theme.setImagem1(R.drawable.micossuper);
            theme.setVlink("2gjflZcYYFM");
            theme.setTlink("https://docs.wixstatic.com/ugd/f0d361_58c353350c594df79dede88a09de9c35.pdf?dn=micologia.pdf");
            themes.add(theme);

            theme = new Theme();
            theme.setIdent(8L);
            theme.setTitulo("Micologia Clínica: Micoses cutâneas");
            theme.setImagem1(R.drawable.micosecut);
            theme.setVlink("4eoM26ZmHd0");
            theme.setTlink("http://www.soundczech.cz/temp/lorem-ipsum.pdf");
            themes.add(theme);

            theme = new Theme();
            theme.setIdent(9L);
            theme.setTitulo("Micologia Clínica: Micoses subcutâneas");
            theme.setImagem1(R.drawable.micosesubcut);
            theme.setVlink("4eoM26ZmHd0");
            theme.setTlink("http://www.soundczech.cz/temp/lorem-ipsum.pdf");
            themes.add(theme);

            theme = new Theme();
            theme.setIdent(10L);
            theme.setTitulo("Micologia Clínica: Micoses sistêmicas");
            theme.setImagem1(R.drawable.micosesist);
            theme.setVlink("4eoM26ZmHd0");
            theme.setTlink("http://www.soundczech.cz/temp/lorem-ipsum.pdf");
            themes.add(theme);
        }
        return themes;
    }

}
