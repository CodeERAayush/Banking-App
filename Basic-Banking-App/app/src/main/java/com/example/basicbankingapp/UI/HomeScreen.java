package com.example.basicbankingapp.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.basicbankingapp.R;

public class HomeScreen extends AppCompatActivity {

    Animation anim,anime;
    ImageView bankLogo;
    TextView tvBankTitle;
    Button userBtn, TransBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        anim = AnimationUtils.loadAnimation(this, R.anim.animation);

        bankLogo = findViewById(R.id.bank_logo);
        userBtn = findViewById(R.id.AllUsers);
        TransBtn = findViewById(R.id.allTrans);
        tvBankTitle = findViewById(R.id.BankTitle);

        bankLogo.setAnimation(anim);
        tvBankTitle.setAnimation(anim);
        userBtn.setAnimation(anim);
        TransBtn.setAnimation(anim);
    }

   public void showAllUsers(View view) {
        Intent intent = new Intent(this, UsersList.class);
        startActivity(intent);
    }

    public void showAllTransactions(View view) {
        Intent intent = new Intent(this, TransactionHistory.class);
        startActivity(intent);
    }
}