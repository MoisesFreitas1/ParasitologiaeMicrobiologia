package com.a2stars.parasitologiaemicrobiologia.ShowActivities;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.a2stars.parasitologiaemicrobiologia.ListViews.LMicrobiologia03;
import com.a2stars.parasitologiaemicrobiologia.ListViews.LMicrobiologia07;
import com.a2stars.parasitologiaemicrobiologia.ListViews.LParasitologia09;
import com.a2stars.parasitologiaemicrobiologia.ListViews.LVoid;
import com.a2stars.parasitologiaemicrobiologia.Models.Question;
import com.a2stars.parasitologiaemicrobiologia.Models.Theme;
import com.a2stars.parasitologiaemicrobiologia.R;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShowQuestion extends AppCompatActivity {
    private TextView textView;
    private TextView temaTextView;
    private TextView enunciadoTextView;
    private TextView enunciado2TextView;
    private TextView textoa1TextView;
    private TextView textob1TextView;
    private TextView textoc1TextView;
    private TextView textod1TextView;
    private TextView corrigir;
    private TextView proxima;
    private ImageView iv_foto;
    private LinearLayout a;
    private LinearLayout b;
    private LinearLayout c;
    private LinearLayout d;
    private int alternativa;
    private int tentativas;
    int[] nquestion;
    int nquestions;
    int m;
    private int opcao;
    private Question question;
    private boolean mark = false;
    private boolean correct = false;
    private Integer idList, listId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_question);

        textView = (TextView) findViewById(R.id.textView);
        temaTextView = (TextView) findViewById(R.id.temaTextView);
        enunciadoTextView = (TextView) findViewById(R.id.enunciadoTextView);
        enunciado2TextView = (TextView) findViewById(R.id.enunciado2TextView);
        textoa1TextView = (TextView) findViewById(R.id.textoa1TextView);
        textob1TextView = (TextView) findViewById(R.id.textob1TextView);
        textoc1TextView = (TextView) findViewById(R.id.textoc1TextView);
        textod1TextView = (TextView) findViewById(R.id.textod1TextView);
        iv_foto = (ImageView) findViewById(R.id.iv_foto);
        corrigir = (TextView) findViewById(R.id.corrigir);
        proxima = (TextView) findViewById(R.id.proxima);
        a = (LinearLayout) findViewById(R.id.a);
        b = (LinearLayout) findViewById(R.id.b);
        c = (LinearLayout) findViewById(R.id.c);
        d = (LinearLayout) findViewById(R.id.d);


        List<Theme> listSubjetct = new ArrayList<>();
        if (getIntent().hasExtra("listId")) {
            listId = getIntent().getIntExtra("listId", 46666);
        }

        if (getIntent().hasExtra("id_list")) {
            idList = getIntent().getIntExtra("id_list", 46666);
        }


        if(listId == 1){
            if(idList == 3){
                nquestions = 3;
            }else if(idList == 7){
                nquestions = 3;
            }
        } else if(listId == 2){
            if(idList == 9){
                nquestions = 3;
            }
        } else {
            nquestions = 2;
        }

        m=0;
        tentativas=0;

