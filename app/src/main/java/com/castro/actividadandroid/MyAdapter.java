package com.castro.actividadandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.viewHolderDatos>
{
    Context context;
    ArrayList<Serie> serieLista;

    public MyAdapter(Context context, ArrayList<Serie> serieLista) {
        this.context = context;
        this.serieLista = serieLista;
    }

    @NonNull
    @Override
    public viewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_simple,parent,false);
        return new viewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderDatos holder, int position) {
        holder.txtSerie.setText(serieLista.get(position).getNombre());
        holder.txtGenero.setText(serieLista.get(position).getGenero());
        holder.txtValoracion.setText(serieLista.get(position).getValoracion());

    }

    @Override
    public int getItemCount() {
        return serieLista.size();
    }

    public class viewHolderDatos extends RecyclerView.ViewHolder {
        TextView txtSerie,txtGenero,txtValoracion;

        public viewHolderDatos(@NonNull View itemView) {
            super(itemView);
            txtSerie = itemView.findViewById(R.id.txtSerie);
            txtGenero = itemView.findViewById(R.id.txtGenero);
            txtValoracion = itemView.findViewById(R.id.txtValoracion);
        }
    }
}
