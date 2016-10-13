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

        String[] foods = {"tal","sdfkl|,","tttt"};
        int x = 5;
        int y = 234;
        int z = 55;
        ListAdapter adapter = new CustomAdapter(this,foods);
        ListView listView = (ListView)findViewById(R.id.listViewId);
        listView.setAdapter(adapter);
    }
}
