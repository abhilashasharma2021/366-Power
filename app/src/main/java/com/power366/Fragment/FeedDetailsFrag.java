package com.power366.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.power366.R;
import com.power366.databinding.FragmentFeedDetailsBinding;


public class FeedDetailsFrag extends Fragment {
FragmentFeedDetailsBinding binding;
View view;
    private Context context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding=FragmentFeedDetailsBinding.inflate(getLayoutInflater(),container,false);
        view=binding.getRoot();
        context=getActivity();


        binding.ivRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new FeedsFrag()).commit();
            }
        });
        return view;
    }
}