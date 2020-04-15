public class LeapYear { // klasa i pola klasy
    int year;

    public LeapYear(int year) {  // konstruktor
        this.year = year;
    }

    public boolean isLeapYear() {
        if (this.year %4 != 0) {
            return false;
        } if (this.year % 100 == 0) {
            return true;
        } if (this.year % 400 != 0) {
            return false;
        } else
            return true;
    }
}
