package com.power366.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.power366.R;
import com.power366.databinding.ActivityRegisterBinding;
import com.power366.databinding.ActivityVerifyOtpBinding;

public class VerifyOtpActivity extends AppCompatActivity {
ActivityVerifyOtpBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityVerifyOtpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ChooseLocationActivity.class));

            }
        });

    }
}