package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PerimetroAltezzaTE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perimetro_altezza_te);

        final EditText altezzapertet = findViewById(R.id.altezzapertet);
        Button inviabuttonperaltezteb = findViewById(R.id.inviabuttonperaltezteb);
        final TextView numtextperaltezteb = findViewById(R.id.numtextperalteztet);

        inviabuttonperaltezteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = altezzapertet.getText().toString();
                Double altezza = null;
                try {
                    altezza = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextperaltezteb.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    altezza = null;
                }
                if (altezza != null){
                    Double risultato = null;
                    risultato = 2 * altezza * (Math.sqrt(3));
                    String risult = Double.toString(risultato);
                    numtextperaltezteb.setText(risult);
                }
            }
        });
    }
}
