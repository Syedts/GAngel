package com.example.gangel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void signinClk(View view)
    {
        Intent signinBtn = new Intent(this, SignIn.class);
        startActivity(signinBtn);

        Toast.makeText(this, "Sign-in page", Toast.LENGTH_SHORT).show();
    }
    public void createClk(View view)
    {
        Intent createAcc = new Intent(this, SignIn.class);   //// Sign in till Sign up
        startActivity(createAcc);

        Toast.makeText(this, "Sign-up page", Toast.LENGTH_SHORT).show();
    }
    
}