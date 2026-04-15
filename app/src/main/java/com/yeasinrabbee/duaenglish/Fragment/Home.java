package com.yeasinrabbee.duaenglish.Fragment;

import android.database.Cursor;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yeasinrabbee.duaenglish.Adapters.Category_Model;
import com.yeasinrabbee.duaenglish.Adapters.HomeAdapter;
import com.yeasinrabbee.duaenglish.Db.Helper;
import com.yeasinrabbee.duaenglish.R;

import java.util.ArrayList;
import java.util.List;


public class Home extends Fragment {

    private final ArrayList<Integer> myImageList = new ArrayList<>();

    private RecyclerView recyclerView;
    private HomeAdapter homeAdapter;

    private Helper helper;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);


        myImageList.add(R.drawable.sleep);
        myImageList.add(R.drawable.morning);
        myImageList.add(R.drawable.family);
        myImageList.add(R.drawable.social);
        myImageList.add(R.drawable.ramadan);
        myImageList.add(R.drawable.kabba);
        myImageList.add(R.drawable.watertab);
        myImageList.add(R.drawable.salah);
        myImageList.add(R.drawable.foodanddrink);
        myImageList.add(R.drawable.rizq);
        myImageList.add(R.drawable.travel);
        myImageList.add(R.drawable.nature);
        myImageList.add(R.drawable.heart);
        myImageList.add(R.drawable.medicine);
        myImageList.add(R.drawable.shield);
        myImageList.add(R.drawable.quran);
        myImageList.add(R.drawable.medicinebowl);
        myImageList.add(R.drawable.clothes);

        helper = new Helper(requireContext());

        recyclerView = view.findViewById(R.id.homerv);

        List<Category_Model>  modelList = new ArrayList<>();



        Cursor cursor = helper.getAllCategory();

        if (cursor != null && cursor.getCount()>0){

            int i  = 0;

             while (cursor.moveToNext()){

                 Category_Model model = new Category_Model(
                         cursor.getString(0),
                         cursor.getString(1),
                         myImageList.get(i)
                 );

                 modelList.add(model);

                 i++;
             }

        }



        homeAdapter = new HomeAdapter(modelList);


        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),3));
        recyclerView.setAdapter(homeAdapter);










        return view;

    }
}