package com.zero.to.taisino.checkboxradiobuttonimageview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class RadioButtonActivity extends AppCompatActivity {
    TextView txtResult;
    Button btnChoose, btnChangeLayout2;
    RadioButton radSuccesser, radFailer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        addControls();
        addEvents();

    }



    private void addControls() {
        txtResult = findViewById(R.id.txtResult);
        radSuccesser = findViewById(R.id.radSuccesser);
        radFailer = findViewById(R.id.radFailer);
        btnChoose = findViewById(R.id.btnChoose);
        btnChangeLayout2 = findViewById(R.id.btnChangeLayout2);
    }
    private void addEvents() {
        btnChoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processRadChosen();
            }
        });
        btnChangeLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processChangeLayout2();
            }
        });
    }

    private void processChangeLayout2() {
        Intent intent = new Intent(RadioButtonActivity.this, ImageViewAndImageViewActivity.class);
        RadioButtonActivity.this.startActivity(intent);
    }

    private void processRadChosen() {
        if (radFailer.isChecked()){
            txtResult.setText("Hãy cố gắng. Bạn sẽ trỡ thành người thành công!!");
        }
        else
        {
            txtResult.setText("Bạn đã chon làm người thất bại. Bạn sẽ thất bại!!");
        }
    }
}