package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AngoloEsternoCT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angolo_esterno_ct);

        final EditText angolointernoaangestctt = findViewById(R.id.angolointernoaangestctt);
        final EditText angolointernobangestctt = findViewById(R.id.angolointernobangestctt);
        Button inviabuttonangestctb = findViewById(R.id.inviabuttonangestctb);
        final TextView numtextangestctt = findViewById(R.id.numtextangestctt);

        inviabuttonangestctb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = angolointernoaangestctt.getText().toString();
                String stringa1 = angolointernobangestctt.getText().toString();
                Double anginta = null;
                Double angintb = null;
                try {
                    anginta = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextangestctt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    anginta = null;
                }
                try {
                    angintb = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextangestctt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    angintb = null;
                }
                if (anginta != null && angintb != null){
                    Double risultato = null;
                    risultato = anginta + angintb;
                    String risult = Double.toString(risultato);
                    numtextangestctt.setText(risult);
                }
            }
        });
    }
}
