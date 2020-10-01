package com.myfirstapplication.kpop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Mic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mic);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_mavigation);
        bottomNavigationView.setSelectedItemId(R.id.headset);

        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public boolean onNavigationItemReselected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(),
                                MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.headset:
                        startActivity(new Intent(getApplicationContext(),
                                Mic.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.mic:
                        return true;

                    case R.id.notification:
                        startActivity(new Intent(getApplicationContext(),
                                Notification.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.group:
                        startActivity(new Intent(getApplicationContext(),
                                Group.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.person:
                        startActivity(new Intent(getApplicationContext(),
                                Person.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;

            }
        });
    }
}
