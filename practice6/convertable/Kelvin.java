package practice6.convertable;

public class Kelvin implements Convertable {
    private double c;

    public Kelvin(double c) {
        this.c = c;
    }

    public void convert() {
        c += 273;
    }

    @Override
    public String toString() {
        return "Convertor{" +
                "c=" + c +
                '}';
    }
}
