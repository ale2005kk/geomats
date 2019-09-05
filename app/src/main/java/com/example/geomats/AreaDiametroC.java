package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaDiametroC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_diametro_c);

        final EditText diametroact = findViewById(R.id.diametroact);
        Button inviabuttondacb = findViewById(R.id.inviabuttondacb);
        final TextView numtextdact = findViewById(R.id.numtextdact);

        inviabuttondacb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = diametroact.getText().toString();
                Double diametro = null;
                try {
                    diametro = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextdact.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    diametro = null;
                }
                if (diametro != null){
                    diametro = ((Math.PI) * ((diametro / 2) * (diametro / 2)));
                    String risultato = Double.toString(diametro);
                    numtextdact.setText(risultato);
                }
            }
        });
    }
}
