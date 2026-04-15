package com.yeasinrabbee.duaenglish;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.yeasinrabbee.duaenglish.Fragment.AllDua;
import com.yeasinrabbee.duaenglish.Fragment.Favorite;
import com.yeasinrabbee.duaenglish.Fragment.Home;
import com.yeasinrabbee.duaenglish.Utils.Utils;
import com.yeasinrabbee.duaenglish.Utils.ViewpagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {





    private RecyclerView recyclerView;


    ViewPager viewPager;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment_control();


        Utils.createFileFromInputStream(this);



    }

    private void fragment_control() {

        viewPager = findViewById(R.id.pager);


        View hometab = findViewById(R.id.HomeTab);
        View categoryTab = findViewById(R.id.categoryTab);
        View favorite_tab = findViewById(R.id.favorite);


        ImageView homeIV = findViewById(R.id.ivHomeTab);
        ImageView categoryIV = findViewById(R.id.ivGenreTab);
        ImageView favoriteIV = findViewById(R.id.ivTopTab);



        Home home = new Home();
        Favorite favorite = new Favorite();
        AllDua allDua = new AllDua();

        List<Fragment> fragments =  new ArrayList<>();

        fragments.add(home);
        fragments.add(favorite);
        fragments.add(allDua);

        ViewpagerAdapter adapter = new ViewpagerAdapter(getSupportFragmentManager(),0,fragments);
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(3);


        hometab.setOnClickListener(view -> {

            viewPager.setCurrentItem(0);


            homeIV.setImageResource(R.drawable.ic_home_tab_selected);
            categoryIV.setImageResource(R.drawable.ic_genre_deselected);
            favoriteIV.setImageResource(R.drawable.ic_top_deselected);


        });
        categoryTab.setOnClickListener(view -> {

            viewPager.setCurrentItem(2);
            categoryIV.setImageResource(R.drawable.ic_genre_selected);
            favoriteIV.setImageResource(R.drawable.ic_top_deselected);
            homeIV.setImageResource(R.drawable.ic_home_tab_deselected);



        });
        favorite_tab.setOnClickListener(view -> {

            viewPager.setCurrentItem(1);
            homeIV.setImageResource(R.drawable.ic_home_tab_deselected);
            favoriteIV.setImageResource(R.drawable.ic_top_selected);
            categoryIV.setImageResource(R.drawable.ic_genre_deselected);

        });







    }




}