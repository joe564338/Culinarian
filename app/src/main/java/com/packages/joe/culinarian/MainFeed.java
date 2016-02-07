package com.packages.joe.culinarian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
//Feed for just dishes just being retrieved from the database
public class MainFeed extends AppCompatActivity {
    ListView foodView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_feed);
        init();
    }
    private void init(){
        foodView = (ListView) findViewById(R.id.mFoods);

    }
}
