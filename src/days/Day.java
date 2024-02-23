/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package days;

/**
 *
 * @author muska
 */
public enum Day {
    MONDAY(1, "Monday"),
    TUESDAY(2, "Tuesday"),
    WEDNESDAY(3, "Wednesday"),
    THURSDAY(4, "Thursday"),
    FRIDAY(5, "Friday"),
    SATURDAY(6, "Saturday"),
    SUNDAY(7, "Sunday");

    private final int dayNumber;
    private final String name;

    Day(int dayNumber, String name) {
        this.dayNumber = dayNumber;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDayNumber() {
        return dayNumber;
    }
}
