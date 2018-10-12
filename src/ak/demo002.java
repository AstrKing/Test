package ak;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class demo002
{

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        
        System.out.println(sdf.format(cal.getTime()));
        
        cal.add(Calendar.YEAR, 1);
        System.out.println(sdf.format(cal.getTime()));
        
        System.out.println(cal.getTime());
        Date nows=(Date) sdf.parse(sdf.format(cal.getTime())); 
        System.out.println(nows);
    }

}
