package com.raj.upbeat.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.raj.upbeat.model.Signup;

import com.raj.upbeat.Params.Params;

import java.util.ArrayList;
import java.util.List;

public class MyDbHandler extends SQLiteOpenHelper {
    public MyDbHandler(Context context) {

        super(context, Params.DB_NAME, null, Params.DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String create = "CREATE TABLE" + Params.TABLE_NAME + "(" + Params.KEY_MOBILE + "VARCHAR PRIMARY KEY," +Params.KEY_EMAIL +"VARCHAR," +Params.KEY_FIRST +"TEXT," +Params.KEY_LAST +"TEXT," +Params.KEY_PASSWORD +"VARCHAR"+")";
        Log.d("dbraj", "Query being run is : "+create);
        db.execSQL(create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void addSignup(Signup signup){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Params.KEY_FIRST, signup.getfirstname());
        values.put(Params.KEY_LAST, signup.getlastname());
        values.put(Params.KEY_EMAIL, signup.getemail());
        values.put(Params.KEY_MOBILE, signup.getmobile());
        values.put(Params.KEY_PASSWORD, signup.getpassword());

        db.insert(Params.TABLE_NAME, null, values);
        Log.d("dbraj", "Successfully Inserted");
        db.close();
    }
//    public List<Signup> getAllSignup(){
//        List<Signup> signupList = new ArrayList<>();
//        SQLiteDatabase db = this.getReadableDatabase();
//
//        // Generate the query to read from the database
//        String select = "SELECT * FROM " +Params.TABLE_NAME;
//        Cursor cursor = db.rawQuery(select, null);
//
//        // L
//    }
}
