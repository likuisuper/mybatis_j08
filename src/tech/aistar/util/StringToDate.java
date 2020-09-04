package tech.aistar.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/4 14:20
 */
public class StringToDate {
    public static Date parse(String sdate, String pattern) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat(pattern);
        Date date=sdf.parse(sdate);
        return date;
    }
}
