package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AngoloEsternoAT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angolo_esterno_at);

        final EditText angolointernobangestatt = findViewById(R.id.angolointernobangestatt);
        final EditText angolointernocangestatt = findViewById(R.id.angolointernocangestatt);
        Button inviabuttonangestatb = findViewById(R.id.inviabuttonangestatb);
        final TextView numtextangestatt = findViewById(R.id.numtextangestatt);

        inviabuttonangestatb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = angolointernobangestatt.getText().toString();
                String stringa1 = angolointernocangestatt.getText().toString();
                Double anginterb = null;
                Double anginterc = null;
                try {
                    anginterb = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextangestatt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    anginterb = null;
                }
                try {
                    anginterc = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextangestatt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    anginterc = null;
                }
                if (anginterb != null && anginterc != null){
                    Double risultato = anginterb + anginterc;
                    String risult = Double.toString(risultato);
                    numtextangestatt.setText(risult);
                }
            }
        });
    }
}
