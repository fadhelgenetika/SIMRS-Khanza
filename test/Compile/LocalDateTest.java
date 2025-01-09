package Compile;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.joda.time.LocalDate;

public class LocalDateTest {
    
    public static void main(String []a) throws Exception {
//        LocalDate date1 = LocalDate.now();
//        LocalDate date2 = date1.minusDays(10);
//        LocalDate date3 = date1.plusDays(10);
//
//        System.err.println(date1);
//        System.err.println(date2);
//        System.err.println(date3);

//        String tgl[] = "2024-06-02".split("-");
//        
//        int tahunR = Integer.parseInt(tgl[0]);
//        int bulanR = Integer.parseInt(tgl[1]);
//        int tanggalR = Integer.parseInt(tgl[2]);
        
//        System.err.println(tahunR);
//        System.err.println(bulanR);
//        System.err.println(tanggalR);
        
        String anu = "2024-06-02";
        Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(anu);  
                
        System.err.println(date1);
    }
}
