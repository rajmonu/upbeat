package com.raj.upbeat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        EditText firstnameEditText = findViewById(R.id.et_first_name);
        EditText lastnameEditText = findViewById(R.id.et_last_name);
        EditText emailEditText = findViewById(R.id.et_email);
        EditText mobileEditText = findViewById(R.id.et_mobile);
        EditText passwordEditText = findViewById(R.id.et_password);
        Button signupButton = findViewById(R.id.btn_signup);
        Button loginButton = findViewById(R.id.btn_signin);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Login button clicked
            }
        });

    }

}
