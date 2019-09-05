package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RaggioDiametroC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raggio_diametro_c);

        final EditText diametrorct = findViewById(R.id.diametrorct);
        Button inviabuttondrct = findViewById(R.id.inviabuttondrct);
        final TextView numtextdrct = findViewById(R.id.numtextdrct);

        inviabuttondrct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = diametrorct.getText().toString();
                Double diametro = null;
                try {
                    diametro = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextdrct.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    diametro = null;
                }
                if (diametro != null){
                    diametro = diametro / 2;
                    String risultato = Double.toString(diametro);
                    numtextdrct.setText(risultato);
                }
            }
        });
    }
}
