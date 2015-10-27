package com.genesis.furharmony;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;

/**
 * Created by Genalicious on 10/26/2015.
 */
public class DatabaseHandler extends SQLiteOpenHelper{
    //Database Version
    private static final int DATABASE_VERSION = 1;

    //Database Name
    private static final String DATABASE_NAME = "loginInfo";

    //Login table name
    private static final String TABLE_CREDENTIALS = "credentials";

    //Login table column names
    private static final String KEY_ID = "id";
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";

    public DatabaseHandler(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    //Creating the Tables
    @Override
    public void onCreate(SQLiteDatabase db){
        String CREATE_LOGIN_TABLE = "CREATE TABLE " + TABLE_CREDENTIALS + "("
                + KEY_ID + "INTEGER PRIMARY KEY, " + USERNAME + "TEXT, "
                + PASSWORD + "TEXT, " + ")";
        db.execSQL(CREATE_LOGIN_TABLE);
    }

    //Upgrading an Old Database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        //Drop the older table if it already exists
        db.execSQL("DROP TABLE IF EXIST " + TABLE_CREDENTIALS );

        //Create tables again
        onCreate(db);
    }

}
