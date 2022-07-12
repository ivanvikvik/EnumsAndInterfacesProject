package by.itstep.vikvik.javalessons.lesson23;

public interface Figure {
    void draw();

    void start();

    void run();

    void stop();
}

class Square implements Figure {
    public void draw() {
        System.out.println("It's being draw square...");
    }

    public void start() {

    }

    public void run() {

    }

    public void stop() {

    }
}

class Test {
    public static void main(String[] args) {
        Figure figure = new Figure();

        Figure square = new Square();
        square.draw();

    }
}
