package com.power366.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;

import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RelativeLayout;


import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import com.power366.Fragment.FeedsFrag;
import com.power366.Fragment.HomeFrag;

import com.power366.Fragment.MessageFrag;
import com.power366.Fragment.TicketFrag;
import com.power366.R;


public class MenuActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener, View.OnClickListener {
public  static  DrawerLayout  draweLayout;
NavigationView navView;
RelativeLayout rlHome,rlFeed,rlNotification,rlWhistle,rlLogout,rlTicket,rlProfile,rlMessage;
    BottomNavigationView bottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        bottomNavigation=findViewById(R.id.bottomNavigation);
        draweLayout = findViewById(R.id.draweLayout);
        navView = findViewById(R.id.navView);
        rlHome = findViewById(R.id.rlHome);
        rlFeed = findViewById(R.id.rlFeed);
        rlNotification = findViewById(R.id.rlNotification);
        rlWhistle = findViewById(R.id.rlWhistle);
        rlLogout = findViewById(R.id.rlLogout);
        rlTicket = findViewById(R.id.rlTicket);
        rlProfile = findViewById(R.id.rlProfile);
        rlMessage = findViewById(R.id.rlMessage);

        bottomNavigation=findViewById(R.id.bottomNavigation);
        bottomNavigation.setOnNavigationItemSelectedListener(this);

        rlFeed.setOnClickListener(this);
        rlHome.setOnClickListener(this);
        rlNotification.setOnClickListener(this);
        rlWhistle.setOnClickListener(this);
        rlLogout.setOnClickListener(this);
        rlTicket.setOnClickListener(this);
        rlProfile.setOnClickListener(this);
        rlMessage.setOnClickListener(this);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFrag()).commit();
        }

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.rlHome:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFrag()).commit();
                draweLayout.closeDrawer(GravityCompat.END);
                break;

            case R.id.rlFeed:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new FeedsFrag()).commit();
                draweLayout.closeDrawer(GravityCompat.END);
                break;

            case R.id.rlNotification:
                startActivity(new Intent(MenuActivity.this,NotificationActivity.class));
                draweLayout.closeDrawer(GravityCompat.END);
                break;


            case R.id.rlWhistle:
                startActivity(new Intent(MenuActivity.this,WhistleBlowerActivity.class));
                draweLayout.closeDrawer(GravityCompat.END);
                break;
            case R.id.rlProfile:
                startActivity(new Intent(MenuActivity.this,ProfileActivity.class));
                draweLayout.closeDrawer(GravityCompat.END);
                break;


            case R.id.rlTicket:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new TicketFrag()).commit();
                draweLayout.closeDrawer(GravityCompat.END);
                break;


            case R.id.rlMessage:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new MessageFrag()).commit();
                draweLayout.closeDrawer(GravityCompat.END);
                break;

            case R.id.rlLogout:
                logoutDialog();
                break;


        }
    }

    private void logoutDialog(){


        final Dialog dialog = new Dialog(MenuActivity.this);

        dialog.setContentView(R.layout.logout_dialog);

        Button btnYes = (Button) dialog.findViewById(R.id.btnYes);
        Button btnNo = (Button) dialog.findViewById(R.id.btnNo);

        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Close dialog
                dialog.dismiss();
                startActivity(new Intent(MenuActivity.this,SplashActivity.class));
            }
        });

        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Close dialog
                dialog.dismiss();
            }
        });

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();

    }
}