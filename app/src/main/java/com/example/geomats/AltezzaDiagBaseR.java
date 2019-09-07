package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AltezzaDiagBaseR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altezza_diag_base_r);

        final EditText diagonalebart = findViewById(R.id.diagonalebart);
        final EditText basedart = findViewById(R.id.basedart);
        Button inviabuttonadbrb = findViewById(R.id.inviabuttonadbrb);
        final TextView numtextadbrt = findViewById(R.id.numtextadbrt);

        inviabuttonadbrb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = diagonalebart.getText().toString();
                String stringa1 = basedart.getText().toString();
                Double diagonale = null;
                Double base = null;
                try {
                    diagonale = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextadbrt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    diagonale = null;
                }
                try {
                    base = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextadbrt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    base = null;
                }
                if (diagonale != null && base != null){
                    Double risultato = null;
                    risultato = Math.sqrt((diagonale * diagonale) - (base * base));
                    String risult = Double.toString(risultato);
                    numtextadbrt.setText(risult);
                }
            }
        });
    }
}
