package hardeningcenter.org.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetCurrentDate {

    public GetCurrentDate() {
    }

    public String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public String getDate2() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public String ChangeFormat(String dates){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date sourceDate = null;
        try {
            sourceDate = dateFormat.parse(dates);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        SimpleDateFormat targetFormat = new SimpleDateFormat("yyyy/MM/dd");

        return targetFormat.format(sourceDate);
    }
}
