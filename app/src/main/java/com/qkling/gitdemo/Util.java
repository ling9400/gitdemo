package com.qkling.gitdemo;

/**
 * Created by qk on 2016/12/21.
 */

public class Util {
    public static boolean isNullOrEmpty(String s){
        if(s == null || s.length() == 0){
            return true;
        }
        return false;
    }
}
