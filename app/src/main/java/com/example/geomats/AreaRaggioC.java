package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaRaggioC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_raggio_c);

        final EditText raggioact = findViewById(R.id.raggioact);
        Button inviabuttonracb = findViewById(R.id.inviabuttonracb);
        final TextView numtextract = findViewById(R.id.numtextract);

        inviabuttonracb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = raggioact.getText().toString();
                Double raggio = null;
                try {
                    raggio = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextract.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    raggio = null;
                }
                if (raggio != null){
                    raggio = (Math.PI * (raggio * raggio));
                    String risultato = Double.toString(raggio);
                    numtextract.setText(risultato);
                }
            }
        });
    }
}
