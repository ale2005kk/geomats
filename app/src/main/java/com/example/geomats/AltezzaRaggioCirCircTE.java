package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AltezzaRaggioCirCircTE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altezza_raggio_cir_circ_te);

        final EditText raggioalttet = findViewById(R.id.raggioalttet);
        Button inviabuttonaltrteb = findViewById(R.id.inviabuttonaltrteb);
        final TextView numtextaltrtet = findViewById(R.id.numtextaltrtet);

        inviabuttonaltrteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = raggioalttet.getText().toString();
                Double raggio = null;
                try {
                    raggio = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextaltrtet.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                }
                if (raggio != null){
                    Double risultato = null;
                    risultato = (3 / 2) * raggio;
                    String risult = Double.toString(risultato);
                    numtextaltrtet.setText(risult);
                }
            }
        });
    }
}
