package com.example.gangel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void homeroomCLK(View view)
    {
        Intent homeroom = new Intent(this,Rooms.class);
        startActivity(homeroom);
        Toast.makeText(this, "Rooms", Toast.LENGTH_SHORT).show();
    }


    public void homecamClk(View view)
    {
        Intent homecam = new Intent(this,Cameras.class);
        startActivity(homecam);
        Toast.makeText(this, "Cameras", Toast.LENGTH_SHORT).show();
    }


    public void homedetectorsClk(View view)
    {
        Intent homedect = new Intent(this,Detectors.class);
        startActivity(homedect);
        Toast.makeText(this, "Detectors", Toast.LENGTH_SHORT).show();

    }

    public void notificationClk(View view)
    {
        Intent homeNot = new Intent(this,Notifications.class);
        startActivity(homeNot);
        Toast.makeText(this, "Notifications", Toast.LENGTH_SHORT).show();
    }

    public void SettingClk(View view)
    {
        Intent homeSett = new Intent(this, settings.class);
        startActivity(homeSett);
        Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
    }
}