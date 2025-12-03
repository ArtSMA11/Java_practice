package practice25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void extractPrices(String text){
        String regex = "\\d+(?:\\.\\d+)?\\s+(USD|RUB|EU)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println("Цена: " + matcher.group());
        }
    }

    public static void main(String[] args) {
        String text = "25.98 USD, 1000 RUB, 44 ERR, 0.004 EU, 150.50 JPY";
        extractPrices(text);
    }
}
