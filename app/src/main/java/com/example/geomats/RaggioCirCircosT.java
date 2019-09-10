package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RaggioCirCircosT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raggio_cir_circos_t);

        final EditText abragcircicostt = findViewById(R.id.abragcircicostt);
        final EditText bcragcircircostt = findViewById(R.id.bcragcircircostt);
        final EditText caragcircircostt = findViewById(R.id.caragcircircostt);
        final EditText arearagcircircostt = findViewById(R.id.arearagcircircostt);
        Button inviabuttonragcircircostb = findViewById(R.id.inviabuttonragcircircostb);
        final TextView numtextragcircircostt = findViewById(R.id.numtextragcircircostt);

        inviabuttonragcircircostb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = abragcircicostt.getText().toString();
                String stringa1 = bcragcircircostt.getText().toString();
                String stringa2 = caragcircircostt.getText().toString();
                String stringa3 = arearagcircircostt.getText().toString();
                Double ab = null;
                Double bc = null;
                Double ca = null;
                Double area = null;
                try {
                    ab = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextragcircircostt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    ab = null;
                }
                try {
                    bc = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextragcircircostt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    bc = null;
                }
                try {
                    ca = Double.parseDouble(stringa2);
                }
                catch (Exception e){
                    numtextragcircircostt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    ca = null;
                }
                try {
                    area = Double.parseDouble(stringa3);
                }
                catch (Exception e){
                    numtextragcircircostt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    area = null;
                }
                if (ab != null && bc != null && ca != null && area != null){
                    Double risultato = null;
                    risultato = (ab * bc * ca) / (4 * area);
                    String risult = Double.toString(risultato);
                    numtextragcircircostt.setText(risult);
                }
            }
        });

    }
}
