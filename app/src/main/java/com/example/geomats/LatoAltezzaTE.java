package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LatoAltezzaTE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lato_altezza_te);

        final EditText altezzaltet = findViewById(R.id.altezzaltet);
        Button inviabuttonlateb = findViewById(R.id.inviabuttonlateb);
        final TextView numtextlatet = findViewById(R.id.numtextlatet);

        inviabuttonlateb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = altezzaltet.getText().toString();
                Double altezza = null;
                try {
                    altezza = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextlatet.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    altezza = null;
                }
                if (altezza != null){
                    Double risultato = null;
                    risultato = (2 * altezza) / (Math.sqrt(3));
                    String risult = Double.toString(risultato);
                    numtextlatet.setText(risult);
                }
            }
        });
    }
}
