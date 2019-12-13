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

public class CategoryRecyclerAdapter extends RecyclerView.Adapter<CategoryRecyclerAdapter.Holder> {

    private List<Category> CatList = new ArrayList<>();

    private OnItem onItem;

    public CategoryRecyclerAdapter(List<Category> catList) {
        CatList = catList;
    }

    public CategoryRecyclerAdapter() {
    }

    @NonNull
    @Override
    public CategoryRecyclerAdapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryRecyclerAdapter.Holder holder, int position) {
        Category category=CatList.get(position);
        holder.txtName.setText(category.getName());
        holder.txtName.setOnClickListener(v ->{
            if (onItem!=null){
                onItem.Position(position);
            }
        });


    }

    public void setOnItem(OnItem onItem) {
        this.onItem = onItem;
    }
    public void setUser(List<Category> category) {
        this.CatList = category;
        notifyDataSetChanged();

    }

    @Override
    public int getItemCount() {
        return CatList.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        public TextView txtName;


        public Holder(View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.catName);
        }




    }

}
