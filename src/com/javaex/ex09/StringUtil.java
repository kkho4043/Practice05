package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String[] strArray){
       String arr = "";
       for(int i = 0;i < strArray.length;i++) {
    	   arr += strArray[i];
       }
       return arr;
    }
}
