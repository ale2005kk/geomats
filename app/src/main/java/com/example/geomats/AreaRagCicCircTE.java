package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaRagCicCircTE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_rag_cic_circ_te);

        final EditText raggioatet = findViewById(R.id.raggioatet);
        Button inviabuttonarteb = findViewById(R.id.inviabuttonarteb);
        final TextView numtextartet = findViewById(R.id.numtextartet);

        inviabuttonarteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = raggioatet.getText().toString();
                Double raggio = null;
                try {
                    raggio = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextartet.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    raggio = null;
                }
                if (raggio != null){
                    Double risultato = null;
                    risultato = ((3 * (Math.sqrt(3))) / 4) * (raggio * raggio);
                    String risult = Double.toString(risultato);
                    numtextartet.setText(risult);
                }
            }
        });
    }
}
