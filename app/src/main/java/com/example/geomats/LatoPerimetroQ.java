package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

public class LatoPerimetroQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lato_perimetro_q);

        final EditText perimetroltq = findViewById(R.id.perimetroltq);
        Button inviabuttonplq = findViewById(R.id.inviabuttonplq);
        final TextView numtextlpq = findViewById(R.id.numtextlpq);

        inviabuttonplq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = perimetroltq.getText().toString();
                Double perimetro = null;
                try {
                    perimetro = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextlpq.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    perimetro = null;
                }
                if (perimetro != null){
                    perimetro = perimetro / 4;
                    String risultato = Double.toString(perimetro);
                    numtextlpq.setText(risultato);
                }
            }
        });
    }
}
