package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BaseDiagAltR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_diag_alt_r);

        final EditText diagonalebrt = findViewById(R.id.diagonalebrt);
        final EditText altezzadbrt = findViewById(R.id.altezzadbrt);
        Button inviabuttonbdarb = findViewById(R.id.inviabuttonbdarb);
        final TextView numtextbdart = findViewById(R.id.numtextbdart);

        inviabuttonbdarb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = diagonalebrt.getText().toString();
                String stringa1 = altezzadbrt.getText().toString();
                Double diagonale = null;
                Double altezza = null;
                try {
                    diagonale = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextbdart.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    diagonale = null;
                }
                try {
                    altezza = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextbdart.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    altezza = null;
                }
                Double risultato = null;
                if (diagonale != null && altezza != null){
                    risultato = Math.sqrt((diagonale * diagonale) - (altezza * altezza));
                    String risult = Double.toString(risultato);
                    numtextbdart.setText(risult);
                }
            }
        });
    }
}
