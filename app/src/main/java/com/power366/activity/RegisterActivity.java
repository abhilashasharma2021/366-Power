package com.power366.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.power366.R;
import com.power366.databinding.ActivityRegisterBinding;
import com.power366.utils.Appconstant;
import com.power366.utils.SharedHelper;

public class RegisterActivity extends AppCompatActivity {
ActivityRegisterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

      /* String changestatus = SharedHelper.getKey(getApplicationContext(), Appconstant.changestatus);

       Log.e("RegisterActivity", "changestatus: " +changestatus);

       if (changestatus.equals("SIGNIN")){
         binding.rlLogin.setVisibility(View.VISIBLE);
           binding.rlSignUp.setVisibility(View.GONE);
           binding.txTerm.setVisibility(View.GONE);
           binding.txSingIn.setVisibility(View.GONE);
           binding.txSignUp.setVisibility(View.VISIBLE);
       }else if (changestatus.equals("SIGNUP")){
           binding.rlSignUp.setVisibility(View.VISIBLE);
           binding.txTerm.setVisibility(View.VISIBLE);
           binding.rlLogin.setVisibility(View.GONE);
           binding.txSingIn.setVisibility(View.VISIBLE);
           binding.txSignUp.setVisibility(View.GONE);
       }
*/

        binding.btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          startActivity(new Intent(getApplicationContext(), VerifyOtpActivity.class));

            }
        });




        binding.txSingIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            }
        });
    }
}