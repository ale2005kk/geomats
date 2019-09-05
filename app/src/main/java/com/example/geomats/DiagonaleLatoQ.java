package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DiagonaleLatoQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagonale_lato_q);

        final EditText latodqt = findViewById(R.id.latodqt);
        Button inviabuttonldqb = findViewById(R.id.inviabuttonldqb);
        final TextView numtextldqt = findViewById(R.id.numtextldqt);

        inviabuttonldqb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = latodqt.getText().toString();
                Double lato = null;
                try {
                    lato = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextldqt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    lato = null;
                }
                if (lato != null){
                    lato = (lato * (Math.sqrt(2)));
                    String risultato = Double.toString(lato);
                    numtextldqt.setText(risultato);
                }
            }
        });
    }
}
