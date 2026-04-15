package com.yeasinrabbee.duaenglish.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yeasinrabbee.duaenglish.R;

public class FavoriteAdapter extends RecyclerView.Adapter<FavoriteAdapter.Vh> {
    @NonNull
    @Override
    public FavoriteAdapter.Vh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.favoritesample,parent,false);

        return new Vh(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FavoriteAdapter.Vh holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class Vh extends RecyclerView.ViewHolder {



        private TextView duaTitle, duaCount;
        private ImageView delete;

        public Vh(@NonNull View itemView) {
            super(itemView);

            duaTitle = itemView.findViewById(R.id.dua_title);
            duaCount = itemView.findViewById(R.id.dua_number);


            delete = itemView.findViewById(R.id.delete);



        }
    }
}
