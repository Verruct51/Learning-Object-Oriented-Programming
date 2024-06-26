// Created by 22343019_Alvin Anugerah Pratama

package com.mycompany.latihan21_testmovable;

interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

public class MovablePoint implements Movable {
    private int x;
    private int y;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUp() {
        y--;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}