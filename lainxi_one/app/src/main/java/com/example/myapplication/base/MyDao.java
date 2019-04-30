package com.example.myapplication.base;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.myapplication.bean.Bean;

import java.util.ArrayList;
import java.util.List;

public class MyDao {
    private MyDB  myDB;

    public MyDao(Context context) {
        myDB = new MyDB(context);
    }

    public void insert(ContentValues values){
        SQLiteDatabase db = myDB.getWritableDatabase();
        db.insert("message",null,values);
        db.close();
    }

    public List<Bean.ResultBean> getData(){
        SQLiteDatabase db = myDB.getReadableDatabase();
        Cursor cursor = db.query("message", null, null, null, null, null, null);
        List<Bean.ResultBean> list = new ArrayList<>();
        while (cursor.moveToNext()){
            Bean.ResultBean bean = new Bean.ResultBean();
            String title = cursor.getString(cursor.getColumnIndex("title"));
            String content = cursor.getString(cursor.getColumnIndex("content"));
            String authors = cursor.getString(cursor.getColumnIndex("authors"));
            bean.setTitle(title);
            bean.setContent(content);
            bean.setAuthors(authors);
            list.add(bean);
        }
        db.close();
        return list;
    }
}
