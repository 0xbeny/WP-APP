package com.example.kokabkhanum.presentation.ui.CategoryList.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kokabkhanum.R;
import com.example.kokabkhanum.local.Entity.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryRecyclerView extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Category> CatList = new ArrayList<>();


    @NonNull
    @Override
    public CategoryRecyclerView.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((Holder) holder).bind(CatList.get(position));
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class Holder extends RecyclerView.ViewHolder {
        public TextView txtName, txtId;


        public Holder(View itemView) {

            super(itemView);

            txtName = itemView.findViewById(R.id.catName);
        }

        public void bind(Category c) {
            txtName.setText(c.getName());
        }


    }

}
