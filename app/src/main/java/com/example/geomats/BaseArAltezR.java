package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BaseArAltezR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_ar_altez_r);

        final EditText areabrt = findViewById(R.id.areabrt);
        final EditText altezzabrt = findViewById(R.id.altezzabrt);
        Button inviabuttonbaarb = findViewById(R.id.inviabuttonbaarb);
        final TextView numtextbaart = findViewById(R.id.numtextbaart);

        inviabuttonbaarb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = areabrt.getText().toString();
                String stringa1 = altezzabrt.getText().toString();
                Double area = null;
                Double altezza = null;
                try {
                    area = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextbaart.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    area = null;
                }
                try {
                    altezza = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextbaart.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    altezza = null;
                }
                Double risultato = null;
                if (area != null && altezza != null){
                    risultato = area / altezza;
                    String risult = Double.toString(risultato);
                    numtextbaart.setText(risult);
                }
            }
        });
    }
}
