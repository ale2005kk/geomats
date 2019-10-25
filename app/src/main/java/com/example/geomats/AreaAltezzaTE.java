package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaAltezzaTE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_altezza_te);

        final EditText altezzaatet = findViewById(R.id.altezzaatet);
        Button inviabuttonaateb = findViewById(R.id.inviabuttonaateb);
        final TextView numtextaatet = findViewById(R.id.numtextaatet);

        inviabuttonaateb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = altezzaatet.getText().toString();
                Double altezza = null;
                try {
                    altezza = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextaatet.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    altezza = null;
                }
                if (altezza != null){
                    Double risultato = null;
                    risultato = ((altezza * altezza) / (Math.sqrt(3)));
                    String risult = Double.toString(risultato);
                    numtextaatet.setText(risult);
                }
            }
        });
    }
}
