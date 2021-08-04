package com.App.mylistq;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity<onOptionItemSelected> extends AppCompatActivity {
    private RecyclerView rvFilms;
    private ArrayList<Film> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFilms = findViewById(R.id.rv_film);
        rvFilms.setHasFixedSize(true);

        list.addAll(FilmData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvFilms.setLayoutManager(new LinearLayoutManager(this));
        ListAdapter listAdapter = new ListAdapter(list);
        rvFilms.setAdapter(listAdapter);
    }

    private void showRecyclerCardView(){
        rvFilms.setLayoutManager((new LinearLayoutManager(this)));
        CardViewAdapter cardViewAdapter = new CardViewAdapter(list);
        rvFilms.setAdapter(cardViewAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super .onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode){
        switch (selectedMode){
            case R.id.action_list:
                showRecyclerList();
                break;

            case R.id.action_card:
                showRecyclerCardView();
                break;
        }
    }
}