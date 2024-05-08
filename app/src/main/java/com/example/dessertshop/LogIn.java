package com.example.dessertshop;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class LogIn extends AppCompatActivity {
    EditText usernameInput;
    EditText passwordInput;
    Button loginBtn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        usernameInput = findViewById(R.id.username_input);
        passwordInput = findViewById(R.id.password_input);
        loginBtn = findViewById(R.id.login_btn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String username = usernameInput.getText().toString();
                String password = passwordInput.getText().toString();
                Intent intent = new Intent(LogIn.this, MainActivity.class);
                startActivity(intent);
            }

//            Log.i("Test Credentials", "Username: " + username + " and Password: " + password);
        });

    }
}