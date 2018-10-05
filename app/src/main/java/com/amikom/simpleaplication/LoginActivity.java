package com.amikom.simpleaplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    PreferenceHelper instance;
    private EditText name;
    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        instance = PreferenceHelper.getInstance(getApplicationContext());

        name = (EditText) fineViewById(R.id.etName);
        email = (EditText) fineViewById(R.id.etEmail);
    }
    public void Login (View view){
        String n = name.getText().tosString();
        String e = email.getTexxt().tosString();
        Toas.makeText(getApplicationContext();
    }
}
