package com.betelgeuse;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    private static String dateFormatPattern = "yyyy-MM-dd HH:mm:ss";
    private static String dateFormatPattern2 = "    yyyy-MM-dd";


    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat ISO_8601_FORMAT = new SimpleDateFormat(dateFormatPattern2);
        ISO_8601_FORMAT.setTimeZone(TimeZone.getTimeZone("GMT"));
        String now = ISO_8601_FORMAT.format(date);
        //System.out.printf(now);
        /*-------------------------------------------------------------------*/
        Calendar calendar = Calendar.getInstance();
        String timeZone = calendar.getTimeZone().getDisplayName();
        //System.out.println(timeZone); // turkey Time
        //System.out.println(calendar.getWeekYear());  //2022
        //System.out.println(calendar.getTime()); // Fri Mar 18 18:21:32 TRT 2022
        //System.out.println(new Date(2022, 03, 17));
        /*-----------------------------------------------------------------*/
        String dateForCheck = "2022-03-19";

        String year = dateForCheck.split("-")[0];
        String month = dateForCheck.split("-")[1];
        String dayOfMonth = dateForCheck.split("-")[2];
        Date _date = new Date(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(dayOfMonth));
        System.out.println(_date.getYear());

        DateFormat dateFormat = new SimpleDateFormat(dateFormatPattern2);
        dateFormat.setLenient(false);
        //Date date1 = null;
        try {

            Date   date1 = dateFormat.parse(dateForCheck);
            System.out.println(date1);
            System.out.println(date1.getYear());
        } catch (ParseException e) {
            System.out.println(e.getLocalizedMessage());
        }

        /*-------------------------ConvertLocalDateToUTC----------------------*/
        Date date2 = new Date();
        date2.setTime(date2.getTime()+date2.getTimezoneOffset()*1000*60);
        //System.out.println(date2);


    }
}
