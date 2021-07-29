package com.zero.to.taisino.basiclistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewDuLieuCoDinh extends AppCompatActivity {

    String[] arrThu;
    ArrayAdapter<String> adapterThu;
    ListView lvThu;
    Button btnNextActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list_view_du_lieu_co_dinh);

        addControls();
        addEvents();
    }
    private void addControls() {

    arrThu = getResources().getStringArray(R.array.arrThu);
    //Activity + android la các teamplate có sẵn trong android + arrString
    adapterThu = new ArrayAdapter<String>(ListViewDuLieuCoDinh.this, android.R.layout.simple_list_item_1,arrThu);
    lvThu = findViewById(R.id.lvThu);
    lvThu.setAdapter(adapterThu);
    btnNextActivity = findViewById(R.id.btnNextActivity);
    }
    private void addEvents() {
        lvThu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewDuLieuCoDinh.this, "Bạn chọn [" + arrThu[position] + "]", Toast.LENGTH_SHORT).show();
            }
        });
        btnNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListViewDuLieuCoDinh.this,ListViewDuLieuDong.class);
                ListViewDuLieuCoDinh.this.startActivity(intent);
            }
        });
    }


}