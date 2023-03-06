public class Date {
    private int month;
    private int day;
    private int year;
//I think THIS is SIMILAR to SELF in python
    // yep, in many ways
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }
    
    public String toString() {
        String paddedMonth = month < 10 ? "0" + month : "" + month;
        String paddedDay = day < 10 ? "0" + day : "" + day;
        // TODO: need to pad the year also
        return paddedMonth + "/" + paddedDay + "/" + year;
    }
}