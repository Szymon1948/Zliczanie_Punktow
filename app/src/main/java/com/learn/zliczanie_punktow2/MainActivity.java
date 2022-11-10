package com.learn.zliczanie_punktow2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.learn.zliczanie_punktow2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    private  PunktyViewModel punktyViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        punktyViewModel = new ViewModelProvider(this)
                .get(PunktyViewModel.class);

        punktyViewModel.getPunkty().observe(this,
                new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                binding.textView.setText(integer.toString());
            }
        });

        binding.button4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punktyViewModel.dodajPunkty(1);

                    }
                }
        );

        binding.button5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punktyViewModel.dodajPunkty(2);

                    }
                }
        );

        binding.button6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punktyViewModel.dodajPunkty(3);

                    }
                }
        );
    }
}
//https://codelabs.developers.google.com/?product=android&text=java
//https://developer.android.com/jetpack/androidx/explorer