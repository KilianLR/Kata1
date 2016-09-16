package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person me = new Person("Kilian", new Date(96, 3, 7));
        System.out.println(me.getName() + " tiene " + me.getAge() + " años.");
    }
    
}
