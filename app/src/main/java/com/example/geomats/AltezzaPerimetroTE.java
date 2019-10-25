package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AltezzaPerimetroTE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altezza_perimetro_te);

        final EditText perimetroalttet = findViewById(R.id.perimetroalttet);
        Button inviabuttonaltpteb = findViewById(R.id.inviabuttonaltpteb);
        final TextView numtextaltptet = findViewById(R.id.numtextaltptet);

        inviabuttonaltpteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = perimetroalttet.getText().toString();
                Double perimetro = null;
                try {
                    perimetro = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextaltptet.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    perimetro = null;
                }
                if (perimetro != null){
                    Double risultato = null;
                    risultato = (perimetro / (2 * (Math.sqrt(3))));
                    String risult = Double.toString(risultato);
                    numtextaltptet.setText(risult);
                }
            }
        });
    }
}
