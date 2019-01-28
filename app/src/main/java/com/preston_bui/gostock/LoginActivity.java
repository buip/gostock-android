package com.preston_bui.gostock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.preston_bui.gostock.R;

public class LoginActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private EditText email, password;
    private TextView loadingSignin, forgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initViews();

        // hide progress bar and wait text on start
        progressBar.setVisibility(View.GONE);
        loadingSignin.setVisibility(View.GONE);
    }

    private void initViews() {
        progressBar = findViewById(R.id.progress_bar);
        email = findViewById(R.id.email_login_input);
        password = findViewById(R.id.password_login_input);
        loadingSignin = findViewById(R.id.loading_signin);
        forgotPassword = findViewById(R.id.link_forgot_password);
    }
}
