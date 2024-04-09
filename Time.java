public class Time {

    private int hour;
    private int minute;

    public void setTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
        // count++;

    }

    public void displaytime() {
        System.out.println(hour + "hour and" + minute + "minute");
    }

    // public void Time()

    public void addTime(Time t) {
        this.hour += t.hour;
        this.minute += t.minute;

        if (this.minute >= 60) {
            this.hour += this.minute / 60;
            this.minute %= 60;
        }
    }
}

class main {
    public static void main(String args[]) {
        Time time1 = new Time();
        Time time2 = new Time();
    }

}
