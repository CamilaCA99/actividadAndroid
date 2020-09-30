package com.castro.actividadandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pantallaMenu extends AppCompatActivity {

    private Button btnRegistrar, btnVer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_menu);

        btnRegistrar = findViewById(R.id.btnRegistrar);
        btnVer = findViewById(R.id.btnVer);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentRegistrar = new Intent(pantallaMenu.this,MainActivity.class);
                startActivity(intentRegistrar);
            }
        });
        btnVer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVer = new Intent(pantallaMenu.this,pantallaRecycler.class);
                startActivity(intentVer);
            }
        });
    }
}