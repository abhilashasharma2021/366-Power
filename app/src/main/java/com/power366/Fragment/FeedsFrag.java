package com.power366.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.power366.R;
import com.power366.activity.ViewTicketActivity;
import com.power366.databinding.FragmentFeedsBinding;


public class FeedsFrag extends Fragment {

FragmentFeedsBinding binding;

    View view;
    Context context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding= FragmentFeedsBinding.inflate(getLayoutInflater(),container,false);
        view=binding.getRoot();
        context=getActivity();

        binding.relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
            }
        });

        binding.rlDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new FeedDetailsFrag()).commit();
            }
        });

        return view;

    }
}