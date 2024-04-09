class Time {
    private int hour;
    private int minute;

    // Constructor
    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    // Member function to set the time
    public void setTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    // Member function to display the time
    public void displayTime() {
        System.out.printf("%02d:%02d%n", hour, minute);
    }

    // Member function to add time
    public Time addTime(Time otherTime) {
        int newHour = this.hour + otherTime.hour;
        int newMinute = this.minute + otherTime.minute;

        if (newMinute >= 60) {
            newHour += newMinute / 60;
            newMinute %= 60;
        }

        return new Time(newHour, newMinute);
    }

    public void difference(Time d) {
        int m1=this.hours - d.getHours();
        int m2;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create two Time objects
        Time time1 = new Time(9, 30);
        Time time2 = new Time(3, 45);

        // Display the initial times
        System.out.println("Time 1:");
        time1.displayTime();

        System.out.println("Time 2:");
        time2.displayTime();

        // Add the times and store the result in a third Time object
        Time sumTime = time1.addTime(time2);

        // Display the sum of the times
        System.out.println("Sum of Time 1 and Time 2:");
        sumTime.displayTime();
         
    }
}






