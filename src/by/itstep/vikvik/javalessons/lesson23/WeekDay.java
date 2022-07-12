package by.itstep.vikvik.javalessons.lesson23;




public class WeekDay {
    private String name;
    private int number;

    public final static WeekDay MONDAY =  new WeekDay("Monday", 1);
    public final static WeekDay TUESDAY =  new WeekDay("Tuesday", 2);
//...

    private WeekDay() {
    }

    private WeekDay(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return name + "(" + number + ")";
    }
}
