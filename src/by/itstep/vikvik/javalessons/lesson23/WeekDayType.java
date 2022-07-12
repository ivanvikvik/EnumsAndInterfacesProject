package by.itstep.vikvik.javalessons.lesson23;

public enum WeekDayType {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3);

    private int number;

    public int getNumber(){
        return number;
    }

    WeekDayType(){

    }

    WeekDayType(int number){
        this.number = number;
    }
}