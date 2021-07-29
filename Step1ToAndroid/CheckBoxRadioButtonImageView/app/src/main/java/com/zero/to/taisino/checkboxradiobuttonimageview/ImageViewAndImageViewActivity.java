package com.zero.to.taisino.checkboxradiobuttonimageview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;

public class ImageViewAndImageViewActivity extends AppCompatActivity {
    RadioButton radNormalRoad,radInfinityRoad;
    ImageView imgRoad;
    ImageButton btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_and_image_button);

        addControls();
        addEvents();
    }

    private void addControls() {
        radInfinityRoad = findViewById(R.id.radInfinityRoad);
        radNormalRoad = findViewById(R.id.radNormalRoad);
        imgRoad = findViewById(R.id.imgRoad);
        btnExit = findViewById(R.id.btnExit);
    }

    private void addEvents() {
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processExit();
            }
        });
        radInfinityRoad.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               if(isChecked){
                   imgRoad.setImageResource(R.drawable.infinity);
               }
            }
        });
        radNormalRoad.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    imgRoad.setImageResource(R.drawable.road);
                }
            }
        });



    }
    private void processExit() {
      finish();
    }
}