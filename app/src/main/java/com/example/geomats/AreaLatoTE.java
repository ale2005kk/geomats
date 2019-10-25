package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaLatoTE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_lato_te);

        final EditText latoatet = findViewById(R.id.latoatet);
        Button inviabuttonalteb = findViewById(R.id.inviabuttonalteb);
        final TextView numtextaltet = findViewById(R.id.numtextaltet);

        inviabuttonalteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = latoatet.getText().toString();
                Double lato = null;
                try {
                    lato = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextaltet.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    lato = null;
                }
                if (lato != null){
                    Double risultato = null;
                    risultato = ((Math.sqrt(3)) / 4) * (lato * lato);
                    String risult = Double.toString(risultato);
                    numtextaltet.setText(risult);
                }
            }
        });
    }
}
