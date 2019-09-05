package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DiametroAreaC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diametro_area_c);

        final EditText areadct = findViewById(R.id.areadct);
        Button inviabuttonadcb = findViewById(R.id.inviabuttonadcb);
        final TextView numtextadct = findViewById(R.id.numtextadct);

        inviabuttonadcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = areadct.getText().toString();
                Double area = null;
                try {
                    area = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextadct.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    area = null;
                }
                if (area != null){
                    area = Math.sqrt((4 * area) / (Math.PI));
                    String risultato = Double.toString(area);
                    numtextadct.setText(risultato);
                }
            }
        });
    }
}
