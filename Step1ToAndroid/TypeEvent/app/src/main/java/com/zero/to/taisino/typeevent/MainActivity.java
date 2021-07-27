package com.zero.to.taisino.typeevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener{
    EditText txtNumA, txtNumB;
    Button btnMinus, btnMulti,btnDivide, btnLongClick, btnExit;

    View.OnClickListener shareableEvents = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addControls() {
        txtNumA = findViewById(R.id.txtNumA);
        txtNumB = findViewById(R.id.txtNumB);
        btnMinus = findViewById(R.id.btnMinus);
        btnMulti = findViewById(R.id.btnMulti);
        btnDivide = findViewById(R.id.btnDivide);
        btnLongClick = findViewById(R.id.btnLongClick);
        btnExit = findViewById(R.id.btnExit);

    }
    private void addEvents() {
        //anomous listener
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                funcMinus();
            }
        });

        shareableEvents = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.btnMulti){
                    funcMulti();
                }
                else if (v.getId() == R.id.btnDivide)
                {
                    funcDivide();

                }

            }
        };
        //Variable listener ==> shareable variable.
        btnMulti.setOnClickListener(shareableEvents);
        btnDivide.setOnClickListener(shareableEvents);
        //Activity as Listener
        btnLongClick.setOnLongClickListener(this);
        //explicit event listener
        btnExit.setOnClickListener(new ExplicitEventListener());
        btnExit.setOnLongClickListener(new ExplicitEventListener());

    }

    private void funcDivide() {
        double a = Double.parseDouble(txtNumA.getText().toString());
        double b = Double.parseDouble(txtNumB.getText().toString());
        double c = a / b;
        Toast.makeText(MainActivity.this,"Divide = " +c,Toast.LENGTH_LONG).show();
    }

    private void funcMulti() {
        int a = Integer.parseInt(txtNumA.getText().toString());
        int b = Integer.parseInt(txtNumB.getText().toString());
        int c = a * b;
        Toast.makeText(MainActivity.this,"Multiply = " +c,Toast.LENGTH_LONG).show();
    }

    private void funcMinus() {
        int a = Integer.parseInt(txtNumA.getText().toString());
        int b = Integer.parseInt(txtNumB.getText().toString());
        int c = a - b;
        Toast.makeText(MainActivity.this,"Minus = " +c,Toast.LENGTH_LONG).show();
    }


    public void funcSum(View view) {
        int a = Integer.parseInt(txtNumA.getText().toString());
        int b = Integer.parseInt(txtNumB.getText().toString());
        int c = a + b;
        Toast.makeText(MainActivity.this,"Sum = " +c,Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onLongClick(View v) {
        if (v.getId() == R.id.btnLongClick){
            txtNumA.setText("");
            txtNumB.setText("");
        }
        return false;
    }

    public class ExplicitEventListener implements View.OnLongClickListener,View.OnClickListener{

        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.btnExit){
                Toast.makeText(MainActivity.this,"Long Click to Exit",Toast.LENGTH_LONG).show();
                btnExit.setVisibility(View.INVISIBLE);
            }
        }

        @Override
        public boolean onLongClick(View v) {
            if (v.getId() == R.id.btnExit){
                finish();
            }
            return false;
        }
    }
    //subclass
    public void funcChangeNameButton(View view){
        Button btnChangeName = new android.support.v7.widget.AppCompatButton(MainActivity.this){
            @Override
            public boolean performClick() {
                setContentView(R.layout.activity_main);

                addControls();
                addEvents();
                return super.performClick();
            }
        };
        btnChangeName.setText("Changed");
        setContentView(btnChangeName);
    }
}