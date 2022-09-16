package main.java;

import java.util.Calendar;

public class Solution12 {

    public static void main(String[] args) {
        final String diaDaSemana = findDay(9, 15,2022);
        System.out.print("Found --> ".concat(diaDaSemana));
    }

    public static String findDay(int month, int day, int year) {
        String[] weekdays = ",SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY".split(",");

        if (2000 < year && year < 3000){
            Calendar cal = Calendar.getInstance();
            cal.set(year, month-1, day);
            System.out.println("Altered year is :" + cal.getTime());
            return weekdays[cal.get(Calendar.DAY_OF_WEEK)];
        }
        return "Not found";
    }
}
