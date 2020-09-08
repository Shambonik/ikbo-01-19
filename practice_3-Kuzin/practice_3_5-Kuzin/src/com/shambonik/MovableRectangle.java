package com.shambonik;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    private boolean identicalxSpeed(){
        return (topLeft.getxSpeed() == bottomRight.getxSpeed());
    }

    private boolean identicalySpeed() {
        return (topLeft.getySpeed() == bottomRight.getySpeed());
    }


    @Override
    public void moveUp() {
        if(identicalySpeed()){
            topLeft.moveUp();
            bottomRight.moveUp();
        }
        else System.out.println("Скорости по y не равны");
    }

    @Override
    public void moveDown() {
        if(identicalySpeed()){
            topLeft.moveDown();
            bottomRight.moveDown();
        }
        else System.out.println("Скорости по y не равны");
    }

    @Override
    public void moveLeft() {
        if(identicalxSpeed()){
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
        else System.out.println("Скорости по x не равны");
    }

    @Override
    public void moveRight() {
        if(identicalxSpeed()){
            topLeft.moveRight();
            bottomRight.moveRight();
        }
        else System.out.println("Скорости по x не равны");
    }
}
