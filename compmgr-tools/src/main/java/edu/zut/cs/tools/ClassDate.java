package edu.zut.cs.tools;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * create_by Intellij IDEA
 *
 * @author zouguo0212@
 * @package_name edu.zut.cs.tools
 * @description
 * @date 2018/9/1 14:45
 */
public class ClassDate {
    public Calendar getClassDate(Integer week, Integer day){
        DateFormat bf = new SimpleDateFormat("yyyy-MM-dd");
        String startString = "2018-08-20";
        Date startDate = null;
        try {
            startDate = bf.parse(startString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        calendar.add(Calendar.DAY_OF_MONTH, (week - 1) * 7 + day - 1);
        return  calendar;
    }
}
