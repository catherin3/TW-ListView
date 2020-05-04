package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lvModule;
    TextView tvYear;
    ArrayAdapter moduleAdapter;
    ArrayList<Module> modulesList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvYear = (TextView) findViewById(R.id.tvYear);
        lvModule = this.findViewById(R.id.lvModule);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);

        modulesList = new ArrayList<Module>();
        if(year == "Year 1"){
            modulesList.add(new Module("C208",false));
            modulesList.add(new Module("C200",true));
            modulesList.add(new Module("C346",false));
        }
        else if (year == "Year 2"){
            modulesList.add(new Module("C208",false));
            modulesList.add(new Module("C200",true));
            modulesList.add(new Module("C346",false));
        }
        else {
            modulesList.add(new Module("C208",false));
            modulesList.add(new Module("C200",true));
            modulesList.add(new Module("C346",false));
        }

        moduleAdapter = new ModuleAdapter(this,R.layout.activity_second,modulesList);
        lvModule.setAdapter(moduleAdapter);





    }



}
