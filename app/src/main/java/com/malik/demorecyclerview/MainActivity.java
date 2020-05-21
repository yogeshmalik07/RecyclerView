package com.malik.demorecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView programminglist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        programminglist = findViewById(R.id.programminglist);
        programminglist.setLayoutManager(new LinearLayoutManager(this));
        String[] lang = {"java","javascript","python","dart","c","kotlin","php","c#","c++","Springboot"};
        programminglist.setAdapter(new ProgrammingAdapter(lang));
    }
}
