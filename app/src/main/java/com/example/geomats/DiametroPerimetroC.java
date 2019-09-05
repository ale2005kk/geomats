package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DiametroPerimetroC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diametro_perimetro_c);

        final EditText perimetrodct = findViewById(R.id.perimetrodct);
        Button inviabuttonpdcb = findViewById(R.id.inviabuttonpdcb);
        final TextView numtextpdct = findViewById(R.id.numtextpdct);

        inviabuttonpdcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = perimetrodct.getText().toString();
                Double perimetro = null;
                try {
                    perimetro = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextpdct.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    perimetro = null;
                }
                if (perimetro != null){
                    perimetro = perimetro / (Math.PI);
                    String risultato = Double.toString(perimetro);
                    numtextpdct.setText(risultato);
                }
            }
        });
    }
}
