package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PerimetroLatoTE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perimetro_lato_te);

        final EditText latopertet = findViewById(R.id.latopertet);
        Button inviabuttonlatoperteb = findViewById(R.id.inviabuttonlatoperteb);
        final TextView numtextlatoperteb = findViewById(R.id.numtextlatopertet);

        inviabuttonlatoperteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = latopertet.getText().toString();
                Double lato = null;
                try {
                    lato = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextlatoperteb.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    lato = null;
                }
                if (lato != null){
                    Double risultato = null;
                    risultato = 3 * lato;
                    String risult = Double.toString(risultato);
                    numtextlatoperteb.setText(risult);
                }
            }
        });
    }
}
