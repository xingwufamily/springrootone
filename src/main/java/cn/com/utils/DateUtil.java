package cn.com.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static String toFormatStr(Date date, String format){
        SimpleDateFormat sf = new SimpleDateFormat(format);
        return sf.format(date);
    }
}
