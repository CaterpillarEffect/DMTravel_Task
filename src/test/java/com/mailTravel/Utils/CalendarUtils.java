package com.mailTravel.Utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarUtils {


    public String calculateDate(String i, Date start){
        int add = Integer.parseInt(i);
        SimpleDateFormat dateformat = new SimpleDateFormat("E/d/MMM/y");
        Calendar caldendar = Calendar.getInstance();
        caldendar.setTime(start);
        caldendar.add(Calendar.DATE,add);
        String Date = dateformat.format(caldendar.getTime());
        return Date;
    }

    public Date confirmDateCal(String date) {

        DateFormat simpleDateFormat = new SimpleDateFormat("E/d/MMM/y");
        date = date.replace(" ","/");
        Date date1 = null;
        try {
            date1 = simpleDateFormat.parse(date);
        } catch (Exception e) {
            System.out.println("there a was a problem parsing the Date");
        }
        return date1;
    }

}
