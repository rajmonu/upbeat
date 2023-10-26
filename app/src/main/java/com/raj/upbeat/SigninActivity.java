package com.raj.upbeat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SigninActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        EditText mobileEditText = findViewById(R.id.et_username);
        EditText passwordEditText = findViewById(R.id.et_password);
        Button signupButton = findViewById(R.id.btn_signup);
        Button loginButton = findViewById(R.id.btn_signin);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Login button clicked
//                String context;
//                Intent intent = new Intent(context, SignInActivity.class);
//                startActivity(intent);
//                finish();
            }
        });

    }

}
