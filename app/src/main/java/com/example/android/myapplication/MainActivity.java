package com.example.android.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Activity has started");

        ListView mlistView = (ListView) findViewById(R.id.listview);

        Person john = new Person("John", "12-10-1998", "Male");
        Person stacy = new Person("Stacy", "12-10-1998", "Female");
        Person steve = new Person("Steve", "12-10-1998", "Male");
        Person sam = new Person("Sam", "12-10-1998", "Male");
        Person matt = new Person("Matt", "12-10-1998", "Male");

        List<Person> peopleList = new ArrayList<>();
        peopleList.add(john);
        peopleList.add(stacy);
        peopleList.add(sam);
        peopleList.add(steve);
        peopleList.add(matt);

        PersonListAdapter adapater = new PersonListAdapter(this, R.layout.list_item_layout, peopleList);
        mlistView.setAdapter(adapater);
    }



}
