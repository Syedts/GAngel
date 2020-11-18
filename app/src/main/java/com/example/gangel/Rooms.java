package com.example.gangel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Rooms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rooms);
    }

    public void roomsbackClk(View view)
    {
        Intent roomsBack = new Intent(this,Home.class);
        startActivity(roomsBack);
        Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
    }

    public void NavHomeClk(View view)
    {
        Intent MainHome = new Intent(this,Home.class);
        startActivity(MainHome);
        Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
    }
}