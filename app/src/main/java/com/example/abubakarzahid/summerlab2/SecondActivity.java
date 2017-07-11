package com.example.abubakarzahid.summerlab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent  = getIntent();

        String val1 = intent.getStringExtra("key1");
    final EditText secontext = (EditText)findViewById(R.id.edtreceive);
        secontext.setText(val1);
    }

}
