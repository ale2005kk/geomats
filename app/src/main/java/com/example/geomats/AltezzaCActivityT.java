package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AltezzaCActivityT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altezza_ct);

        final EditText areaaltezzactt = findViewById(R.id.areaaltezzactt);
        final EditText abaltezzactt = findViewById(R.id.abaltezzactt);
        Button inviabuttonabareaaltezzactriangolob = findViewById(R.id.inviabuttonabareaaltezzactriangolob);
        final TextView numtextabareaaltezzactriangolot = findViewById(R.id.numtextabareaaltezzactriangolot);

        inviabuttonabareaaltezzactriangolob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = areaaltezzactt.getText().toString();
                String stringa1 = abaltezzactt.getText().toString();
                Double area = null;
                Double ab = null;
                try {
                    area = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextabareaaltezzactriangolot.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    area = null;
                }
                try {
                    ab = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextabareaaltezzactriangolot.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    ab = null;
                }
                if (area != null && ab != null){
                    Double risultato = null;
                    risultato = (2 * area) / ab;
                    String risult = Double.toString(risultato);
                    numtextabareaaltezzactriangolot.setText(risult);
                }
            }
        });
    }
}
