package com.example.a20175947_lab3;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.renderscript.ScriptGroup;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.a20175947_lab3.databinding.FragmentRegistroBinding;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RegistroFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RegistroFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public RegistroFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RegistroFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RegistroFragment newInstance(String param1, String param2) {
        RegistroFragment fragment = new RegistroFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    private Button registrar;
    private EditText nombre;
    private EditText genero;
    private EditText dueño;
    private EditText dni;
    private EditText descripcion;

    private ArrayList<Mascota> mascotaArrayList = new ArrayList<>();
    private HashMap<String, Integer> mascotaDictionary = new HashMap<>();

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        SharedPreferences sharedPreferences = getActivity().getPreferences(Context.MODE_PRIVATE);

        View view = inflater.inflate(R.layout.fragment_registro, container, false);

        // Obtener las referencias a los EditText y al botón
        nombre = view.findViewById(R.id.editTextTextPersonName);
        genero = view.findViewById(R.id.editTextTextPersonName2);
        dueño = view.findViewById(R.id.editTextTextPersonName3);
        dni = view.findViewById(R.id.editTextPhone);
        descripcion = view.findViewById(R.id.editTextTextMultiLine);
        Button addButton = view.findViewById(R.id.registrar);

        // Configurar el botón para agregar los datos ingresados al ArrayList
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre_s = nombre.getText().toString();
                String genero_s = genero.getText().toString();
                String dueño_s = dueño.getText().toString();
                String descripcion_s = descripcion.getText().toString();
                int dni_int = Integer.parseInt(dni.getText().toString());
                Mascota newPerson = new Mascota(nombre_s,genero_s,dueño_s,dni_int,descripcion_s,"");
                //mascotaArrayList.add(newPerson);


                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("nombre_s", newPerson.getNombre());
                editor.putString("genero_s", newPerson.getGenero());
                editor.putString("dueño_s", newPerson.getDueño());
                editor.putString("descripcion_s", newPerson.getDueño());
                editor.putInt("dni_int", newPerson.getDni());
                editor.apply();
                mascotaArrayList.add(newPerson);

                // Limpiar los EditText después de agregar los datos
                //nameEditText.setText("");
                //ageEditText.setText("");

                Toast.makeText(getContext(), "Se registro Correctamente", Toast.LENGTH_SHORT).show();
            }
        });

        return view;



    }
}