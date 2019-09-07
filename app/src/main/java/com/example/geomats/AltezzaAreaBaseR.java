package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AltezzaAreaBaseR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altezza_area_base_r);

        final EditText areabart = findViewById(R.id.areabart);
        final EditText baseaart = findViewById(R.id.baseaart);
        Button inviabuttonaabrb = findViewById(R.id.inviabuttonaabrb);
        final TextView numtextaabrt = findViewById(R.id.numtextaabrt);

        inviabuttonaabrb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = areabart.getText().toString();
                String stringa1 = baseaart.getText().toString();
                Double area = null;
                Double base = null;
                try {
                    area = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextaabrt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    area = null;
                }
                try {
                    base = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextaabrt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    base = null;
                }
                if (area != null && base != null){
                    Double risultato = null;
                    risultato = area / base;
                    String risult = Double.toString(risultato);
                    numtextaabrt.setText(risult);
                }
            }
        });
    }
}
