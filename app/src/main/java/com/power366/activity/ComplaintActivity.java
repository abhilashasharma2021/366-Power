package com.power366.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.power366.R;
import com.power366.databinding.ActivityComplaintBinding;
import com.power366.databinding.ActivityProfileBinding;

public class ComplaintActivity extends AppCompatActivity {
ActivityComplaintBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityComplaintBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });
        binding.btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ComplaintActivity.this,ComplaintSubmittedActivity.class));
            }
        });


        binding.rlLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ComplaintActivity.this,ChooseLocationActivity.class));
            }
        });
    }
}