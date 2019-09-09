package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaABAltezzaCT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_abaltezza_c_t);

        final EditText abtt = findViewById(R.id.abtt);
        final EditText altezzactt = findViewById(R.id.altezzactt);
        Button inviabuttonaabtb = findViewById(R.id.inviabuttonaabtb);
        final TextView numtextaabtb = findViewById(R.id.numtextaabtb);

        inviabuttonaabtb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = abtt.getText().toString();
                String stringa1 = altezzactt.getText().toString();
                Double ab = null;
                Double altezzac = null;
                try {
                    ab = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextaabtb.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    ab = null;
                }
                try {
                    altezzac = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextaabtb.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    altezzac = null;
                }
                if (ab != null && altezzac != null){
                    Double risultato = null;
                    risultato = (ab * altezzac) / 2;
                    String risult = Double.toString(risultato);
                    numtextaabtb.setText(risult);
                }
            }
        });
    }
}
