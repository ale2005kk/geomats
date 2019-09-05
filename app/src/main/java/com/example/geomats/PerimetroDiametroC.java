package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PerimetroDiametroC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perimetro_diametro_c);

        final EditText diametropct = findViewById(R.id.diametropct);
        Button inviabuttondpcb = findViewById(R.id.inviabuttondpcb);
        final TextView numtextdpct = findViewById(R.id.numtextdpct);

        inviabuttondpcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = diametropct.getText().toString();
                Double diametro = null;
                try {
                    diametro = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextdpct.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    diametro = null;
                }
                if (diametro != null){
                    diametro = ((Math.PI) * diametro);
                    String risultato = Double.toString(diametro);
                    numtextdpct.setText(risultato);
                }
            }
        });
    }
}
