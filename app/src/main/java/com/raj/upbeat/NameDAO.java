package com.raj.upbeat;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class NameDAO {
    private SQLiteDatabase database;
    private final DatabaseHelper dbHelper;

    public NameDAO(Context context) {
        dbHelper = new DatabaseHelper(context);
    }

    public void open() {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    public long insertName(String firstname, String lastname, String email, String phone, String password) {
        ContentValues values = new ContentValues();
        values.put(DatabaseHelper.COLUMN_FIRSTNAME, firstname);
        values.put(DatabaseHelper.COLUMN_LASTNAME, lastname);
        values.put(DatabaseHelper.COLUMN_EMAIL, email);
        values.put(DatabaseHelper.COLUMN_PHONE, phone);
        values.put(DatabaseHelper.COLUMN_PASSWORD, password);
        return database.insert(DatabaseHelper.TABLE_NAME, null, values);
    }
}

