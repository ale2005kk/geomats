package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LatoPerimetroTE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lato_perimetro_te);

        final EditText perimetroltet = findViewById(R.id.perimetroltet);
        Button inviabuttonlpteb = findViewById(R.id.inviabuttonlpteb);
        final TextView numtextalptet = findViewById(R.id.numtextalptet);

        inviabuttonlpteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = perimetroltet.getText().toString();
                Double perimetro = null;
                try {
                    perimetro = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextalptet.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    perimetro = null;
                }
                if (perimetro != null){
                    Double risultato = null;
                    risultato = perimetro / 3;
                    String risult = Double.toString(risultato);
                    numtextalptet.setText(risult);
                }
            }
        });
    }
}
