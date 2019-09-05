package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class LatoAreaQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lato_area_q);

        final EditText areatextql = findViewById(R.id.areatextql);
        Button inviabuttonalq = findViewById(R.id.inviabuttonalq);
        final TextView numtextalq = findViewById(R.id.numtextalq);

        inviabuttonalq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = areatextql.getText().toString();
                Double area = null;
                try {
                    area = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextalq.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    area = null;
                }
                if (area != null){
                    area = Math.sqrt(area);
                    String risultato = Double.toString(area);
                    numtextalq.setText(risultato);
                }
            }
        });
    }
}
