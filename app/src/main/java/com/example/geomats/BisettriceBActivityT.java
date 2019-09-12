package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BisettriceBActivityT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bisettrice_bt);

        final EditText abbisettricebtt = findViewById(R.id.abbisettricebtt);
        final EditText bcbisettricebtt = findViewById(R.id.bcbisettricebtt);
        final EditText cabisettricebtt = findViewById(R.id.cabisettricebtt);
        final EditText semperbisettricebtt = findViewById(R.id.semperbisettricebtt);
        Button inviabuttonbisettricebtb = findViewById(R.id.inviabuttonbisettricebtb);
        final TextView numtextbisettricebtt = findViewById(R.id.numtextbisettricebtt);

        inviabuttonbisettricebtb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = abbisettricebtt.getText().toString();
                String stringa1 = bcbisettricebtt.getText().toString();
                String stringa2 = cabisettricebtt.getText().toString();
                String stringa3 = semperbisettricebtt.getText().toString();
                Double ab = null;
                Double bc = null;
                Double ca = null;
                Double semper = null;
                try {
                    ab = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextbisettricebtt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    ab = null;
                }
                try {
                    bc = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextbisettricebtt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    bc = null;
                }
                try {
                    ca = Double.parseDouble(stringa2);
                }
                catch (Exception e){
                    numtextbisettricebtt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    ca = null;
                }
                try {
                    semper = Double.parseDouble(stringa3);
                }
                catch (Exception e){
                    numtextbisettricebtt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    semper = null;
                }
                if (ab != null && bc != null && ca != null && semper != null){
                    Double risultato = null;
                    risultato = (2 / (ab + bc)) * Math.sqrt(ab * bc * semper * (semper - ca));
                    String risult = Double.toString(risultato);
                    numtextbisettricebtt.setText(risult);
                }
            }
        });
    }
}
