package curs.pkg5;

import test.classes1.Example;
import java.net.URL;
import static java.lang.Integer.*;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Curs5 {

    public static void main(String[] args) {
        
        
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.mm.dd");
    sdf.setLenient(true);
    Date date = null;
    try {
      date = sdf.parse("2012.11.02.45.65");
    } catch (ParseException e) {
      e.printStackTrace();
    }
    // Output: date: Mon Jan 02 00:11:00 FET 2012
    System.out.println("date: " + date);
        

//        YearMonth ym = YearMonth.of(2000, 2);
//        
//        
//        Period p = Period.ofYears(3).withMonths(4).withDays(15);//ok
//        
//        Period c = Period.ofYears(3).plusMonths(4).plusDays(15);//ok
//        
//        Period b = Period.ofYears(3).ofMonths(4).ofDays(15);//ok
//        
//        LocalDate d1 = LocalDate.of(2016,1,1);
//        LocalDate d2 = LocalDate.of(2018,1,1);
//        
//        Period s = Period.between(d1, d2);
//         Period v = Period.until(d1, d2); //nu
//
//        //Period p = Period.ofYears(3);//ok
//        YearMonth ym0 = ym.plus(p);
//        System.out.println(ym0);
//
////      YearMonth ym1 = Year.plus(3).of(ym);
////        YearMonth ym2 = ym.withYears(3);
//        YearMonth ym3 = ym.plusYears(3);//ok
//        System.out.println(ym3);
//
////        Duration d = Duration.ofYears(3);
////        YearMonth ym4 = ym.of(d);
////----------------------------------------------------------------
//        Example e = new Example();
//
//        LocalDate d = LocalDate.of(2016, 8, 12);
//        String a = "dd MMM YYYY";
//        System.out.println(d.format(DateTimeFormatter.ofPattern(a)));
//
//        System.out.println("--------------------");
//        LocalDate y = LocalDate.of(2016, 1, 14);
//        System.out.println(y);
//
//        System.out.println("--------------------");
//        Curs5 c = new Curs5();
//        Class cls = c.getClass();
//        URL url = cls.getResource("file.txt");
//        System.out.println("Value = " + url);
//
//        // finds resource relative to the class location
//        url = cls.getResource("newfolder/a.txt");
//        System.out.println("Value = " + url);
//
//        //1.obtinerea referintei catre obiectul class dorit in cadrul unei metode de instanta
//        URL u = Curs5.class.getResource("../xml/two-doves.png");//relativa
//        System.out.println(u);
//        URL u1 = Curs5.class.getResource("/curs/xml/two-doves.png");//absoluta
//        System.out.println(u1);
//
//        ExDataOra a = new ExDataOra();
//        a.getClassEx();
//
//        ExDataOra.exTime();
//        //-----------------------------------
//        LocalDate.of(2016, 1, 14).atTime(LocalTime.of(11, 23, 51));
//        //LocalDate.of(2016, 1, 14).until(LocalTime.of(11, 23, 51));//nu
//        Year.of(2016).atMonth(Month.JANUARY).atDay(14).atTime(LocalTime.of(11, 23, 51));
//        //LocalDate.from(2016, 1, 14).with(LocalTime.of(11, 23, 51));//nu
//        LocalDateTime.of(2016, 1, 14, 11, 23, 51);
//        new LocalDateTime(2016, 1, 14, 11, 23, 51);//nu
//-------------------------------------------------
       // Month x = LocalDateTime.now().getMonth();//da
//        Month x = Duration.now().getMonth();
//Month x = LocalDate.now().getMonth();//da
//Month x = YearMonth.now().getMonth();//da
//Month x = Period.now().getMonth();
//Month x = Month.now().getMonth();
//Month x = MonthDay.now().getMonth();//da
//System.out.println(x);
 //Month x = Year.now().getMonth();  
 
 
 
// LocalDate id = LocalDate.now();
// System.out.println("local date now" + LocalDateTime.now());
//        
// System.out.println(MAX_VALUE-1);//ok
//System.out.println(valueOf(MAX_VALUE));//ok
//// Integer i = new Integer(PI);
//System.out.println(parseInt("16"));//ok
//// System.out.println(intValue("5"));
    }

}
