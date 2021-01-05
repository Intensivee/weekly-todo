package org.example.model;

import org.example.util.Constants;

public class Item {
    private String heading;
    private String note;
    private Day day;

    public enum Day {
        Monday(Constants.MONDAY),
        Tuesday(Constants.TUESDAY),
        Wednesday(Constants.WEDNESDAY),
        Thursday(Constants.THURSDAY),
        Friday(Constants.FRIDAY),
        Saturday(Constants.SATURDAY),
         Sunday(Constants.SUNDAY);

        public final String label;
        Day(String label){
            this.label = label;
        }

        @Override
        public String toString() {
            return label;
        }
    }

    public Item() {
    }

    public Item(String heading, String note, Day day) {
        this.heading = heading;
        this.note = note;
        this.day = day;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return  heading;
    }
}
