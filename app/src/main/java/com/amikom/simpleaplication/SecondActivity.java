package com.amikom.simpleaplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class SecondActivity extends AppCompatActivity {
    private Button buttonActivity, buttonFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        buttonActivity = (Button) findViewById(R.id.buttonActivity);
        buttonFragment = (Button) findViewById(R.id.buttonragment);

        buttonActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
