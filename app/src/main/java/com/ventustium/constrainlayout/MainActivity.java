package com.ventustium.constrainlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String NAMA = "com.ventustium";

    Button b1;
    EditText et1;

    private View.OnClickListener myClicklListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.button:
                    goToActivity2();
                    break;
            }
        }
    };

    private void goToActivity2() {
        Intent i = new Intent(this, MainActivity2.class);
        //ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this)
        //startActivity(i, options.toBundle());
        i.putExtra("nama", "Budi");
        i.putExtra(NAMA, et1.getText().toString());
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        b1.setOnClickListener(myClicklListener);
        et1 = findViewById(R.id.editTextTextPersonName);
    }
}