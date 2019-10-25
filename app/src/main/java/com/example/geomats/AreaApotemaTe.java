package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaApotemaTe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_apotema_te);

        final EditText apotematet = findViewById(R.id.apotematet);
        Button inviabuttonaapteb = findViewById(R.id.inviabuttonaapteb);
        final TextView numtextaaptet = findViewById(R.id.numtextaaptet);

        inviabuttonaapteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = apotematet.getText().toString();
                Double apotema = null;
                try {
                    apotema = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextaaptet.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    apotema = null;
                }
                if (apotema != null){
                    Double risultato = null;
                    risultato = 3 * (apotema * apotema) * (Math.sqrt(3));
                    String risult = Double.toString(risultato);
                    numtextaaptet.setText(risult);
                }
            }
        });
    }
}
