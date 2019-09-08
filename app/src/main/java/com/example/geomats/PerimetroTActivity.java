package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PerimetroTActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perimetro_t);

        final EditText abptt = findViewById(R.id.abptt);
        final EditText bcptt = findViewById(R.id.bcptt);
        final EditText captt = findViewById(R.id.captt);
        Button inviabuttonptb = findViewById(R.id.inviabuttonptb);
        final TextView numtextptt = findViewById(R.id.numtextptt);

        inviabuttonptb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = abptt.getText().toString();
                String stringa1 = bcptt.getText().toString();
                String stringa2 = captt.getText().toString();
                Double ab = null;
                Double bc = null;
                Double ca = null;
                try {
                    ab = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextptt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    ab = null;
                }
                try {
                    bc = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextptt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    bc = null;
                }
                try {
                    ca = Double.parseDouble(stringa2);
                }
                catch (Exception e){
                    numtextptt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    ca = null;
                }
                if (ab != null && bc != null && ca != null){
                    Double risultato = null;
                    risultato = ab + bc + ca;
                    String risult = Double.toString(risultato);
                    numtextptt.setText(risult);
                }
            }
        });
    }
}
