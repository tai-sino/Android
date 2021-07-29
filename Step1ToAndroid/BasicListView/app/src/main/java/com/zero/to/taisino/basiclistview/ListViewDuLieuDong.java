package com.zero.to.taisino.basiclistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewDuLieuDong extends AppCompatActivity {
    ArrayList<String> arrName;
    ListView lvName;
    ArrayAdapter<String> adapterName;
    Button btnSaveData;
    EditText txtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_du_lieu_dong);

        addControls();
        addEvents();

    }

    private void addControls() {
        btnSaveData = findViewById(R.id.btnSaveData);
        txtName = findViewById(R.id.txtName);
        arrName = new ArrayList<String>();
        adapterName = new ArrayAdapter<String>(ListViewDuLieuDong.this, android.R.layout.simple_list_item_1,arrName);
        lvName = findViewById(R.id.lvName);
        lvName.setAdapter(adapterName);
    }

    private void addEvents() {
        btnSaveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processSaveData();
            }
        });
        lvName.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }

    private void processSaveData() {
        String ten = txtName.getText().toString();
        arrName.add(ten);
        adapterName.notifyDataSetChanged();
        txtName.setText("");
        txtName.requestFocus();
    }
}