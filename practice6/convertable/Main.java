package practice6.convertable;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double c = scanner.nextDouble();
        System.out.println("Температура в Цельсиях = " + c);

        Kelvin kelvin = new Kelvin(c);
        Fahrenheit fahrenheit = new Fahrenheit(c);

        fahrenheit.convert();
        System.out.println("Теператуоа в Фаренгейтах = " + fahrenheit);

        kelvin.convert();
        System.out.println("Теператуоа в Кельвинах = " + kelvin);

    }
}
