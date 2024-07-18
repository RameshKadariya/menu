package com.example.myapplication4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    NavigationView nav;
   // ActionBar actionBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nav=findViewById(R.id.nav);

        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                if(id==R.id.home){
                    Intent i1= new Intent(getApplicationContext(), MainActivity.class);
                    Toast.makeText(MainActivity.this,"Welcome to Home",Toast.LENGTH_SHORT);
                    startActivity(i1);
                }
                if(id==R.id.about){
                    Intent i2= new Intent(getApplicationContext(), About.class);
                    Toast.makeText(MainActivity.this,"Welcome to About Us Page",Toast.LENGTH_SHORT);
                    startActivity(i2);
                }
                if(id==R.id.contactus){
                    Intent i3= new Intent(getApplicationContext(), ContactUs.class);
                    Toast.makeText(MainActivity.this,"Welcome to Contact Us", Toast.LENGTH_SHORT);
                    startActivity(i3);
                }
                if(id==R.id.setting){
                    Intent i4= new Intent(getApplicationContext(), Setting.class);
                    Toast.makeText(MainActivity.this,"Welcome to Setting",Toast.LENGTH_SHORT);
                    startActivity(i4);
                }
                return false;
            }
        });
        final DrawerLayout drawerLayout=findViewById(R.id.main);
        findViewById(R.id.nav).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        ImageView imageView=findViewById(R.id.img);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });




        //actionBar = getSupportActionBar();



    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.menu,menu);
//        return true;
//
//    }
}