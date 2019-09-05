package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PerimetroRActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perimetro_r);

        final EditText altezzaprt = findViewById(R.id.altezzaprt);
        final EditText baseprt = findViewById(R.id.baseprt);
        Button inviabuttonprb = findViewById(R.id.inviabuttonprb);
        final TextView numtextprt = findViewById(R.id.numtextprt);

        inviabuttonprb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = altezzaprt.getText().toString();
                String stringa1 = baseprt.getText().toString();
                Double altezza = null;
                Double base = null;
                try {
                    altezza = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextprt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    altezza = null;
                }
                try {
                    base = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextprt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    base = null;
                }
                Double risultato = null;
                if (altezza != null && base != null){
                    risultato = (2 * altezza) + (2 * base);
                    String risult = Double.toString(risultato);
                    numtextprt.setText(risult);
                }
            }
        });

    }
}
