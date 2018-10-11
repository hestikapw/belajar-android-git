package com.amikom.simpleaplication;


import android.content.Context;
import android.content.SharedPreferences;

public class PreferencesHelper {
    private  static PreferencesHelper INSTANCE;
    private SharedPreferences sharedPreferences;


    private PreferencesHelper(Context context){
        sharedPreferences = context
                .getApplicationContext()
                .getSharedPreferences("simple.android.app",Context.MODE_PRIVATE);
    }
    public static PreferencesHelper getInstance(Context context){
        if (INSTANCE == null){
            INSTANCE = new PreferencesHelper(context);
        }
        return INSTANCE;
    }
    public  SharedPreferences Pref(){
        return sharedPreferences;
    }
    public Boolean isLogin(){
        return sharedPreferences.getBoolean("isLogin",false);
    }
    public void  setLogin(boolean isCall){
        sharedPreferences.edit().putBoolean("isLogin",isCall).apply();
    }
    public void setName (String isName){
        sharedPreferences.edit().putString("isName",isName).apply();

    }
    private String getName(){
        return sharedPreferences.getString("isName","");
    }
}