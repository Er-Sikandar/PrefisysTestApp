package com.appmonix.taskapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.appmonix.taskapp.databinding.SecondListLayoutBinding;

import java.util.List;

public class SecondListAdapter extends RecyclerView.Adapter<SecondListAdapter.ViewHolder> {
    private Context context;
    private List<String> dataList;

    public SecondListAdapter(Context context, List<String> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public SecondListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(SecondListLayoutBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SecondListAdapter.ViewHolder holder, int position) {
        holder.binding.tvTitle.setText(dataList.get(position));

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private SecondListLayoutBinding binding;
        public ViewHolder(@NonNull SecondListLayoutBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
