/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Admin
 */
public class DuongTron {
    private int x;
    private int y;
    private int r;
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getR() {
        return r;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setR(int r) {
        this.r = r;
    }

    public DuongTron(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r*15;
    }
   public void Veduongtron(Graphics2D g)
{
    int xc = 0; int yc = r;
    int f = 1 - r;
    put8pixel(g, xc, yc);
    while (xc < yc)
    {
        if (f < 0) f += (xc << 1) + 3;
        else
        {
            yc--;
            f += ((xc - yc) << 1) + 5;
        }
        xc++;
        put8pixel(g,xc, yc);
    }
}
void put8pixel(Graphics2D g, int xc, int yc)
{
    g.fillOval(xc + x, yc + y,5,5);
    g.fillOval(-xc + x, yc + y,5,5);
    g.fillOval(xc + x, -yc + y, 5,5);
    g.fillOval(-xc + x, -yc + y, 5,5);
    g.fillOval( yc + x, xc + y, 5,5);
    g.fillOval(-yc + x, xc + y, 5,5);
    g.fillOval(yc + x, -xc + y, 5,5);
    g.fillOval(-yc + x, -xc + y, 5,5);
}
}
