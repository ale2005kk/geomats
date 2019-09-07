package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DiagonaleRActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagonale_r);

        final EditText basedrt = findViewById(R.id.basedrt);
        final EditText altezzadrt = findViewById(R.id.altezzadrt);
        Button inviabuttondrb = findViewById(R.id.inviabuttondrb);
        final TextView numtextdrt = findViewById(R.id.numtextdrt);

        inviabuttondrb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = basedrt.getText().toString();
                String stringa1 = altezzadrt.getText().toString();
                Double base = null;
                Double altezza = null;
                try {
                    base = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextdrt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    base = null;
                }
                try {
                    altezza = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextdrt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    altezza = null;
                }
                if (base != null && altezza != null){
                    Double risultato = null;
                    risultato = Math.sqrt((base * base) + (altezza * altezza));
                    String risult = Double.toString(risultato);
                    numtextdrt.setText(risult);
                }
            }
        });
    }
}
