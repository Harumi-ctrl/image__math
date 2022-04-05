package com.movie.imagemath;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.movie.imagemath.forth.ForthMainActivity;
import com.movie.imagemath.one.OneMainActivity;
import com.movie.imagemath.others.privacypolicy;
import com.movie.imagemath.three.ThreeMainActivity;
import com.movie.imagemath.two.TwoMainActivity;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1,imageView2,imageView3,imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1=findViewById(R.id.image1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, OneMainActivity.class);
                startActivity(intent);

            }
        });

        imageView2=findViewById(R.id.image2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, TwoMainActivity.class);
                startActivity(intent);

            }
        });



        imageView3=findViewById(R.id.image3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, ThreeMainActivity.class);
                startActivity(intent);

            }
        });



        imageView4=findViewById(R.id.image4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,ForthMainActivity.class);
                startActivity(intent);
            }
        });

        BottomNavigationView bottomNavigationView =findViewById(R.id.bottom_navi);
        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView
                .setOnNavigationItemSelectedListener
                        (new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull  MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.privacy:
                        startActivity(new Intent(getApplicationContext(),
                                privacypolicy.class));
                        overridePendingTransition(0, 0);
                }
                return true;
            }

        });


    }
}