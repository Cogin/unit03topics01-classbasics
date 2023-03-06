public class TimeV1 {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeV1(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public String toString() {
        String paddedminutes = minutes < 10 ? "0" + minutes : "" + minutes;
        String paddedseconds = seconds < 10 ? "0" + seconds : "" + seconds;
        return hours + ":" + paddedminutes + ":" + paddedseconds;
}
}
// good