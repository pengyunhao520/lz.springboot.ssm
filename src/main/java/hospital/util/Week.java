package hospital.util;

import org.apache.jasper.tagplugins.jstl.core.If;

public class Week {
    public String weekDay(int weekNumber){
        final String MONDAY="星期一"; //星期一
        final String TUESDAY="星期二";//星期二
        final String WEDNESDAY="星期三"; //星期三
        final String THURSDAY="星期四"; //星期四
        final String FRIDAY="星期五"; //星期五
        final String SATURDAY="星期六"; //星期六
        final String SUNDAY="星期日"; //星期日'
        String weekDay;
        switch(weekNumber)
        {
            case 1 :
                weekDay=SUNDAY;
                break;
            case 2 :
                weekDay=MONDAY;
                break;
            case 3 :
                weekDay=TUESDAY;
                break;
            case 4 :
                weekDay=WEDNESDAY;
                break;
            case 5 :
                weekDay=THURSDAY;
                break;
            case 6 :
                weekDay=FRIDAY;
                break;
            case 7 :
                weekDay=SATURDAY;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + weekNumber);
        }
     return weekDay;
    }

}
