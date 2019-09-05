package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaLatoQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_lato_q);

        final EditText arealqt = findViewById(R.id.arealqt);
        Button invialqt = findViewById(R.id.inviabuttonalqb);
        final TextView numtextalqt = findViewById(R.id.numtextalqt);

        invialqt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = arealqt.getText().toString();
                Double lato = null;
                try {
                    lato = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextalqt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    lato = null;
                }
                if (lato != null){
                    lato = lato * lato;
                    String risultato = Double.toString(lato);
                    numtextalqt.setText(risultato);
                }
            }
        });
    }
}
