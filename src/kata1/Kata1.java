package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1996, 3, 7);
        
        Person me = new Person("Kilian", date);
        System.out.println(me.getName() + " tiene " + me.getAge() + " años.");
    }
    
}
