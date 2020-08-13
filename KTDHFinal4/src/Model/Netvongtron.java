/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Graphics2D;

/**
 *
 * @author Admin
 */
public class Netvongtron {
    private int x;
    private int y;
    private int r;
    private int xet;

  
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

    public Netvongtron(int x, int y, int r, int xet) {
        this.x = x;
        this.y = y;
        this.r = r*15;
        this.xet= xet;
    }
   public void VeNetvongtron(Graphics2D g)
{
    int xc = 0; int yc = r;
    int f = 1 - r;
    putpixel(g, xc, yc);
    while (xc < yc)
    {
        if (f < 0) f += (xc << 1) + 3;
        else
        {
            yc--;
            f += ((xc - yc) << 1) + 5;
        }
        xc++;
        putpixel(g,xc, yc);
    }
}
void putpixel(Graphics2D g, int xc, int yc)
{
    if(xet == 1){
    g.fillOval(xc + x, -yc + y, 5,5);
    g.fillOval(-xc + x, -yc + y, 5,5);
    }
    if( xet == 2){
    g.fillOval( yc + x, xc + y, 5,5);
    g.fillOval(yc + x, -xc + y, 5,5);
    }
    if( xet == 3){
    g.fillOval(xc + x, yc + y,5,5);
    g.fillOval(-xc + x, yc + y,5,5);
    }
    if( xet == 4){
    
    g.fillOval(-yc + x, -xc + y, 5,5);
    g.fillOval(-yc + x, xc + y, 5,5);
    }

}
}
