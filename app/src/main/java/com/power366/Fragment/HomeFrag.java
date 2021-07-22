package com.power366.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.power366.R;
import com.power366.activity.MenuActivity;
import com.power366.activity.NotificationActivity;


public class HomeFrag extends Fragment {

CardView card1,card3,card2,card4;
ImageView Ivmenu,ivNoti;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);
        card1=view.findViewById(R.id.card1);
        card3=view.findViewById(R.id.card3);
        card2=view.findViewById(R.id.card2);
        card4=view.findViewById(R.id.card4);
        Ivmenu=view.findViewById(R.id.Ivmenu);
        ivNoti=view.findViewById(R.id.ivNoti);


        Ivmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(getActivity(),NotificationActivity.class));

            }
        });

        Ivmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               MenuActivity.draweLayout.openDrawer(GravityCompat.END);
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new PendingFrag()).commit();
            }
        });
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new CompletedFrag()).commit();
            }
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new FeedsFrag()).commit();
            }
        });

        return view;


    }
}