package com.example.techgadgetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] gadgets = {"Macbook Pro", "iPhone 11 Pro", "Apple TV", "Airpods", "Apple Watch 4"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.appleproducts, gadgets));
    }



    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position){
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }
}
