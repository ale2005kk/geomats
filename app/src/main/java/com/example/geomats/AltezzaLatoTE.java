package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AltezzaLatoTE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altezza_lato_te);

        final EditText latoalttet  = findViewById(R.id.latoalttet);
        Button inviabuttonaltlteb = findViewById(R.id.inviabuttonaltlteb);
        final TextView numtextaltltet = findViewById(R.id.numtextaltltet);

        inviabuttonaltlteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = latoalttet.getText().toString();
                Double lato = null;
                try {
                    lato = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextaltltet.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    lato = null;
                }
                if (lato != null){
                    Double risultato = null;
                    risultato = (lato * (Math.sqrt(3))) / 2;
                    String risult = Double.toString(risultato);
                    numtextaltltet.setText(risult);
                }
            }
        });
    }
}
