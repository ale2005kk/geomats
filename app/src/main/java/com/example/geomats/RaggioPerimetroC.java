package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RaggioPerimetroC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raggio_perimetro_c);

        final EditText perimetrorct = findViewById(R.id.perimetrorct);
        Button inviabuttonprcb = findViewById(R.id.inviabuttonprcb);
        final TextView numtextprct = findViewById(R.id.numtextprct);

        inviabuttonprcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = perimetrorct.getText().toString();
                Double perimetro = null;
                try {
                    perimetro = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextprct.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    perimetro = null;
                }
                if (perimetro != null){
                    perimetro = (perimetro / (2 * (Math.PI)));
                    String risultato = Double.toString(perimetro);
                    numtextprct.setText(risultato);
                }
            }
        });
    }
}
