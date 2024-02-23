/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package days;

/**
 *
 * @author sivagamasrinivasan
 */
public class Weekdays {
    public void nameOfDay(int dayNumber) {
        for (Day day : Day.values()) {
            if (day.getDayNumber() == dayNumber) {
                System.out.println(day.getName());
                return;
            }
        }
        System.out.println("Invalid day number");
    }
}


