package com.ventustium.constrainlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    String namaku;
    Button b2;
    TextView tv1;

    private View.OnClickListener MyCliclListener2 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.button2:
                    goToActivity1();
                    break;
            }

        }
    };

    private void goToActivity1() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv1 = findViewById(R.id.textView2);
        b2 = findViewById(R.id.button2);
        b2.setOnClickListener(MyCliclListener2);
        Intent I = getIntent();
        namaku = I.getStringExtra(MainActivity.NAMA);
        tv1.setText(namaku);
    }
}