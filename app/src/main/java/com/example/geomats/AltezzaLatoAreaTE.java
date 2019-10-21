package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AltezzaLatoAreaTE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altezza_lato_area_te);

        final EditText altezzalatoatet = findViewById(R.id.altezzalatoatet);
        final EditText latoaltezzaatet = findViewById(R.id.latoaltezzaatet);
        Button inviabuttonaltezzalatoateb = findViewById(R.id.inviabuttonaltezzalatoateb);
        final TextView numtextaltezzalatoatet = findViewById(R.id.numtextaltezzalatoatet);

        inviabuttonaltezzalatoateb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = altezzalatoatet.getText().toString();
                String stringa1 = latoaltezzaatet.getText().toString();
                Double altezza = null;
                Double lato = null;
                try {
                    altezza = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextaltezzalatoatet.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                }
                try {
                    lato = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextaltezzalatoatet.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                }
                if (altezza != null && lato != null){
                    Double risultato = null;
                    risultato = (altezza * lato) / 2;
                    String risult = Double.toString(risultato);
                    numtextaltezzalatoatet.setText(risult);
                }
            }
        });
    }
}
