package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter extends ArrayAdapter<Module> {

    private ArrayList<Module> modules;
    private Context context;
    private ImageView ivModule;
    private TextView tvYear, tvModule;




    public ModuleAdapter(Context context, int resource, ArrayList<Module> objects) {
        super(context, resource, objects);
        modules = objects;
        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);

        tvModule = rowView.findViewById(R.id.tvModule);
        ivModule = (ImageView) rowView.findViewById(R.id.imageView);

        Module currentModule = modules.get(position);
        tvModule.setText(currentModule.getModule());

        if (currentModule.isStar()){
            ivModule.setImageResource(R.drawable.prog);
        }
        else {
            ivModule.setImageResource(R.drawable.nonprog);
        }
        return rowView;





    }
}
