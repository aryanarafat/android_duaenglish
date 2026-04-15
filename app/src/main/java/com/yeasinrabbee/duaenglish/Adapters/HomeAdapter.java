package com.yeasinrabbee.duaenglish.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yeasinrabbee.duaenglish.R;

import java.util.ArrayList;
import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.VH> {

    List<Category_Model>  modelList ;

    public HomeAdapter(List<Category_Model> modelList) {

        this.modelList = modelList;


    }



    @NonNull
    @Override
    public HomeAdapter.VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {



        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sample,parent,false);




        return new VH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.VH holder, int position) {

        holder.icon.setImageResource(modelList.get(position).getIcon());

        holder.title.setText(modelList.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class VH extends RecyclerView.ViewHolder {



        LinearLayout item ;

        ImageView icon;
        TextView title;


        public VH(@NonNull View itemView) {

            super(itemView);


            item = itemView.findViewById(R.id.linear_layout);
            icon = itemView.findViewById(R.id.sample_imageview);
            title = itemView.findViewById(R.id.sample_title_textview);




        }
    }
}
