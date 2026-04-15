package com.yeasinrabbee.duaenglish;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.yeasinrabbee.duaenglish.Adapters.AllDuaAdapter;
import com.yeasinrabbee.duaenglish.Adapters.AllDuaModel;
import com.yeasinrabbee.duaenglish.R;

import java.util.ArrayList;

public class List extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);



        RecyclerView listrv = findViewById(R.id.listrv);


        java.util.List<AllDuaModel> models = new ArrayList<>();


        models.add(new AllDuaModel("Dua Title", "12",false));
        models.add(new AllDuaModel("Dua Title1", "12",false));
        models.add(new AllDuaModel("Dua Title2", "12",false));
        models.add(new AllDuaModel("Dua Title3", "12",false));
        models.add(new AllDuaModel("Dua Title4", "12",false));
        models.add(new AllDuaModel("Dua Title5", "12",false));
        models.add(new AllDuaModel("Dua Title5", "12",false));
        models.add(new AllDuaModel("Dua Title5", "12",false));


        AllDuaAdapter adapter = new AllDuaAdapter(models);

        listrv.setLayoutManager(new LinearLayoutManager(this));
        listrv.setAdapter(adapter);








    }
}