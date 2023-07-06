/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package days;

/**
 *
 * @author mahad
 */
public enum AllDays {
     MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7);
}

private final int weekday;
    
    AllDays(int weekday) {
        this.weekday = weekday;
    }
    
    public void dayName(int code) {
        for (AllDays day : AllDays.values()) {
            if (day.weekday == code) {
                System.out.println(day);
            }
        }
    }
}
