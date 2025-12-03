package practice24;

public class FunctionalChair implements Chair{
    @Override
    public void sit() {
        System.out.println("Вы сели на функциональный стул");
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
