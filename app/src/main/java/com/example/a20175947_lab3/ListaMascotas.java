package com.example.a20175947_lab3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListaMascotas extends RecyclerView.ViewHolder {
    TextView nombre,genero,dueño,dni,descripcion,ruta ;

    public ListaMascotas(@NonNull View itemView) {
        super(itemView);
        nombre=itemView.findViewById(R.id.mascota_l);
        genero=itemView.findViewById(R.id.genero_l);
        dueño=itemView.findViewById(R.id.dueño_l);
        dni=itemView.findViewById(R.id.dni_l);
        descripcion=itemView.findViewById(R.id.descripcion_l);
        ruta=itemView.findViewById(R.id.ruta_l);
    }






}














