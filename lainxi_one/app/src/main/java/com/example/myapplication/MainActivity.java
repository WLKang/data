package com.example.myapplication;

import android.content.ContentValues;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.myapplication.base.MyDao;
import com.example.myapplication.bean.Bean;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private RecyclerView RecyclerView;
    private MyAdapter adapter;
    private List<Bean.ResultBean> list = new ArrayList<>();
    private SwipeRefreshLayout main_swipeRefreshLayout;
     int page = 0;
     private MyDao myDao = new MyDao(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        initRefresh();
    }

    private void initRefresh() {
       main_swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
           @Override
           public void onRefresh() {
             new Handler().postDelayed(new Runnable() {
                 @Override
                 public void run() {
                     initData();
                     main_swipeRefreshLayout.setRefreshing(false);

                     Log.i("Taga","page"+page);
                     Log.i("Taga","刷新完成");
                 }
             },150);
           }
       });
    }

    private void initData() {
        page++;
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.apiopen.top/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RetorfitService retorfitService = retrofit.create(RetorfitService.class);
        Call<Bean> call = retorfitService.call(page);
        call.enqueue(new Callback<Bean>() {
            @Override
            public void onResponse(Call<Bean> call, Response<Bean> response) {
                Log.i("Taga","返回的值"+response.code());
                if (response.code() == 200){
                    list = response.body().getResult();
                    adapter.Refresh(list);
                    ContentValues values = new ContentValues();
                    for (int i = 0; i < list.size(); i++){
                        values.put("title",list.get(i).getTitle());
                        values.put("content",list.get(i).getContent());
                        values.put("authors",list.get(i).getAuthors());
                        myDao.insert(values);
                        Log.i("wangkling",list.get(i).getTitle());
                        Log.i("wangkling","存储成功");
                    }
                }
            }

            @Override
            public void onFailure(Call<Bean> call, Throwable t) {

                adapter.Refresh(myDao.getData());
            }
        });
    }

    private void initView() {
        main_swipeRefreshLayout = findViewById(R.id.main_swipeRefreshLayout);
        RecyclerView = findViewById(R.id.main_recyclerView);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        RecyclerView.setLayoutManager(manager);
        adapter = new MyAdapter();
        RecyclerView.setAdapter(adapter);
    }
}
