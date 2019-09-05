package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DiametroRaggioC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diametro_raggio_c);

        final EditText raggiodct = findViewById(R.id.raggiodct);
        Button inviabuttonrdcb = findViewById(R.id.inviabuttonrdcb);
        final TextView numtextrdct = findViewById(R.id.numtextrdct);

        inviabuttonrdcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = raggiodct.getText().toString();
                Double raggio = null;
                try {
                    raggio = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextrdct.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    raggio = null;
                }
                if (raggio != null){
                    raggio = 2 * raggio;
                    String risultato = Double.toString(raggio);
                    numtextrdct.setText(risultato);
                }
            }
        });
    }
}
