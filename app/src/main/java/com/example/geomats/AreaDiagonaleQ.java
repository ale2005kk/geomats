package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaDiagonaleQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_diagonale_q);

        final EditText areadqt = findViewById(R.id.areadqt);
        Button inviabuttonadqb = findViewById(R.id.inviabuttonadqb);
        final TextView numtextadqb = findViewById(R.id.numtextadqt);

        inviabuttonadqb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = areadqt.getText().toString();
                Double diagonale = Double.parseDouble(stringa);
                diagonale = ((diagonale * diagonale) / 2);
                String risultato = Double.toString(diagonale);
                numtextadqb.setText(risultato);
            }
        });
    }
}
