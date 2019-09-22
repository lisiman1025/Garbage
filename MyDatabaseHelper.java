package com.example.garbage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDatabaseHelper  extends SQLiteOpenHelper {
    public  static final String Garbage= "create table Garbage("
            +"id integer primary key autoincrement,"
            +"recycle text,"
            +"wet text,"
            +"harmful text,"
            +"dry text)";
    private  Context mContext;
    public MyDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Garbage);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
