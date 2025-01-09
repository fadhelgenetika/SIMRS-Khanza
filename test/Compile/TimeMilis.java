package Compile;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class TimeMilis {
    public static void main(String []a){
        
        long time = System.currentTimeMillis();
        System.err.println("1702971195000");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        format.setTimeZone(TimeZone.getTimeZone("GMT+7"));
        System.err.println(time);
        
        System.out.println(new Date(time));
        String timeS = format.format(new Date(time));
        System.err.println(timeS);
        

        
        
        Date timeDate = new Date(2023, 10, 19, 14, 24, 22); //TAHUN, BULAN, TANGGAL, JAM, MENIT, DETIK
        long time2 = timeDate.toInstant().toEpochMilli();

//        LocalDateTime localDateTime = LocalDateTime.parse(timeDate,DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss") );
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
//        format2.replace(" ","T");
        format2.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        System.err.println(time2);

        System.err.println(new Date(time2));
        String timeS2 = format2.format(new Date(time2));
        System.err.println(timeS2);
    }
}
