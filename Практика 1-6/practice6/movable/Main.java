package practice6.movable;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 2, 5);
        MovableCircle circle = new MovableCircle(3, 5, 1, 4, 2);
        MovableRectangle rectangle = new MovableRectangle(1, 5, 2, -2, 3, 6);

        System.out.println(point);
        point.moveRight();
        point.moveUp();
        System.out.println(point);

        System.out.println();

        System.out.println(circle);
        circle.moveLeft();
        circle.moveDown();
        System.out.println(circle);

        System.out.println();

        System.out.println(rectangle);
        rectangle.moveDown();
        rectangle.moveRight();
        System.out.println(rectangle);
    }
}
