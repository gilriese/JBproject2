package com.gilriz.jbproject2;

import android.content.ContentValues;
import android.content.Context;

/**
 * Created by michal on 24/06/2016.
 */
public class DbHelper {
    Context context;
    public DbHelper(Context context) {
        this.context=context;
    }
public void addPlace (Place p)
{
SqlHelper mySQLHelper= new SqlHelper(context);

    ContentValues cv= new ContentValues();

    cv.put(DBConstants.Location, p.getLocation());
    cv.put(DBConstants.Address, p.getAddress());
    cv.put(DBConstants.Icon, p.getIcon());
    cv.put(DBConstants.Name, p.getName());

    mySQLHelper.getWritableDatabase().insert(DBConstants.TABLENAME, null, cv);

}


}
