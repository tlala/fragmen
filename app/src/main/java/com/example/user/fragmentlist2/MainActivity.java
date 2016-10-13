package com.example.user.fragmentlist2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] foods = {"jklj","sdfkl|,","tttt"};
        ListAdapter adapter = new CustomAdapter(this,foods);
        ListView listView = (ListView)findViewById(R.id.listViewId);
        listView.setAdapter(adapter);
    }
}