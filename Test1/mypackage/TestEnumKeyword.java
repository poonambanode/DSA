package mypackage;

enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
public class TestEnumKeyword {
    Day day;

    TestEnumKeyword(Day day) {
        this.day = day;
    }

    public void daysIsLike() {
        switch (day) {
            case MONDAY : System.out.println("Mondays are bad");
                          break;
            case FRIDAY : System.out.println("Fridays are better");
                          break;
            case SATURDAY :
            case SUNDAY : System.out.println("Weekends are best");
                          break;
            default : System.out.println("Weekdats are so - so");
                          break;
        }
    }

    public static void main (String args[] ) {
       TestEnumKeyword t = new TestEnumKeyword(Day.valueOf("SUNDAY"));
       t.daysIsLike();

    }
}
