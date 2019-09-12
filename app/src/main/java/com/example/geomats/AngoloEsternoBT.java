package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AngoloEsternoBT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angolo_esterno_bt);

        final EditText angolointernoaangestbtt = findViewById(R.id.angolointernoaangestbtt);
        final EditText angolointernocangestbtt = findViewById(R.id.angolointernocangestbtt);
        Button inviabuttonangestbtb = findViewById(R.id.inviabuttonangestbtb);
        final TextView numtextangestbtt = findViewById(R.id.numtextangestbtt);

        inviabuttonangestbtb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = angolointernoaangestbtt.getText().toString();
                String stringa1 = angolointernocangestbtt.getText().toString();
                Double anginta = null;
                Double angintc = null;
                try {
                    anginta = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextangestbtt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    anginta = null;
                }
                try {
                    angintc = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextangestbtt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    angintc = null;
                }
                if (anginta != null && angintc != null){
                    Double risultato = null;
                    risultato = anginta + angintc;
                    String risult = Double.toString(risultato);
                    numtextangestbtt.setText(risult);
                }
            }
        });
    }
}
