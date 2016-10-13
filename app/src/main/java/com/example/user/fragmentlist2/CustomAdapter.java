package com.example.user.fragmentlist2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by User on 08/10/2016.
 */
class CustomAdapter  extends ArrayAdapter<String>{

    public CustomAdapter(Context context, String[] foods) {
        super(context,R.layout.custom_row, foods);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View v = inflater.inflate(R.layout.custom_row,parent,false);

        String s = getItem(position);
        TextView txt = (TextView) v.findViewById(R.id.buckysText);
        txt.setText(s);
        return v;
    }
}
