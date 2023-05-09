package com.example.a20175947_lab3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<ListaMascotas> {
    Context context;
    private ArrayList<Mascota> elements;

    public MyAdapter(ArrayList<Mascota> elements) {
        this.elements = elements;
    }

    @NonNull
    @Override
    public ListaMascotas onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ListaMascotas(LayoutInflater.from(context).inflate(R.layout.item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ListaMascotas holder, int position) {
        holder.nombre.setText(elements.get(position).getNombre());
        holder.descripcion.setText(elements.get(position).getDescripcion());
        holder.dni.setText(elements.get(position).getDni());
        holder.genero.setText(elements.get(position).getGenero());
        holder.dueño.setText(elements.get(position).getDueño());
        holder.ruta.setText(elements.get(position).getRuta());


    }

    @Override
    public int getItemCount() {
        return elements.size();
    }
}
