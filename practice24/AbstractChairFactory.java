package practice24;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair(int age);
    MagicChair createMagicianChair();
    FunctionalChair createFunctionalChair();
}
