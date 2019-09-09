package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaACAltezzaBT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_acaltezza_b_t);

        final EditText acatt = findViewById(R.id.acatt);
        final EditText altezzabatt = findViewById(R.id.altezzabatt);
        Button inviabuttonacatb = findViewById(R.id.inviabuttonacatb);
        final TextView numtextbacatt = findViewById(R.id.numtextbacatt);

        inviabuttonacatb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = acatt.getText().toString();
                String stringa1 = altezzabatt.getText().toString();
                Double ac = null;
                Double altezzab = null;
                try {
                    ac = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextbacatt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    ac = null;
                }
                try {
                    altezzab = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextbacatt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    altezzab = null;
                }
                if (ac != null && altezzab != null){
                    Double risultato = null;
                    risultato = (ac * altezzab) / 2;
                    String risult = Double.toString(risultato);
                    numtextbacatt.setText(risult);
                }
            }
        });
    }
}
