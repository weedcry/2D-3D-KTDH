/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ve3d;

/**
 *
 * @author KHIEM PC
 */
public class Point2d {
    private int x;
    private int y;

    public Point2d(int x, int y) {
        this.x = 400 + 5*x;
        this.y = 350 - 5*y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

   
  
}
