package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PerimetroQActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perimetro_q);

        final EditText latotextq = findViewById(R.id.latotextq);
        Button inviabuttonpq = findViewById(R.id.inviabuttonpq);
        final TextView numtext = findViewById(R.id.numtext);

        inviabuttonpq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = latotextq.getText().toString();
                double num = Double.parseDouble(stringa);
                num = num * 4;
                String ris = Double.toString(num);
                numtext.setText(ris);
            }
        });
    }
}
