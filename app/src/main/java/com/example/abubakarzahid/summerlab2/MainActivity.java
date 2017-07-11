package com.example.abubakarzahid.summerlab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText edittext  = (EditText) findViewById(R.id.editText);
        Button button  = (Button) findViewById(R.id.btnsend);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: button pressed ");
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                String myM = edittext.getText().toString();
                intent.putExtra("key1", myM);


                startActivity(intent);


            }
        });

    }

}
