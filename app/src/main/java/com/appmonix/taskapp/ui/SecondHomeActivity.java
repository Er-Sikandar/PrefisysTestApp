package com.appmonix.taskapp.ui;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.appmonix.taskapp.R;
import com.appmonix.taskapp.adapters.SecondListAdapter;
import com.appmonix.taskapp.databinding.ActivitySecondHomeBinding;

import java.util.ArrayList;
import java.util.List;

public class SecondHomeActivity extends AppCompatActivity {
private ActivitySecondHomeBinding binding;
private SecondListAdapter adapter;
private List<String> dataList=new ArrayList<>();
    private long backPressed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        getWindow().setStatusBarColor(getResources().getColor(R.color.grey));
        binding=ActivitySecondHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.ivGame.setOnClickListener(v -> {
            Toast.makeText(this, "Coming Soon.", Toast.LENGTH_SHORT).show();
        });
        binding.ivMenu.setOnClickListener(v -> {
            Toast.makeText(this, "Coming Soon.", Toast.LENGTH_SHORT).show();
        });
        binding.fabAdd.setOnClickListener(v -> {
            Toast.makeText(this, "Coming Soon.", Toast.LENGTH_SHORT).show();
        });

        dataList.clear();
        dataList.add("Shyam: 0");
        dataList.add("Mohan: 0");
        dataList.add("John: 0");
        dataList.add("Shyam Verma: 0");
        dataList.add("Vishal: 0");
        dataList.add("Deepak: 0");
        dataList.add("Shyam Tyagi: 0");
        dataList.add("Lalit Sharma: 0");
        dataList.add("Shyam: 0");
        dataList.add("Mohan: 0");
        dataList.add("John: 0");
        dataList.add("Shyam Verma: 0");
        dataList.add("Vishal: 0");
        dataList.add("Deepak: 0");
        dataList.add("Shyam Tyagi: 0");
        dataList.add("Lalit Sharma: 0");
        dataList.add("Lokesh: 0");
        dataList.add("Shyam: 0");
        dataList.add("Sikandar Vishwakarma: 0");
        dataList.add("Shyam: 0");

        binding.recList.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
         adapter=new SecondListAdapter(this,dataList);
         binding.recList.setAdapter(adapter);

    }
    @Override
    public void onBackPressed() {
        if (backPressed + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
        } else {
            backPressed = System.currentTimeMillis();
            Toast.makeText(this, "PRESS ONCE AGAIN TO EXIT", Toast.LENGTH_SHORT).show();
        }
    }
}