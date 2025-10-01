package practice3;

import java.util.*;

public class Random {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        ArrayList<Double> list1 = new ArrayList<>();
        ArrayList<Double> list2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            double num = random.nextDouble(10);
            list1.add(num);
            list2.add(Math.random());
        }
        System.out.println(list1);
        System.out.println(list2);
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(list1);
        System.out.println(list2);


    }
}
