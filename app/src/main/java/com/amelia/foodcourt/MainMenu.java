package com.amelia.foodcourt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity {

    Button signinemail, signinphone, signup;
    ImageView bgimage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        signinemail = (Button) findViewById(R.id.SignwithEmail);
        signup = (Button) findViewById(R.id.SignUp);

        signinemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent signemail = new Intent(MainMenu.this, ChooseOne.class);
                signemail.putExtra("Home", "Email");
                startActivity(signemail);
                finish();
            }
        });

        signup.setOnClickListener(v -> {
            Intent signup = new Intent(MainMenu.this, ChooseOne.class);
            signup.putExtra("Home", "SignUp");
            startActivity(signup);
            finish();
        });


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.gc();
    }

}