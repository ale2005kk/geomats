package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LatoDiagonaleQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lato_diagonale_q);

        final EditText diagonalelqtext = findViewById(R.id.diagonalelqtext);
        Button inviabuttondlq = findViewById(R.id.inviabuttondlq);
        final TextView numtextdlq = findViewById(R.id.numtextdlq);

        inviabuttondlq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = diagonalelqtext.getText().toString();
                Double diagonale = Double.parseDouble(stringa);
                diagonale = (diagonale / (Math.sqrt(2)));
                String risultato = Double.toString(diagonale);
                numtextdlq.setText(risultato);
            }
        });
    }
}
