package com.power366.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.power366.R;
import com.power366.databinding.ActivityWhistleBlowerBinding;

public class WhistleBlowerActivity extends AppCompatActivity {
ActivityWhistleBlowerBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityWhistleBlowerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
           binding.btnSubmit.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   whistleDialog();
               }
           });

    }



    private void whistleDialog(){

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
}