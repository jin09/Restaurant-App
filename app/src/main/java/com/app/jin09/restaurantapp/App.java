package com.app.jin09.restaurantapp;

import android.app.Application;

import java.util.HashMap;
import java.util.TreeMap;


public class App extends Application {
        public static String lastUID = null;
        public static HashMap<String,Integer> list = new HashMap<String, Integer>();
        public static TreeMap<String,Integer> tList = new TreeMap<String, Integer>();
        public static void addEddyStone(String EUID,int rssi){
            list.put(EUID,rssi);
        }
}
