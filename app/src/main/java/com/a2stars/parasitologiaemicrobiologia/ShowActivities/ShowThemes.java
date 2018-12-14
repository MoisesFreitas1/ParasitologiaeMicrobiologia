package com.a2stars.parasitologiaemicrobiologia.ShowActivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import com.a2stars.parasitologiaemicrobiologia.R;

public class ShowThemes extends AppCompatActivity {
    private TextView microbiologia, parasitologia, simuladao;
    private String diseases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_themes);

        microbiologia = (TextView) findViewById(R.id.microbiologia);
        microbiologia.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(v.getContext(), ShowListSubject.class);
                        i.putExtra("microbiologia", diseases);
                        startActivity(i);
                    }
                });

        parasitologia = (TextView) findViewById(R.id.parasitologia);
        parasitologia.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(v.getContext(), ShowListSubject.class);
                        i.putExtra("parasitologia", diseases);
                        startActivity(i);
                    }
                });

        simuladao = findViewById(R.id.simuladao);
        simuladao.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent i = new Intent(v.getContext(), ShowQuestionBegin.class);
                        startActivity(i);
                    }
                });
    }
}
