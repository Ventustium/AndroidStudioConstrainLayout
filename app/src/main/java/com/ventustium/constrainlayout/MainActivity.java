package com.ventustium.constrainlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String NAMA = "com.ventustium";

    Button b1, b3, b4;
    EditText et1;

    private View.OnClickListener myClicklListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.button:
                    goToActivity2();
                    break;
                case R.id.button3:
                    callNumber();
                    break;
                case R.id.button4:
                    browseTo();
                    break;
            }
        }
    };

    private void callNumber() {
        Log.d("INTENT", "Entering call Number");
        Intent cIntent = new Intent(Intent.ACTION_DIAL);
        String phoneNum = et1.getText().toString();
        cIntent.setData(Uri.parse("tel:"+phoneNum));
        Log.d("INTENT", "Entering call Number");
        startActivity(cIntent);
    }

    private void browseTo() {
        Intent browseIntent = new Intent(Intent.ACTION_VIEW);
        browseIntent.setData((Uri.parse("https://ventustium.com")));
        startActivity(browseIntent);
    }


    private void goToActivity2() {
        Intent i = new Intent(this, MainActivity2.class);
        //ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this)
        //startActivity(i, options.toBundle());
        i.putExtra("nama", "Budi");
        i.putExtra(NAMA, et1.getText().toString());
        Log.d("INTENT", "Entering call Number");
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b1.setOnClickListener(myClicklListener);
        b3.setOnClickListener(myClicklListener);
        b4.setOnClickListener(myClicklListener);
        et1 = findViewById(R.id.editTextTextPersonName);
    }
}