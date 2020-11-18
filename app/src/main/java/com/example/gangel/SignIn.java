package com.example.gangel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    public void SignInClk(View view)
    {
        Intent SignInBtn = new Intent(this, Home.class);
        startActivity(SignInBtn);

        Toast.makeText(this, "Home page", Toast.LENGTH_SHORT).show();
    }


    public void CreateAccClk(View view)
    {
        Intent CreateAcc = new Intent(this, SignUp.class);
        startActivity(CreateAcc);

        Toast.makeText(this, "Sign Up page", Toast.LENGTH_SHORT).show();
    }

    public void ForgotPass(View view)
    {
        Intent ForgotPass = new Intent(this, ForgotPassword.class);
        startActivity(ForgotPass);
    }
}