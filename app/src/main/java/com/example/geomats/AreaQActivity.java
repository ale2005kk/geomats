package com.example.geomats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AreaQActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_q);

        Button latoqab = findViewById(R.id.latoqab);
        latoqab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                latoqabstart();
            }
        });

        Button diagonaleqab = findViewById(R.id.diagonaleqab);
        diagonaleqab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diagonaleqabstart();
            }
        });
    }
    public void latoqabstart(){
        Intent intent = new Intent(this, AreaLatoQ.class);
        startActivity(intent);
    }
    public void diagonaleqabstart(){
        Intent intent = new Intent(this, AreaDiagonaleQ.class);
        startActivity(intent);
    }
}
