/**
 * 
 */
package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * @author Administrator
 *
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
	
	public static final String CREATE_PROVINCE= "create table Province ("
			+"id integer primary key autoincrement,"
			+"province_name text,"
			+"province_code text)";
	public static final String CREATE_CITY= "create table City ("
			+"id integer primary key autoincrement,"
			+"city_name text,"
			+"city_code text"
			+"Province_id integer)";
	public static final String CREATE_country= "create table Country ("
			+"id integer primary key autoincrement,"
			+"country_name text,"
			+"country_code text"
			+"City_id integer)";
	

	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO 自动生成的构造函数存根
	}

	/* （非 Javadoc）
	 * @see android.database.sqlite.SQLiteOpenHelper#onCreate(android.database.sqlite.SQLiteDatabase)
	 */
	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_PROVINCE);
		db.execSQL(CREATE_CITY);
		db.execSQL(CREATE_country);
		// TODO 自动生成的方法存根

	}

	/* （非 Javadoc）
	 * @see android.database.sqlite.SQLiteOpenHelper#onUpgrade(android.database.sqlite.SQLiteDatabase, int, int)
	 */
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO 自动生成的方法存根

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
