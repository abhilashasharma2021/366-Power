package com.power366.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.power366.R;
import com.power366.activity.MenuActivity;
import com.power366.activity.RegisterActivity;
import com.power366.activity.ViewPagerActivity;
import com.power366.activity.ViewTicketActivity;
import com.power366.databinding.FragmentFeedDetailsBinding;
import com.power366.databinding.FragmentTicketBinding;


public class TicketFrag extends Fragment {
FragmentTicketBinding binding;
View view;
Context context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding= FragmentTicketBinding.inflate(getLayoutInflater(),container,false);
        view=binding.getRoot();
        context=getActivity();
        binding.btProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ViewTicketActivity.class));
            }
        });

        binding.ivBAck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             startActivity(new Intent(getActivity(), MenuActivity.class));
            }
        });
        return view;

    }
}