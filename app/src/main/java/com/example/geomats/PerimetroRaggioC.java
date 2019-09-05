package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PerimetroRaggioC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perimetro_raggio_c);

        final EditText raggiopct = findViewById(R.id.raggiopct);
        Button inviabuttonrpct = findViewById(R.id.inviabuttonrpct);
        final TextView numtextrpct = findViewById(R.id.numtextrpct);

        inviabuttonrpct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = raggiopct.getText().toString();
                Double raggio = null;
                try {
                    raggio = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextrpct.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    raggio = null;
                }
                if (raggio != null){
                    raggio = (2 * (Math.PI) * raggio);
                    String risultato = Double.toString(raggio);
                    numtextrpct.setText(risultato);
                }
            }
        });
    }
}
