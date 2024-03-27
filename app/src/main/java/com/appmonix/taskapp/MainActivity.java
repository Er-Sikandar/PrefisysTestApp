package com.appmonix.taskapp;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.appmonix.taskapp.databinding.ActivityMainBinding;
import com.appmonix.taskapp.ui.FirstHomeActivity;
import com.appmonix.taskapp.ui.SecondHomeActivity;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnFirstTask.setOnClickListener(v -> {
        startActivity(new Intent(this, FirstHomeActivity.class));
        });
        binding.btnSecondTask.setOnClickListener(v -> {
        startActivity(new Intent(this, SecondHomeActivity.class));
        });

    }
}