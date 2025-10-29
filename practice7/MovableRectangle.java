package practice7;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(double x1, double y1, double x2, double y2, double xSpeed, double ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public void moveUp(){
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    public void moveDown(){
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    public void moveLeft(){
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    public void moveRight(){
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
