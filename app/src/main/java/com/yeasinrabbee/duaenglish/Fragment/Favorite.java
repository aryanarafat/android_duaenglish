package com.yeasinrabbee.duaenglish.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yeasinrabbee.duaenglish.R;

public class Favorite extends Fragment {

    private RecyclerView favoriteRV;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_favorite, container, false);

        favoriteRV = view.findViewById(R.id.favoriteRV);










        return view;
    }
}