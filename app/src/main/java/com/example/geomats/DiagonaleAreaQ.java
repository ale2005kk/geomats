package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DiagonaleAreaQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagonale_area_q);

        final EditText areadqt = findViewById(R.id.areadqt);
        Button inviabuttonadqb = findViewById(R.id.inviabuttonadqb);
        final TextView numtextadqte = findViewById(R.id.numtextadqte);

        inviabuttonadqb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = areadqt.getText().toString();
                Double area = Double.parseDouble(stringa);
                area = Math.sqrt(2 * (area));
                String risultato = Double.toString(area);
                numtextadqte.setText(risultato);
            }
        });
    }
}
