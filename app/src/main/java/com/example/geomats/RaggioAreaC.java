package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RaggioAreaC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raggio_area_c);

        final EditText arearct = findViewById(R.id.arearct);
        Button inviabuttonarcb = findViewById(R.id.inviabuttonarcb);
        final TextView numtextarct = findViewById(R.id.numtextarct);

        inviabuttonarcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = arearct.getText().toString();
                Double area = null;
                try {
                    area = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextarct.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    area = null;
                }
                if (area != null){
                    area = (Math.sqrt((area / (Math.PI))));
                    String risultato = Double.toString(area);
                    numtextarct.setText(risultato);
                }
            }
        });
    }
}
