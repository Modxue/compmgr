package edu.zut.cs.tools;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * create_by Intellij IDEA
 *
 * @author zouguo0212@
 * @package_name edu.zut.cs.tools
 * @description
 * @date 2018/8/29 14:31
 */
public class NowWeek {
    /**
     * 根据开学时间和当前时间得到当前对应的周次
     * @return
     */
    public Integer getNowWeek(){
        DateFormat bf = new SimpleDateFormat("yyyy-MM-dd");
        String startString = "2018-08-20";
        Integer week = 0;
        try {
//            开学日期
            Date startDate = bf.parse(startString);
//            当前时间
            Date endDate = new Date();
            long startTime = startDate.getTime();
            long endTime = endDate.getTime();
            //一天等于多少毫秒：24*3600*1000
            Integer days =(int) ((endTime-startTime)/(24*3600*1000));
//            System.out.println(days);
            week =( days / 7) + 1;
//            System.out.println(week);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return week;
    }
}
