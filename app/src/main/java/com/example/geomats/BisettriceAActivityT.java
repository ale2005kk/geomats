package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BisettriceAActivityT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bisettrice_at);

        final EditText abbisettriceatt = findViewById(R.id.abbisettriceatt);
        final EditText bcbisettriceatt = findViewById(R.id.bcbisettriceatt);
        final EditText cabisettriceatt = findViewById(R.id.cabisettriceatt);
        final EditText semperbisettriceatt = findViewById(R.id.semperbisettriceatt);
        Button inviabuttonbisettriceatb = findViewById(R.id.inviabuttonbisettriceatb);
        final TextView numtextbisettriceatt = findViewById(R.id.numtextbisettriceatt);

        inviabuttonbisettriceatb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = abbisettriceatt.getText().toString();
                String stringa1 = bcbisettriceatt.getText().toString();
                String stringa2 = cabisettriceatt.getText().toString();
                String stringa3 = semperbisettriceatt.getText().toString();
                Double ab = null;
                Double bc = null;
                Double ca = null;
                Double semper = null;
                try {
                    ab = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextbisettriceatt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    ab = null;
                }
                try {
                    bc = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextbisettriceatt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    bc = null;
                }
                try {
                    ca = Double.parseDouble(stringa2);
                }
                catch (Exception e){
                    numtextbisettriceatt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    ca = null;
                }
                try {
                    semper = Double.parseDouble(stringa3);
                }
                catch (Exception e){
                    numtextbisettriceatt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    semper = null;
                }
                if (ab != null && bc != null && ca != null && semper != null){
                    Double risultato = null;
                    risultato = (2 / (ab + ca)) * Math.sqrt(ab * ca * semper * (semper - bc));
                    String risult = Double.toString(risultato);
                    numtextbisettriceatt.setText(risult);
                }
            }
        });
    }
}
