package com.a2stars.parasitologiaemicrobiologia.ShowActivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.a2stars.parasitologiaemicrobiologia.Adapter.SubjectAdapter;
import com.a2stars.parasitologiaemicrobiologia.ListViews.LMicrobiologia;
import com.a2stars.parasitologiaemicrobiologia.ListViews.LParasitologia;
import com.a2stars.parasitologiaemicrobiologia.Models.Theme;
import com.a2stars.parasitologiaemicrobiologia.R;

import java.util.ArrayList;
import java.util.List;

public class ShowListSubject extends AppCompatActivity {
    ListView subjectList;
    private TextView themeId;
    private int identList = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        themeId = findViewById(R.id.themeId);
        List<Theme> listSubjetct = new ArrayList<>();

        if (getIntent().hasExtra("microbiologia")) {
            listSubjetct = LMicrobiologia.getThemes();
            themeId.setText("Microbiologia");
            identList = 1;
        } else if(getIntent().hasExtra("parasitologia")){
            listSubjetct = LParasitologia.getThemes();
            themeId.setText("Parasitologia");
            identList = 2;
        }

        subjectList = findViewById(R.id.subjectList);

        final SubjectAdapter adapter = new SubjectAdapter(listSubjetct, this);
        subjectList.setAdapter(adapter);

        subjectList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent = new Intent(ShowListSubject.this, ShowMenuSubject.class);
                intent.putExtra("id_list", position);
                intent.putExtra("listId", identList);
                startActivity(intent);
            }
        });
    }
}
