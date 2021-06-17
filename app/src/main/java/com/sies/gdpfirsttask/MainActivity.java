package com.sies.gdpfirsttask;

import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    FrameLayout frameLayout;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameLayout = findViewById(R.id.frameLayout);
        bottomNavigationView = findViewById(R.id.bottomNav);

        Fragment deliveryFragment = new DeliveryFragment();

        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            Fragment fragment;
            if (item.getItemId() == R.id.delivery)
                fragment = deliveryFragment;
            else
                fragment = deliveryFragment;
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, fragment).commit();
            return true;
        });
        bottomNavigationView.setSelectedItemId(R.id.delivery);
    }
}