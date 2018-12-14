package com.a2stars.parasitologiaemicrobiologia.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.a2stars.parasitologiaemicrobiologia.Models.Theme;
import com.a2stars.parasitologiaemicrobiologia.R;

import java.util.List;

public class SubjectAdapter extends BaseAdapter {

    private List<Theme> themesList;
    private Context context;
    private LayoutInflater layoutInflater;

    public SubjectAdapter(List<Theme> themesList, Context context) {
        this.themesList = themesList;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return themesList.size();
    }

    @Override
    public Object getItem(int position) {
        return themesList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return themesList.get(position).getIdent();
    }

    @Override
    public View getView(int position, View parent, ViewGroup viewGroup) {
        View item = layoutInflater.inflate(R.layout.item_subject_list, viewGroup, false);

        Theme theme = themesList.get(position);

        TextView titulo = (TextView) item.findViewById(R.id.item_layout_titulo);
        titulo.setText(theme.getTitulo());
        ImageView imagem1 = (ImageView) item.findViewById(R.id.imagem1);
        imagem1.setImageResource(theme.getImagem1());

        return item;
    }
}
