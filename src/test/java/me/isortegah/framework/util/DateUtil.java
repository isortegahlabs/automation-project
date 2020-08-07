package me.isortegah.framework.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static String getCurrentDate(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.S");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static String getCurrentDate(String className){
        return className + " -> "+ getCurrentDate();
    }
}
