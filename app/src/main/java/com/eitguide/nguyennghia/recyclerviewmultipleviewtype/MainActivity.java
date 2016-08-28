package com.eitguide.nguyennghia.recyclerviewmultipleviewtype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private RecyclerView rvMultipleViewType;
    private List<Object> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMultipleViewType = (RecyclerView) findViewById(R.id.rv_multipe_view_type);
        mData = new ArrayList<>();

        mData.add(new User("Nguyen Van Nghia", "Quan 11"));
        mData.add(R.drawable.avatar_1);
        mData.add("Text 0");
        mData.add("Text 1");
        mData.add(new User("Nguyen Hoang Minh", "Quan 3"));
        mData.add("Text 2");
        mData.add(R.drawable.avatar_2);
        mData.add(R.drawable.avatar_3);
        mData.add(new User("Pham Nguyen Tam Phu", "Quan 10"));
        mData.add("Text 3");
        mData.add("Text 4");
        mData.add(new User("Tran Van Phuc", "Quan 1"));
        mData.add(R.drawable.avatar_4);
        mData.add(R.drawable.avatar_5);
        mData.add("Text 5");
        mData.add(new User("Nguyen Ngoc Tien", "Quan 11"));
        mData.add(R.drawable.avatar_6);

        CustomAdapter adapter = new CustomAdapter(this, mData);
        rvMultipleViewType.setAdapter(adapter);
        rvMultipleViewType.setLayoutManager(new LinearLayoutManager(this));



    }
}
