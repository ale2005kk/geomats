package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AltezzaBActivityT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altezza_bt);

        final EditText areaaltezzabtt = findViewById(R.id.areaaltezzabtt);
        final EditText acaltezzabtt = findViewById(R.id.acaltezzabtt);
        Button inviabuttonacareaaltezzabtriangolob = findViewById(R.id.inviabuttonacareaaltezzabtriangolob);
        final TextView numtextacareaaltezzabtriangolob = findViewById(R.id.numtextacareaaltezzabtriangolob);

        inviabuttonacareaaltezzabtriangolob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = areaaltezzabtt.getText().toString();
                String stringa1 = acaltezzabtt.getText().toString();
                Double area = null;
                Double ac = null;
                try {
                    area = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextacareaaltezzabtriangolob.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    area = null;
                }
                try {
                    ac = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextacareaaltezzabtriangolob.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    ac = null;
                }
                if (area != null && ac != null){
                    Double risultato = null;
                    risultato = (2 * area) / ac;
                    String risult = Double.toString(risultato);
                    numtextacareaaltezzabtriangolob.setText(risult);
                }
            }
        });
    }
}
