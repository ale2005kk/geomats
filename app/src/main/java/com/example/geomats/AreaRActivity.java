package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaRActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_r);

        final EditText altezzaart = findViewById(R.id.altezzaart);
        final EditText baseart = findViewById(R.id.baseart);
        Button inviabuttonarb = findViewById(R.id.inviabuttonarb);
        final TextView numtextart = findViewById(R.id.numtextart);

        inviabuttonarb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = altezzaart.getText().toString();
                String stringa1 = baseart.getText().toString();
                Double altezza = null;
                Double base = null;
                try {
                    altezza = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextart.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    altezza = null;
                }
                try {
                    base = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextart.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    base = null;
                }
                Double risultato = null;
                if (altezza != null && base != null){
                    risultato = base * altezza;
                    String risult = Double.toString(risultato);
                    numtextart.setText(risult);
                }
            }
        });
    }
}
