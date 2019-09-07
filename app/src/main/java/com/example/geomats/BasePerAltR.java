package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BasePerAltR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_per_alt_r);

        final EditText perimetrobrt = findViewById(R.id.perimetrobrt);
        final EditText altezzapbrt = findViewById(R.id.altezzapbrt);
        Button inviabuttonbparb = findViewById(R.id.inviabuttonbparb);
        final TextView numtextbparb = findViewById(R.id.numtextbparb);

        inviabuttonbparb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = perimetrobrt.getText().toString();
                String stringa1 = altezzapbrt.getText().toString();
                Double perimetro = null;
                Double altezza = null;
                try {
                    perimetro = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextbparb.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    perimetro = null;
                }
                try {
                    altezza = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextbparb.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    altezza = null;
                }
                Double risultato = null;
                if (perimetro != null && altezza != null){
                    risultato = (perimetro - (2 * altezza)) / 2;
                    String risult = Double.toString(risultato);
                    numtextbparb.setText(risult);
                }
            }
        });
    }
}
