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

import java.util.List;

public class AllDuaAdapter extends RecyclerView.Adapter<AllDuaAdapter.Vh> {


    List<AllDuaModel> models;

    public AllDuaAdapter(List<AllDuaModel> models) {

        this.models = models;

    }

    @NonNull
    @Override
    public Vh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_sample, parent, false);

        return new Vh(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Vh holder, int position) {

        holder.duaTitle.setText(models.get(position).duaTitle);


       holder.linearLayout.setOnClickListener(v -> {




            if (holder.expandLayout.getVisibility() == View.VISIBLE) {

                holder.expandLayout.setVisibility(View.GONE);
             //  holder.forwardIcon.setImageResource(R.drawable.baseline_arrow_forward_ios_24);
                holder.linearLayout.setBackgroundResource(R.drawable.remove_subsamplebakground);
            } else {

                holder.expandLayout.setVisibility(View.VISIBLE);
              //  holder.forwardIcon.setImageResource(R.drawable.baseline_keyboard_double_arrow_down_24);
                holder.linearLayout.setBackgroundResource(R.drawable.linear_backgrond);
            }


        });


    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class Vh extends RecyclerView.ViewHolder {

        private TextView duaTitle, duaCount;

        private RecyclerView subDuaRV;

        private LinearLayout linearLayout, expandLayout, ViewItem;

        private ImageView forwardIcon;


        public Vh(@NonNull View itemView) {
            super(itemView);


            duaTitle = itemView.findViewById(R.id.dua_title);
            duaCount = itemView.findViewById(R.id.dua_number);
            linearLayout = itemView.findViewById(R.id.linear_layout);
            expandLayout = itemView.findViewById(R.id.expandLayout);
            /*subDuaRV = itemView.findViewById(R.id.subDuaRV);

            ViewItem = itemView.findViewById(R.id.ViewItem);
            forwardIcon = itemView.findViewById(R.id.forwardIcon);
            linearLayout = itemView.findViewById(R.id.linearLayout);
*/

        }


    }


}
