package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ApotemaLatoTE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apotema_lato_te);

        final EditText latoaptet = findViewById(R.id.latoaptet);
        Button inviabuttonaplteb = findViewById(R.id.inviabuttonaplteb);
        final TextView numtextapltet = findViewById(R.id.numtextapltet);

        inviabuttonaplteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = latoaptet.getText().toString();
                Double lato = null;
                try {
                    lato = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextapltet.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    lato = null;
                }
                if (lato != null){
                    Double risultato = null;
                    risultato = (1 / (2 * (Math.sqrt(3)))) * lato;
                    String risult = Double.toString(risultato);
                    numtextapltet.setText(risult);
                }
            }
        });
    }
}
