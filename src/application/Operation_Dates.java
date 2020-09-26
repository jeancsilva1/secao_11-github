package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Operation_Dates {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        //Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        Date d = new Date();
        System.out.println(sdf.format(d));
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        //get instance of minute
        int minutes = cal.get(Calendar.MINUTE);
        //get instance of month
        int month = 1 + cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        System.out.println(cal.getTime());
        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
    }

}
