/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ve2D;

/**
 *
 * @author Admin
 */
public class Point1 {

    private int x; // toa do diem 1
    private int y; // toa do diem 1

    public int getX() {
        return 15 * x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return 750 - 15 * y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getREALX() {
        return x;
    }

    public int getREALY() {
        return y;
    }

    public Point1() {
    }

    public Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    

}
