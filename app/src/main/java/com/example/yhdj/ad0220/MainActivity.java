package com.example.yhdj.ad0220;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private Myadapter mMyadapter;
    private List<Dog> mDogList = new ArrayList<Dog>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDogList();
        initView();
    }

    private void initView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
//        LinearLayoutManager manager = new LinearLayoutManager(this);
//        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
       // GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3);
       StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        mMyadapter = new Myadapter(mDogList);
        mRecyclerView.setLayoutManager(staggeredGridLayoutManager);
        mRecyclerView.setAdapter(mMyadapter);

    }

    private void initDogList() {
        mDogList.add(new Dog("dog1",R.drawable.dog1));
        mDogList.add(new Dog("dog2",R.drawable.dog2));
        mDogList.add(new Dog("dog3",R.drawable.dog3));
        mDogList.add(new Dog("dog4",R.drawable.dog4));
        mDogList.add(new Dog("dog5",R.drawable.dog5));
        mDogList.add(new Dog("dog6",R.drawable.dog6));
        mDogList.add(new Dog("dog7",R.drawable.dog7));
        mDogList.add(new Dog("dog8",R.drawable.dog8));
        mDogList.add(new Dog("dog9",R.drawable.dog9));
        mDogList.add(new Dog("dog10",R.drawable.dog10));


    }
}
