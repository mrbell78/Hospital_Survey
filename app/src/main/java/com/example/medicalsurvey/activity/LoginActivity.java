package com.example.medicalsurvey.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.medicalsurvey.R;

public class LoginActivity extends AppCompatActivity {
    TextView singinpage,singuppage;

    LinearLayout singinlayout,singuplayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        singinpage=findViewById(R.id.singinid);
        singuppage=findViewById(R.id.signupid);

        singinlayout=findViewById(R.id.credential);
        singuplayout=findViewById(R.id.credential_singup);

        singinpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                singuplayout.setVisibility(View.INVISIBLE);
                singinpage.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
                singuppage.setBackgroundColor(Color.parseColor("#B5AFAF"));

            }
        });

        singuppage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                singuplayout.setVisibility(View.VISIBLE);
                singinlayout.setVisibility(View.INVISIBLE);
                singuppage.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
                singinpage.setBackgroundColor(Color.parseColor("#B5AFAF"));
            }
        });
    }
}