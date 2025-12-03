package practice24;

public class MagicChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Вы сели на магический стул");
        doMagic();
    }

    public void doMagic() {
        System.out.println("Происходит магия! ✨");
    }
}
