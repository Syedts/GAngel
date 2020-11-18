package com.example.gangel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ForgotPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
    }


    public void SubmitClk(View view)
    {

        Intent FPS = new Intent(this, SignIn.class);
        startActivity(FPS);

        Toast.makeText(this, "Password sent to email", Toast.LENGTH_SHORT).show();

    }
}