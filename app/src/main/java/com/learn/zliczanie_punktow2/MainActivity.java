package com.learn.zliczanie_punktow2;

import androidx.appcompat.app.AppCompatActivity;
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

    binding.textView
            .setText(Integer.toString(punktyViewModel.getPunkty()));
        binding.button4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punktyViewModel.dodajPunkty(1);
                        binding.textView
                                .setText(Integer.toString(punktyViewModel.getPunkty()));
                    }
                }
        );
        binding.textView
                .setText(Integer.toString(punktyViewModel.getPunkty()));
        binding.button5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punktyViewModel.dodajPunkty(2);
                        binding.textView
                                .setText(Integer.toString(punktyViewModel.getPunkty()));
                    }
                }
        );
        binding.textView
                .setText(Integer.toString(punktyViewModel.getPunkty()));
        binding.button6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punktyViewModel.dodajPunkty(3);
                        binding.textView
                                .setText(Integer.toString(punktyViewModel.getPunkty()));
                    }
                }
        );
    }
}