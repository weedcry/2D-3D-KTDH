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
public class Cabinet {

    private float x;
    private float y;
    private float z;

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Cabinet(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public Point2d ChuyenSang2d() {
        int X = (int) (x - y * (Math.sqrt(2)) / 4);
        int Y = (int) (z - y * (Math.sqrt(2)) / 4);
        Point2d p = new Point2d(X, Y);
        return p;
    }
}
