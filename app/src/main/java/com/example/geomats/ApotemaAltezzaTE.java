package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ApotemaAltezzaTE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apotema_altezza_te);

        final EditText altezzaaptet = findViewById(R.id.altezzaaptet);
        Button inviabuttonaapteb = findViewById(R.id.inviabuttonaapteb);
        final TextView numtextaaptet = findViewById(R.id.numtextaaptet);

        inviabuttonaapteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = altezzaaptet.getText().toString();
                Double altezza = null;
                try {
                    altezza = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextaaptet.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    altezza = null;
                }
                if (altezza != null){
                    Double risultato = null;
                    risultato = (1 /3) * altezza;
                    String risult = Double.toString(risultato);
                    numtextaaptet.setText(risult);
                }
            }
        });
    }
}
