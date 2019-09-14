package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PerimetroRaggioTE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perimetro_raggio_te);

        final EditText raggiocircircpertet = findViewById(R.id.raggiocircircpertet);
        Button inviabuttonperimetrocircircteb = findViewById(R.id.inviabuttonperimetrocircircteb);
        final TextView numtextperimetrocircirctet = findViewById(R.id.numtextperimetrocircirctet);

        inviabuttonperimetrocircircteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = raggiocircircpertet.getText().toString();
                Double raggio = null;
                try {
                    raggio = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextperimetrocircirctet.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    raggio = null;
                }
                if (raggio != null){
                    Double risultato = null;
                    risultato = 3 * (Math.sqrt(3)) * raggio;
                    String risult = Double.toString(risultato);
                    numtextperimetrocircirctet.setText(risult);
                }
            }
        });
    }
}
