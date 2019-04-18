

package curs.pkg5;

import java.net.URL;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;




public class ExDataOra {
    
     public void getClassEx(){
            URL u = this.getClass().getResource("../xml/two-doves.png");//relativa
                  URL u1 = Curs5.class.getResource("/curs/xml/two-doves.png");//absoluta
           System.out.println("---------");        
        System.out.println(u);
        
         System.out.println(u1);
        }
    
    public static void exTime(){
        
        
        
        //ora, minut, secunda, nanosecunda
       LocalTime lt1 = LocalTime.of(12,53,24, 50);
        System.out.println(lt1);
        
        
        
        //an, luna, zi, ora, minut, sce
        System.out.println(LocalDateTime.now());
        
        //data curenta
        System.out.println(LocalDate.now());
        
        System.out.println(Year.of(2018));
        
        
        
        
        MonthDay y = MonthDay.now();
        System.out.println(y);
        
        YearMonth m = YearMonth.of(2018, Month.MARCH);
        System.out.println(m.getYear());       
        
        
        
        
        
        
    }
    


        
    }
    
    
