package com.example.mypc.btvn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnShow,btnHint;
    ImageButton btnExit1,btnExit2,btnExit3;
    LinearLayout layout1,layout2,layout3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btnExit1.setOnClickListener(this);
        btnExit2.setOnClickListener(this);
        btnExit3.setOnClickListener(this);
        btnShow.setOnClickListener(this);
        btnHint.setOnClickListener(this);

    }

    private void init() {
        btnShow = (Button)findViewById(R.id.btnShow);
        btnHint = (Button)findViewById(R.id.btnHint);
        btnExit1 = (ImageButton)findViewById(R.id.btn_close1);
        btnExit2 = (ImageButton)findViewById(R.id.btn_close2);
        btnExit3 = (ImageButton)findViewById(R.id.btn_close3);
        layout1 = (LinearLayout)findViewById(R.id.layout1);
        layout2 = (LinearLayout)findViewById(R.id.layout2);
        layout3 = (LinearLayout)findViewById(R.id.layout3);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_close1:
                layout1.setVisibility(View.INVISIBLE);break;
            case R.id.btn_close2:
                layout2.setVisibility(View.INVISIBLE);break;
            case R.id.btn_close3:
                layout3.setVisibility(View.INVISIBLE);break;
            case R.id.btnShow:
                layout1.setVisibility(View.VISIBLE);
                layout2.setVisibility(View.VISIBLE);
                layout3.setVisibility(View.VISIBLE);
                break;
            case R.id.btnHint:
                layout1.setVisibility(View.INVISIBLE);
                layout2.setVisibility(View.INVISIBLE);
                layout3.setVisibility(View.INVISIBLE);
                break;
        }
    }
}
