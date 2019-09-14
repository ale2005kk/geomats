package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PerimetroApotemaTE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perimetro_apotema_te);

        final EditText apotemapertet = findViewById(R.id.apotemapertet);
        Button inviabuttonperapotemateb = findViewById(R.id.inviabuttonperapotemateb);
        final TextView numtextperapotematet = findViewById(R.id.numtextperapotematet);

        inviabuttonperapotemateb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = apotemapertet.getText().toString();
                Double apotema = null;
                try {
                    apotema = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextperapotematet.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    apotema = null;
                }
                if (apotema != null){
                    Double risultato = null;
                    risultato = 6 * apotema * (Math.sqrt(3));
                    String risult = Double.toString(risultato);
                    numtextperapotematet.setText(risult);
                }
            }
        });
    }
}
