package com.power366.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SpinnerAdapter;

import com.power366.R;
import com.power366.databinding.ActivityWhistleBlowerBinding;

public class WhistleBlowerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    ActivityWhistleBlowerBinding binding;

    String[] selectDiscos = {"AEDC", "BEDC EEDC", "IEDC", "JEDC", "KEDC", "Eko EDC", "YEDC", "PEDC"};
    String[] selectType = {". Financial misconduct (All forms of fraud, corruption, \n" +
            "bribery, theft, false representation, extortion, field \n" +
            "officials demanding payments in cash or kind, \n" +
            "harassment, intimidation)", ". Illegal connection (neighbours illegally connecting to \n" +
            "another person's service line to use electricity without \n" +
            "paying)", ". Meter tampering or bypassing (any form of actions \n" +
            "taken to tamper with the meter to reduce the reading \n" +
            "rates or totally bypass)", ". Vandalism (Willful destruction of cables, poles, \n" +
            "transformers, etc)", ". Harassment, intimidation and abuse (Non-consensual \n" +
            "sexual or physical abuse or harassment of staff or \n" +
            "customers)", ". Health and safety (Actions detrimental to health, lives \n" +
            "and safety)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWhistleBlowerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.spinDiscos.setOnItemSelectedListener(WhistleBlowerActivity.this);
        SpinnerAdapter spinnerAdapterPriority = new ArrayAdapter<>(WhistleBlowerActivity.this, android.R.layout.simple_list_item_1, selectDiscos);
        binding.spinDiscos.setAdapter(spinnerAdapterPriority);


        binding.spinType.setOnItemSelectedListener(WhistleBlowerActivity.this);
        SpinnerAdapter spinnerAdapterType= new ArrayAdapter<>(WhistleBlowerActivity.this, android.R.layout.simple_list_item_1, selectType);
        binding.spinType.setAdapter(spinnerAdapterType);




        binding.btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submittedDialog();


            }
        });
        binding.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    private void whistleDialog() {

        final Dialog dialog = new Dialog(WhistleBlowerActivity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.dialog_whistle_complaint);

     /*   Button btnYes = (Button) dialog.findViewById(R.id.btnYes);
        Button btnNo = (Button) dialog.findViewById(R.id.btnNo);

        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Close dialog
                dialog.dismiss();
                startActivity(new Intent(WhistleBlowerActivity.this,SplashActivity.class));
            }
        });

        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Close dialog
                dialog.dismiss();
            }
        });
*/
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }



    private void submittedDialog() {

        final Dialog dialog = new Dialog(WhistleBlowerActivity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.dialog_whistle_submitted);

        Button btnYes = (Button) dialog.findViewById(R.id.btOk);


        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Close dialog
                dialog.dismiss();
                startActivity(new Intent(WhistleBlowerActivity.this,MenuActivity.class));
            }
        });


     /*   Button btnYes = (Button) dialog.findViewById(R.id.btnYes);
        Button btnNo = (Button) dialog.findViewById(R.id.btnNo);

        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Close dialog
                dialog.dismiss();
                startActivity(new Intent(WhistleBlowerActivity.this,SplashActivity.class));
            }
        });

        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Close dialog
                dialog.dismiss();
            }
        });
*/
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();

    }
}