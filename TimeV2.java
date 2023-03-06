public class TimeV2 {
    private int secondssincemidnight;



    public TimeV2(int hours, int minutes, int seconds) {
        secondssincemidnight = hours * 3600 + minutes * 60 + seconds;
    }

    public int getHours() {
        return secondssincemidnight / 3600;
    }

    public int getMinutes() {
        return secondssincemidnight % 3600 / 60;
    }

    public int getSeconds() {
        return secondssincemidnight % 60 ;
    }

    public String toString() {
        String paddedminutes = getMinutes() < 10 ? "0" + getMinutes() : "" + getMinutes();
        String paddedseconds = getSeconds() < 10 ? "0" + getSeconds() : "" + getSeconds();
        return getHours() + ":" + paddedminutes + ":" + paddedseconds;
}
// NOTE: please include code in a 'main' method that demonstrates your methods, so I can quickly test it by running that
}