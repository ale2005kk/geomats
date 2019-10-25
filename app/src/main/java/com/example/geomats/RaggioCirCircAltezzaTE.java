package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RaggioCirCircAltezzaTE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raggio_cir_circ_altezza_te);

        final EditText altezzartet = findViewById(R.id.altezzartet);
        Button inviabuttonraltteb = findViewById(R.id.inviabuttonraltteb);
        final TextView numtextralttet = findViewById(R.id.numtextralttet);

        inviabuttonraltteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = altezzartet.getText().toString();
                Double altezza = null;
                try {
                    altezza = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextralttet.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    altezza = null;
                }
                if (altezza != null){
                    Double risultato = null;
                    risultato = (2 /3) * altezza;
                    String risult = Double.toString(risultato);
                    numtextralttet.setText(risult);
                }
            }
        });
    }
}
