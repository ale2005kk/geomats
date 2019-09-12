package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BisettriceCActivityT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bisettrice_ct);

        final EditText abbisettricectt = findViewById(R.id.abbisettricectt);
        final EditText bcbisettricectt = findViewById(R.id.bcbisettricectt);
        final EditText cabisettricectt = findViewById(R.id.cabisettricectt);
        final EditText semperbisettricectt = findViewById(R.id.semperbisettricectt);
        Button inviabuttonbisettricectb = findViewById(R.id.inviabuttonbisettricectb);
        final TextView numtextbisettricectt = findViewById(R.id.numtextbisettricectt);

        inviabuttonbisettricectb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = abbisettricectt.getText().toString();
                String stringa1 = bcbisettricectt.getText().toString();
                String stringa2 = cabisettricectt.getText().toString();
                String stringa3 = semperbisettricectt.getText().toString();
                Double ab = null;
                Double bc = null;
                Double ca = null;
                Double semper = null;
                try {
                    ab = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextbisettricectt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    ab = null;
                }
                try {
                    bc = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextbisettricectt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    bc = null;
                }
                try {
                    ca = Double.parseDouble(stringa2);
                }
                catch (Exception e){
                    numtextbisettricectt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    ca = null;
                }
                try {
                    semper = Double.parseDouble(stringa3);
                }
                catch (Exception e){
                    numtextbisettricectt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    semper = null;
                }
                if (ab != null && bc != null && ca != null && semper != null){
                    Double risultato = null;
                    risultato = (2 / (ca + bc)) * Math.sqrt(ca * bc * semper * (semper - ab));
                    String risult = Double.toString(risultato);
                    numtextbisettricectt.setText(risult);
                }
            }
        });
    }
}
