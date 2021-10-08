package session2.AnhangB;

import java.time.DayOfWeek;

public class EnumDayClass {

    EnumKomplex.Day day;

    public EnumDayClass(EnumKomplex.Day day) {
        this.day = day;
    }

    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;

            case FRIDAY:
                System.out.println("Fridays are better.");
                break;

            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;

            default:
                System.out.println("Midweek days are so-so.");
                break;
        }

    }




}
