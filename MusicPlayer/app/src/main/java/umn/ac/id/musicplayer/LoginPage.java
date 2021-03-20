package umn.ac.id.musicplayer;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginPage extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        getSupportActionBar().setTitle("Login Page");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        etUsername = findViewById(R.id.et_Username);
        etPassword = findViewById(R.id.et_Password);
        btLogin = findViewById(R.id.button_Login);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etUsername.getText().toString().equals("uasmobile") &&
                        etPassword.getText().toString().equals("uasmobilegenap")) {
                    openMainActivity();

                }

                else
                    {
                    LoginFailDialog();
                }
            }
        });
    }

    public void LoginFailDialog() {
        LoginFail loginFail = new LoginFail();
        loginFail.show(getSupportFragmentManager(), "Pop up dialog");
    }


    public void openMainActivity() {

        Intent intentmainactivity = new Intent(this, MainActivity.class);
        startActivity(intentmainactivity);

    }
}
