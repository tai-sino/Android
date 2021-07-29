package com.zero.to.taisino.checkboxradiobuttonimageview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox chk1,chk2,chk3,chk4;
    Button btnChon, btnChangeLayout;
    TextView txtDaChon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }
    private void addControls() {
        chk1 = findViewById(R.id.chk1);
        chk2 = findViewById(R.id.chk2);
        chk3 = findViewById(R.id.chk3);
        chk4 = findViewById(R.id.chk4);
        btnChon = findViewById(R.id.btnChon);
        btnChangeLayout = findViewById(R.id.btnChangeLayout);
        txtDaChon = findViewById(R.id.txtDaChon);
    }
    private void addEvents() {
        btnChon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processChoose();
            }
        });
        btnChangeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processChangeLayout();
            }
        });
    }

    private void processChangeLayout() {
        Intent myIntent = new Intent(MainActivity.this, RadioButtonActivity.class);
        MainActivity.this.startActivity(myIntent);
    }

    private void processChoose() {
        String s = "";
        if (chk1.isChecked()){
            s += chk1.getText().toString()+"\n";
        } if (chk2.isChecked()){
            s += chk2.getText().toString()+"\n";
        } if (chk3.isChecked()){
            s += chk3.getText().toString()+"\n";
        } if (chk4.isChecked()){
            s += chk4.getText().toString()+"\n";
        }
        txtDaChon.setText(s);
    }


}