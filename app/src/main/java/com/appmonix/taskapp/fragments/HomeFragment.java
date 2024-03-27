package com.appmonix.taskapp.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appmonix.taskapp.R;
import com.appmonix.taskapp.adapters.FirstHomeListAdapter;
import com.appmonix.taskapp.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {
private FragmentHomeBinding binding;
private List<String> dataList=new ArrayList<>();
private FirstHomeListAdapter adapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentHomeBinding.inflate(LayoutInflater.from(container.getContext()),container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        dataList.clear();
        dataList.add("A");
        dataList.add("A");
        dataList.add("A");
        dataList.add("A");
        adapter=new FirstHomeListAdapter(getActivity(),dataList);
        binding.recPoster.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        binding.recPoster.setAdapter(adapter);
    }
}