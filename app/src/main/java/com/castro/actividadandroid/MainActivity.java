package com.castro.actividadandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.net.sip.SipSession;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre;
    private Spinner spinner;
    private RatingBar ratingBar;
    private CheckBox checkBox;
    private Button btnGuardar;

    static ArrayList<Serie> serieLista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = findViewById(R.id.txtNombre);
        spinner = findViewById(R.id.spinner);
        ratingBar = findViewById(R.id.ratingBar);
        checkBox = findViewById(R.id.checkBox);
        btnGuardar = findViewById(R.id.btnGuardar);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource
                (MainActivity.this,R.array.genero,android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = txtNombre.getText().toString();
                String genero = spinner.getSelectedItem().toString();
                String valoracion = Float.toString(ratingBar.getRating());

                Serie serie = new Serie (nombre,genero,valoracion);
                serieLista.add(serie);

            }
        });
    }

}