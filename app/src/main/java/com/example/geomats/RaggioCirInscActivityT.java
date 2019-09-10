package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RaggioCirInscActivityT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raggio_cir_insc_t);

        final EditText arearaggiocircinsctt = findViewById(R.id.arearaggiocircinsctt);
        final EditText perimetroraggiocircinsctt = findViewById(R.id.perimetroraggiocircinsctt);
        Button inviabuttonraggiocircinsctb = findViewById(R.id.inviabuttonraggiocircinsctb);
        final TextView numtextraggiocircinsctt = findViewById(R.id.numtextraggiocircinsctt);

        inviabuttonraggiocircinsctb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = arearaggiocircinsctt.getText().toString();
                String stringa1 = perimetroraggiocircinsctt.getText().toString();
                Double area = null;
                Double perimetro = null;
                try {
                    area = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextraggiocircinsctt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    area = null;
                }
                try {
                    perimetro = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextraggiocircinsctt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    perimetro = null;
                }
                if (area != null  && perimetro != null){
                    Double risultato = null;
                    risultato = (2 * area) / perimetro;
                    String risult = Double.toString(risultato);
                    numtextraggiocircinsctt.setText(risult);
                }
            }
        });
    }
}
