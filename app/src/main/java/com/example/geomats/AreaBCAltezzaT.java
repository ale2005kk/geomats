package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaBCAltezzaT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_bcaltezza_a_t);

        final EditText bcatt = findViewById(R.id.bcatt);
        final EditText altezzaaat = findViewById(R.id.altezzaaat);
        Button inviabuttonbcatb = findViewById(R.id.inviabuttonbcatb);
        final TextView numtextbcatt = findViewById(R.id.numtextbcatt);

        inviabuttonbcatb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = bcatt.getText().toString();
                String stringa1 = altezzaaat.getText().toString();
                Double bc = null;
                Double altezzaa = null;
                try {
                    bc = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextbcatt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    bc = null;
                }
                try {
                    altezzaa = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextbcatt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    altezzaa = null;
                }
                if (bc != null && altezzaa != null){
                    Double risultato = null;
                    risultato = (bc * altezzaa) / 2;
                    String risult = Double.toString(risultato);
                    numtextbcatt.setText(risult);
                }
            }
        });
    }
}
