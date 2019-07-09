package com.example.demoandroidlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvVer;
    ArrayList<AndroidVersion> verList;
    ArrayAdapter<AndroidVersion> Version;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvVer=findViewById(R.id.lvVersion);

        verList = new ArrayList<>();
        AndroidVersion item1=new AndroidVersion("Pie", "9.0");
        AndroidVersion item2=new AndroidVersion("Oreo", "8.0-8.1");
        AndroidVersion item3=new AndroidVersion("Nougat", "7.0-7.1");
        verList.add(item1);
        verList.add(item2);
        verList.add(item3);

        Version=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, verList);

        lvVer.setAdapter(Version);
        adapter=new CustomAdapter(this, R.layout.activity_main, verList);

    }
}
