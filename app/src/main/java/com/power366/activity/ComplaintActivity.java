package com.power366.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import com.power366.R;
import com.power366.databinding.ActivityComplaintBinding;
import com.power366.databinding.ActivityProfileBinding;

public class ComplaintActivity extends AppCompatActivity  implements AdapterView.OnItemSelectedListener{
ActivityComplaintBinding binding;

    String[] selectPriority={"Urgent","High","Medium","Low"};
    String[] selectCategory={"Billing","Load Shedding","High/Low Voltage","Excessive interruptions","Metering","Delayed Connection","Infrastructure Damage ","Wrong Disconnection","Others"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityComplaintBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.spinPriorty.setOnItemSelectedListener(this);
        SpinnerAdapter  spinnerAdapterPriority = new ArrayAdapter<>(ComplaintActivity.this, android.R.layout.simple_list_item_1, selectPriority);
        binding.spinPriorty.setAdapter(spinnerAdapterPriority);


        binding.spinCategory.setOnItemSelectedListener(this);
        SpinnerAdapter  spinnerAdapterCategory= new ArrayAdapter<>(ComplaintActivity.this, android.R.layout.simple_list_item_1, selectCategory);
        binding.spinCategory.setAdapter(spinnerAdapterCategory);




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
                //startActivity(new Intent(ComplaintActivity.this,ChooseLocationActivity.class));
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}