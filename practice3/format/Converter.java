package practice3.format;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Converter {
    private static final double EUR = 0.85;
    private static final double GBP = 0.74;
    private static final double JPY = 147.70;
    private static final double RUB = 82.50;

    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#,##0.00");

    double usdAmount = scanner.nextDouble();


    String eur = df.format(usdAmount * EUR);
    String gbp = df.format(usdAmount * GBP);
    String jpy = df.format(usdAmount * JPY);
    String rub = df.format(usdAmount * RUB);

    @Override
    public String toString() {
        return "Converter{" +
                "eur=" + eur +
                ", gbp=" + gbp +
                ", jpy=" + jpy +
                ", rub=" + rub +
                '}';
    }
}
