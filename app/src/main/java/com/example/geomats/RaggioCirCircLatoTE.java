package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RaggioCirCircLatoTE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raggio_cir_circ_lato_te);

        final EditText latortet = findViewById(R.id.latortet);
        Button inviabuttonrlteb = findViewById(R.id.inviabuttonrlteb);
        final TextView numtextrltet = findViewById(R.id.numtextrltet);

        inviabuttonrlteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = latortet.getText().toString();
                Double lato = null;
                try {
                    lato = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextrltet.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    lato = null;
                }
                if (lato != null){
                    Double risultato = null;
                    risultato = ((Math.sqrt(3)) / 3) * lato;
                    String risult = Double.toString(risultato);
                    numtextrltet.setText(risult);
                }
            }
        });
    }
}
