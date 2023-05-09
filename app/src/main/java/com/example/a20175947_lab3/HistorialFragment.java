package com.example.a20175947_lab3;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class HistorialFragment extends Fragment {

    private ArrayList<Mascota> elements;

    public HistorialFragment() {
        // Required empty public constructor
    }



    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_historial, container, false);
        recyclerView = view.findViewById(R.id.listRecyclerView);

        // Inflate the layout for this fragment
        elements = new ArrayList<>();
        elements.add(new Mascota("as","masc","pepe",789456,"buenardo","lima"));
        elements.add(new Mascota("assss","masc","pepe",789456,"buenardo","lima"));
        elements.add(new Mascota("asqweqweq","masc","pepe",789456,"buenardo","lima"));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new MyAdapter(elements));



        return view;
    }



}