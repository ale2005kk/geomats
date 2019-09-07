package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AltezzaPerBaseR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altezza_per_base_r);

        final EditText basepart = findViewById(R.id.basepart);
        final EditText perimetrobart = findViewById(R.id.perimetrobart);
        Button inviabuttonbparb = findViewById(R.id.inviabuttonbparb);
        final TextView numtextbpart = findViewById(R.id.numtextbpart);

        inviabuttonbparb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = basepart.getText().toString();
                String stringa1 = perimetrobart.getText().toString();
                Double base = null;
                Double perimetro = null;
                try {
                    base = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextbpart.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    base = null;
                }
                try {
                    perimetro = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextbpart.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    perimetro = null;
                }
                if (base != null && perimetro != null){
                    Double risultato = null;
                    risultato = (perimetro - (2 * base)) /2;
                    String risult = Double.toString(risultato);
                    numtextbpart.setText(risult);
                }
            }
        });

    }
}