//        if (getIntent().hasExtra("virores")) {
//            nquestions = 14;
//        } else if (getIntent().hasExtra("micoses")) {
//            nquestions = 19;
//        } else if (getIntent().hasExtra("parasitoses")) {
//            nquestions = 20;
//        }

        nquestion = new int[nquestions];
        int tquestions [];
        int aux;
        Random random  = new Random();
        tquestions = new int[nquestions];
        for(int b=0;b<nquestions;b++){
            tquestions[b]=b+1;
        }
        for (int n=0;n<nquestions;n++){
            do{
                aux=random.nextInt(nquestions);
                nquestion[n]=tquestions[aux];
            }while(tquestions[aux]==0);
            tquestions[aux]=0;
        }

        textView.setText((m + 1) + " de "+nquestion.length);

        if(listId == 1){
            if(idList == 3){
                question = LMicrobiologia03.getLquestion().get(nquestion[m] - 1);
            }else if(idList == 7){
                question = LMicrobiologia07.getLquestion().get(nquestion[m] - 1);
            }
        } else if(listId == 2){
            if(idList == 9){
                question = LParasitologia09.getLquestion().get(nquestion[m] - 1);
            }
        } else {
            question = LVoid.getLquestion().get(nquestion[m] - 1);
        }

        temaTextView.setText(question.getTema());
        enunciadoTextView.setText(question.getEnunciado());
        iv_foto.setImageResource(question.getFoto());
        enunciado2TextView.setText(question.getEnunciado2());
        textoa1TextView.setText(question.getA());
        textob1TextView.setText(question.getB());
        textoc1TextView.setText(question.getC());
        textod1TextView.setText(question.getD());
        alternativa=question.getGabarito();
        a.setBackgroundColor(Color.parseColor("#FFFFFF"));
        b.setBackgroundColor(Color.parseColor("#FFFFFF"));
        c.setBackgroundColor(Color.parseColor("#FFFFFF"));
        d.setBackgroundColor(Color.parseColor("#FFFFFF"));

            a.setOnClickListener(
                    new View.OnClickListener() {
                        public void onClick(View v) {
                            if(!correct) {
                                a.setBackgroundColor(Color.parseColor("#778899"));
                                b.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                c.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                d.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                opcao = R.id.a;
                                mark = true;
                            }
                        }
                    });
            b.setOnClickListener(
                    new View.OnClickListener() {
                        public void onClick(View v) {
                            if(!correct) {
                                a.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                b.setBackgroundColor(Color.parseColor("#778899"));
                                c.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                d.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                opcao = R.id.b;
                                mark = true;
                            }
                        }
                    });
            c.setOnClickListener(
                    new View.OnClickListener() {
                        public void onClick(View v) {
                            if(!correct) {
                                a.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                b.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                c.setBackgroundColor(Color.parseColor("#778899"));
                                d.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                opcao = R.id.c;
                                mark = true;
                            }
                        }
                    });
            d.setOnClickListener(
                    new View.OnClickListener() {
                        public void onClick(View v) {
                            if(!correct) {
                                a.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                b.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                c.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                d.setBackgroundColor(Color.parseColor("#778899"));
                                opcao = R.id.d;
                                mark = true;
                            }
                        }
                    });

        proxima.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (m == (nquestion.length-1)) {
                    if(mark) {
                        if (opcao == alternativa) {
                            tentativas = tentativas + 1;
                        }
                        AlertDialog.Builder mensagem1 = new AlertDialog.Builder(ShowQuestion.this);
                        mensagem1.setTitle("   Fim da prova");
                        mensagem1.setMessage(tentativas + " acertos");
                        mensagem1.setPositiveButton("Finalizar", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                            }
                        });
                        mensagem1.show();
                        mark = false;
                    } else{
                        Toast.makeText(ShowQuestion.this, "Marque uma alternativa", Toast.LENGTH_SHORT).show();
                    }
                }

                if (m < (nquestion.length-1)) {
                    if(mark) {
                        correct = false;
                        if (opcao == alternativa) {
                            tentativas = tentativas + 1;
                        }
                        a.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        b.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        c.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        d.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        m = m + 1;
                        textView.setText((m + 1) + " de " + nquestion.length);

                        if(listId == 1){
                            if(idList == 3){
                                question = LMicrobiologia03.getLquestion().get(nquestion[m] - 1);
                            }else if(idList == 7){
                                question = LMicrobiologia07.getLquestion().get(nquestion[m] - 1);
                            }
                        } else if(listId == 2){
                            if(idList == 9){
                                question = LParasitologia09.getLquestion().get(nquestion[m] - 1);
                            }
                        } else {
                            question = LVoid.getLquestion().get(nquestion[m] - 1);
                        }

                        temaTextView.setText(question.getTema());
                        enunciadoTextView.setText(question.getEnunciado());
                        iv_foto.setImageResource(question.getFoto());
                        enunciado2TextView.setText(question.getEnunciado2());
                        textoa1TextView.setText(question.getA());
                        textob1TextView.setText(question.getB());
                        textoc1TextView.setText(question.getC());
                        textod1TextView.setText(question.getD());
                        alternativa = question.getGabarito();
                        opcao = question.getGabarito();
                        YoYo.with(Techniques.SlideInRight).duration(900).playOn(findViewById(R.id.cv_list));
                        mark = false;
                    } else{
                        Toast.makeText(ShowQuestion.this, "Marque uma alternativa", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        corrigir.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (mark) {
                    correct = true;
                    if (opcao != alternativa) {
                        if (opcao == R.id.a) {
                            a.setBackgroundColor(Color.parseColor("#F08080"));
                        } else if (opcao == R.id.b) {
                            b.setBackgroundColor(Color.parseColor("#F08080"));
                        } else if (opcao == R.id.c) {
                            c.setBackgroundColor(Color.parseColor("#F08080"));
                        } else if (opcao == R.id.d) {
                            d.setBackgroundColor(Color.parseColor("#F08080"));
                        }
                        if (alternativa == R.id.a) {
                            a.setBackgroundColor(Color.parseColor("#00FA9A"));
                        } else if (alternativa == R.id.b) {
                            b.setBackgroundColor(Color.parseColor("#00FA9A"));
                        } else if (alternativa == R.id.c) {
                            c.setBackgroundColor(Color.parseColor("#00FA9A"));
                        } else if (alternativa == R.id.d) {
                            d.setBackgroundColor(Color.parseColor("#00FA9A"));
                        }
                    }
                    if (opcao == alternativa) {
                        if (opcao == R.id.a) {
                            a.setBackgroundColor(Color.parseColor("#00FA9A"));
                        } else if (opcao == R.id.b) {
                            b.setBackgroundColor(Color.parseColor("#00FA9A"));
                        } else if (opcao == R.id.c) {
                            c.setBackgroundColor(Color.parseColor("#00FA9A"));
                        } else if (opcao == R.id.d) {
                            d.setBackgroundColor(Color.parseColor("#00FA9A"));
                        }
                    }
                } else{
                    Toast.makeText(ShowQuestion.this, "Marque uma alternativa", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
