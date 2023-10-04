package Arrays;

import java.util.Arrays;

public class Arrays_Ex01 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getWeekends("long")));
        System.out.println(Arrays.toString(getWeekends("short")));
    }

    public static String [] getWeekends (String format) {
        String[] weekendsLong = {"saturday", "sunday"};
        String[] weekendsShort = {"sat", "sun"};
        if (format.equals("short")) {
            return weekendsShort;
        } else {
            return weekendsLong;
        }
    }
}
