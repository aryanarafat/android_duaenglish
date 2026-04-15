package com.yeasinrabbee.duaenglish.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yeasinrabbee.duaenglish.Adapters.AllDuaAdapter;
import com.yeasinrabbee.duaenglish.Adapters.AllDuaModel;
import com.yeasinrabbee.duaenglish.R;

import java.util.ArrayList;
import java.util.List;


public class AllDua extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {




        View view =  inflater.inflate(R.layout.fragment_all_dua, container, false);


        RecyclerView allDuaRv = view.findViewById(R.id.allduarv);


        List<AllDuaModel> models = new ArrayList<>();


        models.add(new AllDuaModel("Dua Title", "12",false));
        models.add(new AllDuaModel("Dua Title1", "12",false));
        models.add(new AllDuaModel("Dua Title2", "12",false));
        models.add(new AllDuaModel("Dua Title3", "12",false));
        models.add(new AllDuaModel("Dua Title4", "12",false));
        models.add(new AllDuaModel("Dua Title5", "12",false));
        models.add(new AllDuaModel("Dua Title5", "12",false));
        models.add(new AllDuaModel("Dua Title5", "12",false));


        AllDuaAdapter adapter = new AllDuaAdapter(models);

        allDuaRv.setLayoutManager(new LinearLayoutManager(requireActivity()));
        allDuaRv.setAdapter(adapter);







        return view;

    }
}