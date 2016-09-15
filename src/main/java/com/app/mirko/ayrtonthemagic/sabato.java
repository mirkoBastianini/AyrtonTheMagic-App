package com.app.mirko.ayrtonthemagic;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class sabato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabato);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab1 = (FloatingActionButton) findViewById(R.id.fab1);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goOn = new Intent(sabato.this,domenica.class);
                startActivity(goOn);
            }
        });
        fab1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent goBack = new Intent(sabato.this,venerdi.class);
                startActivity(goBack);
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
