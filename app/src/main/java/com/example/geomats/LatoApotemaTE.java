package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.security.spec.ECField;

public class LatoApotemaTE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lato_apotema_te);

        final EditText apotemaltet = findViewById(R.id.apotemaltet);
        Button inviabuttonlapteb = findViewById(R.id.inviabuttonlapteb);
        final TextView numtextlaptet = findViewById(R.id.numtextlaptet);

        inviabuttonlapteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = apotemaltet.getText().toString();
                Double apotema = null;
                try {
                    apotema = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextlaptet.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    apotema = null;
                }
                if (apotema != null){
                    Double risultato = null;
                    risultato = 2 * apotema * (Math.sqrt(3));
                    String risult = Double.toString(risultato);
                    numtextlaptet.setText(risult);
                }
            }
        });
    }
}
