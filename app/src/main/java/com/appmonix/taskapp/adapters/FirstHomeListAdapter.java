package com.appmonix.taskapp.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.appmonix.taskapp.databinding.FirstHomePosterLayoutBinding;

import java.util.List;

public class FirstHomeListAdapter extends RecyclerView.Adapter<FirstHomeListAdapter.ViewHolder> {
  private Context context;
  private List<String> dataList;

    public FirstHomeListAdapter(Context context, List<String> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public FirstHomeListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(FirstHomePosterLayoutBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull FirstHomeListAdapter.ViewHolder holder, int position) {
        Log.e("TAG", "onBindViewHolder: "+position);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private FirstHomePosterLayoutBinding binding;
        public ViewHolder(@NonNull FirstHomePosterLayoutBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
