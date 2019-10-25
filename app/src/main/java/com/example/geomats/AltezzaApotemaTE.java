package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AltezzaApotemaTE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altezza_apotema_te);

        final EditText apotemaalttet = findViewById(R.id.apotemaalttet);
        Button inviabuttonaltapteb = findViewById(R.id.inviabuttonaltapteb);
        final TextView numtextaltaptet = findViewById(R.id.numtextaltaptet);

        inviabuttonaltapteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = apotemaalttet.getText().toString();
                Double apotema = null;
                try {
                    apotema = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextaltaptet.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                }
                if (apotema != null){
                    Double risultato = null;
                    risultato = 3 * apotema;
                    String risult = Double.toString(risultato);
                    numtextaltaptet.setText(risult);
                }
            }
        });
    }
}
