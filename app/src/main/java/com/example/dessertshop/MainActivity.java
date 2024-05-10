package com.example.dessertshop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button cakeButton, pastryButton, dessertButton;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_activity_main);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.nav_home) {
                    Toast.makeText(MainActivity.this, "Home Selected", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.nav_gallery) {
                    Toast.makeText(MainActivity.this, "Gallery Selected", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.nav_slideshow) {
                    Toast.makeText(MainActivity.this, "SlideShow Selected", Toast.LENGTH_SHORT).show();
                }
                DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });


        cakeButton = findViewById(R.id.cakeButton);
        pastryButton = findViewById(R.id.pastryButton);
        dessertButton = findViewById(R.id.dessertButton);

        cakeButton.setOnClickListener(this);
        pastryButton.setOnClickListener(this);
        dessertButton.setOnClickListener(this);
    }

        @Override
        public void onClick(@NonNull View v){
            if (v.getId() == R.id.cakeButton) {
                Intent intent = new Intent(MainActivity.this, MainCakeItems.class);
                startActivity(intent);
            }
            if (v.getId() == R.id.pastryButton) {
                Intent intent = new Intent(MainActivity.this, MainPastryItems.class);
                startActivity(intent);
            }
            if (v.getId() == R.id.dessertButton) {
                Intent intent = new Intent(MainActivity.this, MainDessertItems.class);
                startActivity(intent);
            }
        }
}