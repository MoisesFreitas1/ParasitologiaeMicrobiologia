package com.a2stars.parasitologiaemicrobiologia.ShowActivities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.a2stars.parasitologiaemicrobiologia.ListViews.LMicrobiologia;
import com.a2stars.parasitologiaemicrobiologia.ListViews.LParasitologia;
import com.a2stars.parasitologiaemicrobiologia.Models.Theme;
import com.a2stars.parasitologiaemicrobiologia.R;

import java.util.ArrayList;
import java.util.List;

public class ShowMenuSubject extends AppCompatActivity {

    private TextView teoria, video, casos, simulado, subject;
    private Integer idList, listId;
    private Theme theme;
    private String UrlVideo, UrlPDF, LQuestion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_menu_subject);

        teoria = findViewById(R.id.teoria);
        video = findViewById(R.id.video);
        casos = findViewById(R.id.teoria);
        simulado = findViewById(R.id.simulado);
        subject = findViewById(R.id.subject);

        List<Theme> listSubjetct = new ArrayList<>();

        if (getIntent().hasExtra("listId")) {
            listId = getIntent().getIntExtra("listId", 46666);
            if (listId == 1) {
                listSubjetct = LMicrobiologia.getThemes();
            } else {
                listSubjetct = LParasitologia.getThemes();
            }
        }

        if (getIntent().hasExtra("id_list")) {
            idList = getIntent().getIntExtra("id_list", 46666);
            if (idList != 46666) {
                theme = listSubjetct.get(idList);
            }
        }

        subject.setText(theme.getTitulo());
        UrlVideo = theme.getVlink();
        UrlPDF = theme.getTlink();

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ShowMenuSubject.this, ShowVideo.class);
                i.putExtra("urlvideo", UrlVideo);
                startActivity(i);
            }
        });

        teoria.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Uri uri = Uri.parse(UrlPDF);
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                    }
                });

        simulado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ShowMenuSubject.this, ShowQuestion.class);
                i.putExtra("id_list", idList);
                i.putExtra("listId", listId);
                startActivity(i);
            }
        });


    }
}
