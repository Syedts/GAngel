package com.example.gangel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void SignUpClk(View view)
    {
        Intent SignUp = new Intent(this, Home.class);
        startActivity(SignUp);

        Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
    }
}