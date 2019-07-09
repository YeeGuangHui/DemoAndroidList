package com.example.demoandroidlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<AndroidVersion> versionList;

    public CustomAdapter(Context context, int resource, ArrayList<AndroidVersion> objects) {
        super(context, resource, (List) objects);
        parent_context = context;
        layout_id = resource;
        versionList = objects;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater=(LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView=inflater.inflate(layout_id, parent, false);

        TextView textViewName=rowView.findViewById(R.id.lvVersion);
        TextView textViewVer=rowView.findViewById(R.id.lvName);
        AndroidVersion currentVersion=versionList.get(position);
        textViewName.setText(currentVersion.getName());
        textViewVer.setText(currentVersion.getVersion());
        return rowView;
    }

}

