package com.gilriz.jbproject2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by michal on 23/06/2016.
 */
public class SqlHelper extends SQLiteOpenHelper {
    public SqlHelper(Context context) {
        super(context, "places.db",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String command=" CREATE TABLE "+DBConstants.TABLENAME+"( "+DBConstants.ID+"   INTEGER PRIMARY KEY AUTOINCREMENT, " +
                " "+DBConstants.Name+" TEXT," +
                " "+DBConstants.Location+" TEXT, "+DBConstants.Icon+" TEXT )";
        db.execSQL(command);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
