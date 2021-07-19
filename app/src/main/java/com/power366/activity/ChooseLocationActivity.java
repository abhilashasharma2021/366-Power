package com.power366.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.power366.R;
import com.power366.databinding.ActivityChooseLocationBinding;

public class ChooseLocationActivity extends AppCompatActivity {
ActivityChooseLocationBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      binding=ActivityChooseLocationBinding.inflate(getLayoutInflater());
       setContentView(binding.getRoot());

        binding.btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseLocationActivity.this,MapActivity.class));
            }
        });

    }
}