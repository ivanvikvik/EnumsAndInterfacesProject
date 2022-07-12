package by.itstep.vikvik.javalessons.lesson23;

class A {
    public final static int number = 10;
}

public class Main {
    public static void main(String[] args) {
//        Flower flower = new Flower(10, ColorType.BLUE);
//        flower.setColor(ColorType.GREEN);

        ColorType[] types = ColorType.values();

        for (int i = 0; i < types.length; i++) {
            System.out.println(types[i].name() + " - " + types[i].ordinal());
        }

        WeekDayType dayType = WeekDayType.MONDAY;

        System.out.println(dayType.getNumber());

        System.out.println();
    }
}
