package com.example.javatestersomelogic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;

import com.example.javatestersomelogic.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());

        if (!SharedPreference.getNameShared(this).equalsIgnoreCase("")) {
            // TODO делаем запрос на сервер , получаем ссылку
            // TODO записываем в префы ссылку, переходим на webView загружаем там ссылку из перфов
        } else {
            // TODO если у нас в префах уже есть не нулевая ссылка , то переходим на webView
        }

        binding.btn.setOnClickListener(v -> {
            binding.text.setText(binding.edText.getText().toString());
            SharedPreference.saveNameShared(this, binding.edText.getText().toString());
        });
    }
}