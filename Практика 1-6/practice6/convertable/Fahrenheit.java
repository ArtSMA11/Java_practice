package practice6.convertable;

public class Fahrenheit implements Convertable {
    private double c;

    public Fahrenheit(double c) {
        this.c = c;
    }

    public void convert() {
        c = (c * 9 / 5) + 32;
    }

    @Override
    public String toString() {
        return "Convertor{" +
                "c=" + c +
                '}';
    }
}
