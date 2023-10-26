package com.raj.upbeat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    private EditText firstnameEditText;
    private EditText lastnameEditText;
    private EditText emailEditText;
    private EditText phoneEditText;
    private EditText passwordEditText;

    private Button signupButton;

    //    private TextView alreadyTextView;
    private Button signinButton;

    private NameDAO nameDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        firstnameEditText = findViewById(R.id.et_first_name);
        lastnameEditText = findViewById(R.id.et_last_name);
        emailEditText = findViewById(R.id.et_email);
        phoneEditText = findViewById(R.id.et_mobile);
        passwordEditText = findViewById(R.id.et_password);

        signupButton = findViewById(R.id.btn_signup);
        signinButton = findViewById(R.id.btn_signin);

        nameDAO = new NameDAO(this);
        nameDAO.open();

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstname = firstnameEditText.getText().toString();
                String lastname = lastnameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String phone = phoneEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                long result = nameDAO.insertName(firstname, lastname, email, phone, password);

                if (result != -1) {
                    Toast.makeText(SignupActivity.this, "User registered successfully", Toast.LENGTH_SHORT).show();
                    firstnameEditText.setText(""); // Clear the input fields
                    lastnameEditText.setText("");
                    emailEditText.setText("");
                    phoneEditText.setText("");
                    passwordEditText.setText("");
                } else {
                    Toast.makeText(SignupActivity.this, "User registration failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    protected void onPause() {
        nameDAO.close();
        super.onPause();
    }
}
