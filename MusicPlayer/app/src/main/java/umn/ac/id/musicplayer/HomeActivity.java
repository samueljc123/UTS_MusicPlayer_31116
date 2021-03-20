package umn.ac.id.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button btLoginPage, btProfilePage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btLoginPage = findViewById(R.id.Login_Page);
        btProfilePage = findViewById(R.id.Profile_Page);

        btLoginPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginPage();
            }
        });

        btProfilePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openProfilePage();

            }
        });


    }

    public void openLoginPage(){
        Intent intentloginpage = new Intent(HomeActivity.this, LoginPage.class);
        startActivity(intentloginpage);
    }

    public void openProfilePage(){
        Intent intenprofilepage = new Intent(this,ProfilePage.class);
        startActivity(intenprofilepage);
    }
}
